package ru.kutoven.matrix;

//реализация алгоритма возведения матрицы в степень через двоичное разложение показателя степени
public class matrixExponentiation {

    public static int[][] matrixPower(int[][] A, int n) throws IllegalArgumentException {
        if (A == null || A.length != A[0].length || n < 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        if (n == 0) {
            return identityMatrix(A.length);
        }
        if (n % 2 == 0) {
            int[][] tmp = matrixPower(A, n/2);
            return matrixMultiplier.multiply(tmp, tmp);
        } else {
            return matrixMultiplier.multiply(A, matrixPower(A, n-1));
        }
    }

    public static int[][] identityMatrix(int n) {
        int[][] I = new int[n][n];
        for (int i = 0; i < n; i++) {
            I[i][i] = 1;
        }
        return I;
    }
}

