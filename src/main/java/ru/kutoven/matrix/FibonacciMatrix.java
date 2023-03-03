package ru.kutoven.matrix;

public class FibonacciMatrix {

    public static void main(String[] args) {
        int n = 10;
        int[][] F = {{1, 1}, {1, 0}};
        for (int i = 0; i < n; i++) {
            System.out.print(matrixFibonacci(i, F) + " ");
        }
    }

    public static int matrixFibonacci(int n, int[][] F) throws IllegalArgumentException {
        if (F == null || F.length != 2 || F[0].length != 2 || n < 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        int[][] result = MatrixExponentiation.matrixPower(F, n);
        return result[0][1];
    }
}

