package com.sky;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void emptyTest() {

    }

    @Test

    void firstTest() {
        Calculator.findFactorial(120);
    }

        @Test
    void secondTest() {
        assertEquals(5, Calculator.findFactorial(120));
    }

    @Test
    void thirdTest() {
        assertEquals(0, Calculator.findFactorial(150));
    }


    @Test
    void fourthTest() {
        assertEquals(10, Calculator.findFactorial(3628800));
    }


}
