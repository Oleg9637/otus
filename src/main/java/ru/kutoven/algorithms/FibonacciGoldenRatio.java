package ru.kutoven.algorithms;

public class FibonacciGoldenRatio {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        double phi = (1 + Math.sqrt(5)) / 2; // золотое сечение
        return (int) Math.round((Math.pow(phi, n) - Math.pow(-phi, -n)) / Math.sqrt(5));
    }
}

