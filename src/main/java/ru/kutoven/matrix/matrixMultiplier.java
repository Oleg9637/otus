package ru.kutoven.matrix;
// класс для умножения матриц
public class matrixMultiplier {

    public static int[][] multiply(int[][] A, int[][] B) throws IllegalArgumentException {
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;

        if (n != B.length) {
            throw new IllegalArgumentException("Matrices cannot be multiplied");
        }

        int[][] C = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
        return C;
    }
}

