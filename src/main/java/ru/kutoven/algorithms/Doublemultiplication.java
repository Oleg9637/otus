package ru.kutoven.algorithms;

public class Doublemultiplication {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        int result = power(base, exponent);
        System.out.println(base + " в степени " + exponent + " = " + result);
    }

    public static int power(int base, int exponent) {
        int result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= base;
            }
            base *= base;
            exponent /= 2;
        }
        return result;
    }
}

