package com.ahanmalhotra;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println("**Starting With Number Utils**");
        System.out.println(testEquality("GCD of 624 and 758", NumberUtils.greatestCommonDivisor(624, 758), 2));
        System.out.println(testEquality("LCM of 44 and 28", NumberUtils.leastCommonMultiple(44, 28), 308));
        System.out.println(testEquality("Factorial of 10", NumberUtils.factorial(10), 3628800));
        System.out.println(testEquality("Decimal of 101101011001", NumberUtils.decimalFromBinary(new BigInteger("101101011001")), 2905));
        System.out.println(testEquality("Binary of 2905", NumberUtils.binaryFromDecimal(2905), "101101011001"));
        System.out.println(testEquality("Is 97 Prime?", NumberUtils.isPrime(97), true));

    }

    public static String testEquality(String testCase, String test, String correct)
    {
        if (test.equals(correct))
            return testCase + " returned " + test + " and it is correct! PASS";
        else
            return testCase + " returned " + test + " and it should be " + correct + ". FAIL";

    }

    public static String testEquality(String testCase, int test, int correct)
    {
        return testEquality(testCase, "" + test, "" + correct);
    }

    public static String testEquality(String testCase, boolean test, boolean correct)
    {
        return testEquality(testCase, "" + test, "" + correct);
    }
}

