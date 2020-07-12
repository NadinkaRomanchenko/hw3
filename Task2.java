package com.itacademy.hw4;

/**
 * Написать программу, вычисляющую и отображающую все числа
 * Фибоначчи меньше введённого пользователем целого числа.
 * Решить двумя способами: с помощью цикла и с помощью
 * рекурсии.
 */
public class Task2 {

    public static void main(String[] args) {
        int value = 1000;
        System.out.print("1 1 ");
        fibonachi(value);
    }

    public static void fibonachi(int value) {
        int fib1;
        int fib2;
        int fib;
        fib1 = fib2 = 1;
        for (int i = 1; i < 20; i++) {
            fib = fib1 + fib2;
            if (fib <= value) {
                System.out.print(fib + " ");
            } else {
                break;
            }
            fib1 = fib2;
            fib2 = fib;
        }
    }
}