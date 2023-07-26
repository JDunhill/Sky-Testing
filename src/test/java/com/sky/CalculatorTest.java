package com.sky;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void emptyTest() {

    }

    @Test

    void firstTest() {
        assertEquals("5!", Calculator.printFactorial(120));
    }




    @Test
    void thirdTest() {
        assertEquals("NONE", Calculator.printFactorial(150));
    }


    @Test
    void fourthTest() {
        assertEquals("10!", Calculator.printFactorial(3628800));
    }


}
