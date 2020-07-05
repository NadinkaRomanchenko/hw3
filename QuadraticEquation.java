package com.itacademy.hw3;

/**
 * Написать программу, вычисляющую корни квадратного уравнения вида
 * ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли данные.
 * Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
 * При решении создать и использовать следующие вынесенные функции:
 * - функция isPositive, определяющая, является ли число положительным
 * - функция isZero, определяющая, является ли число нулём
 * - функция discriminant, вычисляющая дискриминант
 */


public class QuadraticEquation {
    public static void main(String[] args) {
        int a = 1;
        int b = -8;
        int c = 12;
        int d;
        double x1;
        double x2;


        System.out.println(a + "x*x+" + b + "x+" + c + "=0");
        d = discriminant(a, b, c);
        System.out.println("дискриминант равен " + d);
        if (isPositive(d)) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("корни уравнения " + x1 + "  " + x2);
        } else if (isZero(d)) {
            x1 = (-b / (2 * a));
            System.out.println("корень уравнения " + x1);
        } else {
            System.out.println("уравнение не имеет действительнных корней");
        }
    }

    public static int discriminant(int a, int b, int c) {
        int d;
        d = b * b - 4 * a * c;
        return d;
    }

    public static Boolean isPositive(int d) {
        if (d > 0) {
            System.out.println("дискриминант больше нуля");
            return true;
        } else {
            return false;
        }
    }

    public static Boolean isZero(int d) {
        if (d == 0) {
            System.out.println("дискриминант равен нулю");
            return true;
        } else {
            return false;
        }
    }

}


