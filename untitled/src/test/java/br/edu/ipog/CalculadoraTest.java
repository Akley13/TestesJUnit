package br.edu.ipog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSoma() {
        Calculadora calcular = new Calculadora();
        assertEquals(5, calcular.somar(2, 3));
    }
}