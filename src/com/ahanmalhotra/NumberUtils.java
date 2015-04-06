package com.ahanmalhotra;

import java.math.BigInteger;
import java.util.ArrayList;

public class NumberUtils {

    //GCD

    public static int greatestCommonDivisor(int firstNumber, int secondNumber)
    {
        int c = 0;

        while (firstNumber != 0)
        {
            c = firstNumber;
            firstNumber = secondNumber % firstNumber;
            secondNumber = c;
        }

        return secondNumber;
    }

    //LCM

    public static int leastCommonMultiple(int firstNumber, int secondNumber)
    {
        return firstNumber * secondNumber / greatestCommonDivisor(firstNumber, secondNumber);
    }

    //Factorial

    public static int factorial(int number)
    {
        int factorial = 1;

        for (int i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }

        return factorial;
    }

    //Binary To Decimal

    public static int decimalFromBinary(BigInteger binary)
    {

        BigInteger decimal = BigInteger.ZERO;
        BigInteger j = BigInteger.ONE;
        BigInteger remainder = BigInteger.ZERO;
        while (!binary.equals(BigInteger.ZERO))
        {
            remainder = binary.mod(BigInteger.TEN);
            decimal = decimal.add(remainder.multiply(j));
            j = j.add(j) ;
            binary = binary.divide(BigInteger.TEN);
        }

        return decimal.intValue();
    }

    public static String binaryFromDecimal(int decimal)
    {
        int quotient = decimal;
        int[] binaryNumber = new int[100];
        int i = 1;

        while (quotient != 0) {
            binaryNumber[i++] = quotient % 2;
            quotient = quotient / 2;
        }

        String result = "";

        for (int j = i - 1; j > 0; j--)
        {
            result += binaryNumber[j];
        }

        return result;
    }

    public static boolean isPrime(int givenNumber)
    {
        if (givenNumber == 1 || givenNumber == 0)
            return false;

        for (int i = 2; i <= Math.sqrt(givenNumber); i++)
        {
            if (givenNumber % i == 0)
            {
                return false;
            }
        }

        return true;
    }



}
