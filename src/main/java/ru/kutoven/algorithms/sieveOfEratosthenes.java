package ru.kutoven.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Алгоритм "Решето Эратосфена"
public class sieveOfEratosthenes {
    public static List<Integer> lgorithmSieveOfEratosthenes(int n) {
        //создадим массив prime, где prime[i] равно true, если число i является простым,
        //и false, если число i не является простым.
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        //Затем мы идем от 2 до квадратного корня из n и помечаем все числа,
        //которые делятся на i, как составные числа.
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        //создаем список простых чисел и добавляем все числа,
        //которые остались помеченными как простые в массиве prime.
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

}
