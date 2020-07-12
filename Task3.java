package com.itacademy.hw4;

/**
 * Написать программу, отображающую статистику по осадкам
 * за N дней. N вводится пользователем.
 *     Пользователь также должен ввести N целых чисел, обозначающих
 * величину осадков в день.
 *     Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * с. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 *     Не использовать массивы!
 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество дней:");

        int n = sc.nextInt();

        System.out.println("ОК! Будем считать статистику за  " + n + " дней");
        double sum = 0;
        double avg;
        double max = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Введите количество осадков за " + i + " день:");
            double precipitation = sc.nextInt();
            sum = sum + precipitation;
            if (precipitation > max) {
                max = precipitation;
            }
        }
        avg = sum / n;
        System.out.println("Количество дней" + ":" + n);
        System.out.println("Сумму осадков за этот период" + ":" + sum);
        System.out.println("Среднее количество осадков за этот период" + ":" + avg);
        System.out.println("Максимальное количество дневных осадков за этот период" + ":" + max);
    }
}
