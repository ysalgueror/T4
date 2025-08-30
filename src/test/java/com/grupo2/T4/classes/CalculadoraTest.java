package com.grupo2.T4.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Aqui probamos la funcionalidad Calculadora")
public class CalculadoraTest {
    private Calculadora Operaciones;

    @BeforeEach
    public void setUp(){
        Operaciones=new Calculadora();
    }

    @Test
    public void testSuma(){
        int resultado = Operaciones.sumar(4, 4);
        assertEquals(8, resultado);
    }

    @Test
    public void testRestar(){
        int resultado = Operaciones.restar(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicar(){
        int resultado = Operaciones.multiplicar(7, 4);
        assertEquals(28, resultado);
    }

    @Test
    public void testDividir(){
        int resultado = Operaciones.dividir(8, 4);
        assertEquals(2, resultado);
    }

    @Test
    public void testSumaNegativos(){
        int resultado = Operaciones.sumar(-8, -5);
        assertEquals(-13, resultado);
    }
    @Test
    public void testRestaNegativos(){
        int resultado = Operaciones.restar(-8, -5);
        assertEquals(-3, resultado);
    }
}