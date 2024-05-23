package br.fecap.palavreando;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/// testando formulario de data

public class TelaIdadeTest {
    public String validaDatas(int dia, int mes, int ano) {
        String resposta;
        if (dia > 31 || dia < 1 || mes > 12 || mes < 1 || ano > 2020 || ano < 1900) {
            resposta = "data invalida";
        } else {
            resposta = "data valida";
        }
        return resposta;
    }
    @Test
    public void testValidaDatas() {

        // Teste com uma data válida
        assertEquals("data valida", validaDatas(10, 1, 2001));

        // Teste com dia inválido
        assertEquals("data invalida", validaDatas(32, 1, 2001));

        // Teste com mês inválido
        assertEquals("data invalida", validaDatas(10, 13, 2001));

        // Teste com ano inválido (muito alto)
        assertEquals("data invalida", validaDatas(10, 1, 2021));

        // Teste com ano inválido (muito baixo)
        assertEquals("data invalida", validaDatas(10, 1, 1899));

        // Teste com dia menor que 1
        assertEquals("data invalida", validaDatas(0, 1, 2001));

        // Teste com mês menor que 1
        assertEquals("data invalida", validaDatas(10, 0, 2001));
    }
}
