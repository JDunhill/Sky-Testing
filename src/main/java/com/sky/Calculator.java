package com.sky;

public class Calculator {


    public static int findFactorial(int num) {
        int currentNumber = num;
        int divisor = 2;
        while (currentNumber != 1 && currentNumber % divisor == 0) {
            currentNumber /= divisor;
            divisor++;
        }
        return currentNumber == 1 ? divisor - 1 : 0;
    }

    public static String printFactorial(int findFactorialNumber) {

            int result = findFactorial(findFactorialNumber);
            if(result == 0) return "NONE";
            else return (String.valueOf(result) + "!");

    }


}
