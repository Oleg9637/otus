package ru.kutoven.algorithms;

import java.util.ArrayList;
import java.util.List;

public class SundaramSieveAlgorithms {
    public static List<Integer> sundaramSieve(int n) {
        // Вычисляем k как (n-1)/2, так как мы будем работать только с нечетными числами
        int k = (n - 1) / 2;
        // Создаем массив типа boolean для хранения информации о простых числах
        boolean[] sieve = new boolean[k + 1];
        // Создаем список для хранения найденных простых чисел
        List<Integer> primes = new ArrayList<>();

        // Добавляем число 2, так как оно является простым
        primes.add(2);

        // Основной цикл для пометки чисел, которые не являются простыми
        for (int i = 1; i <= k; i++) {
            for (int j = i; (i + j + 2 * i * j) <= k; j++) {
                // Вычисляем индекс и помечаем его, если число не является простым
                sieve[i + j + 2 * i * j] = true;
            }
        }
        // Цикл для добавления найденных простых чисел в список
        for (int i = 1; i <= k; i++) {
            if (!sieve[i]) {
                // Вычисляем простое число по формуле 2*i + 1 и добавляем его в список
                primes.add(2 * i + 1);
            }
        }

        // Возвращаем список простых чисел
        return primes;
    }

    public static void main(String[] args) {
        List<Integer> primes = sundaramSieve(100);
        System.out.println(primes); // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]

    }

}
