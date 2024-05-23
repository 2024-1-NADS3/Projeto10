/** Importa a função 'openDb' do arquivo '../configDB.js' */
import { openDb } from "../configDB.js";
import crypto from "crypto";

/**  Chave e IV (vector de inicialização) fixos (apenas para exemplo) */
/**  Em produção, armazene esses valores de maneira segura */
const ENCRYPTION_KEY = Buffer.from(
  "12345678901234567890123456789012",
); /** 32 bytes (256 bits) */
const IV = Buffer.from("1234567890123456"); /**  16 bytes (128 bits) */

function encrypt(text) {
  let cipher = crypto.createCipheriv("aes-256-cbc", ENCRYPTION_KEY, IV);
  let encrypted = cipher.update(text);
  encrypted = Buffer.concat([encrypted, cipher.final()]);
  return IV.toString("hex") + ":" + encrypted.toString("hex");
}

/**  Define uma função assíncrona 'selectPalavras' para manipular requisições HTTP */
export async function selectPalavras(req, res) {
  /**  Obtém os dados da palavra da requisição */
  let palavra = req.body;

  /**  Abre a conexão com o banco de dados usando a função 'openDb' */
  openDb().then((db) => {
    /**  Executa uma consulta para obter todas as palavras da tabela 'Palavras' */
    db.all("SELECT * FROM Palavras").then((resultados) => {
      /**  Retorna os resultados da consulta como resposta */
      res.json(resultados);
    });
  });
}

export async function insertPalavra(req, res) {
  let { palavra, dica } = req.body;

  console.log("Received request to insert palavra:", palavra);

  // Criptografando a palavra e a dica
  let encryptedPalavra = encrypt(palavra);
  let encryptedDica = encrypt(dica);

  try {
    const db = await openDb();
    console.log("Database connection opened");

    db.run(
      "INSERT INTO palavras (palavra, dica) VALUES (?, ?)",
      [encryptedPalavra, encryptedDica],
      function (err) {
        if (err) {
          console.error("Error running INSERT statement:", err);
          return res.status(500).json({ error: err.message });
        }

        console.log("INSERT statement successful, lastID:", this.lastID);

        res.json({ message: "Palavra inserida com sucesso!", id: this.lastID });

        db.close((closeErr) => {
          if (closeErr) {
            console.error("Error closing the database:", closeErr);
          } else {
            console.log("Database connection closed");
          }
        });
      },
    );
  } catch (err) {
    console.error("Error in openDb:", err);
    res.status(500).json({ error: err.message });
  }
}

export function deletePalavra(req, res) {
  let { id } = req.params;

  console.log("Received request to delete palavra with id:", id);

  openDb()
    .then((db) => {
      console.log("Database connection opened");

      db.run("DELETE FROM palavras WHERE id = ?", [id], function (err) {
        if (err) {
          console.error("Error running DELETE statement:", err);
          return res.status(500).json({ error: err.message });
        }

        console.log("DELETE statement successful, changes:", this.changes);

        if (this.changes === 0) {
          return res.status(404).json({ message: "Palavra não encontrada" });
        }

        res.json({ message: "Palavra excluída com sucesso!" });

        db.close((closeErr) => {
          if (closeErr) {
            console.error("Error closing the database:", closeErr);
          } else {
            console.log("Database connection closed");
          }
        });
      });
    })
    .catch((err) => {
      console.error("Error in openDb:", err);
      res.status(500).json({ error: err.message });
    });
}
