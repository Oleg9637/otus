package ru.kutoven.algorithms;

import java.util.ArrayList;

//лгоритм поиска простых чисел с оптимизациями поиска и делением только на простые числа, O(N * Sqrt(N) / Ln (N)).

//класс PrimeNumbers, содержит метод для нахождения всех простых чисел до заданного числа n
public class PrimeNumbers {
    private final ArrayList<Integer> primes = new ArrayList<>();

    public PrimeNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 0; j < primes.size() && primes.get(j) * primes.get(j) <= i; j++) {
                if (i % primes.get(j) == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(i);
            }
        }
    }

    public static void main(String[] args) {
        int n = 100;

        PrimeNumbers primeNumbers = new PrimeNumbers(n);

        System.out.println(primeNumbers.getPrimes());
    }

    public ArrayList<Integer> getPrimes() {
        return primes;
    }
}

