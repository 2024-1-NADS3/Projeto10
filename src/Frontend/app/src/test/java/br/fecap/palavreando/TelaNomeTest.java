package br.fecap.palavreando;

import junit.framework.TestCase;

import org.junit.Test;

public class TelaNomeTest extends TestCase {

    private TelaNome telanome;

    public String validaNome(String nome) {
        String resposta;

        if (nome.length() > 15 || nome.isEmpty()) {
            resposta = "nome invalido";
        } else {
            resposta = "nome valido";
        }
        return resposta;
    }

    public void testValidaNome() {
        // Teste com nome valido
        assertEquals("nome valido", validaNome("eduardo"));

        // Teste com nome invalido
        assertEquals("nome invalido", validaNome(""));

        // Teste com nome invalido
        assertEquals("nome invalido", validaNome("eduardo fraga alves dos santos"));
    }

    @Test
    public void testVerificarSeBotaoConfirmarEstaHabilitado() {
        // Verificar se o botão está habilitado
        boolean isButtonEnabled = telanome.verificarSebotaoConfirmarEstaHabilitado();
        assertTrue(isButtonEnabled);
    }

}