package ru.kutoven.algorithms;


public class sieveOfEratosthenesWithMatrix {
    public static void sieveOfEratosthenes(int n) {
        // вычисляем количество нечётных чисел до n
        int count = (n - 1) / 2 + 1;
        // создаем битовую матрицу, используя int для хранения 32 битов
        int[] bits = new int[(count - 1) / 32 + 1];
        // установка бита 1 соответствует состоянию "число не простое"
        for (int i = 1; i < count; i++) {
            if ((bits[(i - 1) / 32] & (1 << ((i - 1) % 32))) == 0) {
                // если i-ое число не помечено как составное, то оно простое
                int prime = 2 * i + 1;
                if (prime <= Math.sqrt(n)) {
                    // помечаем все кратные простому числу prime
                    for (int j = prime * prime; j <= n; j += 2 * prime) {
                        if (j % 2 != 0) {
                            bits[(j - 1) / 64] |= 1 << ((j - 1) / 2 % 32);
                        }
                    }
                }
            }
        }
        // выводим на экран все простые числа до n
        System.out.print(2 + " ");
        for (int i = 1; i < count; i++) {
            if ((bits[(i - 1) / 32] & (1 << ((i - 1) % 32))) == 0) {
                int prime = 2 * i + 1;
                System.out.print(prime + " ");
            }
        }
    }
}
