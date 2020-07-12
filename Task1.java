package com.itacademy.hw4;

/**
 * Написать программу, вычисляющую сумму цифр введённого
 * пользователем целого числа.
 */
public class Task1 {

    public static void main(String[] args) {
        int value = 262198;
        int result = sum(value);
        System.out.println(result);

        int result1 = sumFor(value);
        System.out.println(result1);
    }

    public static int sum(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }

        return result;
    }

    public static int sumFor(int value) {
        int result = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            result += currentValue % 10;
        }

        return result;
    }
}
