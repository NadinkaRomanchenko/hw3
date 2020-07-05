package com.itacademy.hw3;
/** Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
    Вывести дату следующего дня в формате "День.Месяц.Год".
    Учесть переход на следующий месяц, а также следующий год.
    Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 *
 */

public class date {

    public static void main(String[] args) {
        int day = 29;
        int month = 2;
        int year = 2021;
        System.out.println(day + "." + month + "." + year);

        if (day == 29 && month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            day = 1;
            month = 3;
            System.out.println(day + "." + month + "." + year);
        } else if (day == 28 && month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            day = 29;
            System.out.println(day + "." + month + "." + year);
        } else if (day < 28) {
            day = day + 1;
            System.out.println(day + "." + month + "." + year);
        } else if (day == 28 && month == 2) {
            day = 1;
            month = 3;
            System.out.println(day + "." + month + "." + year);
        } else if (day == 28 && (month == 1 || (month >= 3 && month <= 12))) {
            day = day + 1;
            System.out.println(day + "." + month + "." + year);
        } else if (day == 29 && (month != 2)) {
            day = day + 1;
            System.out.println(day + "." + month + "." + year);
        } else if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month = month + 1;
            System.out.println(day + "." + month + "." + year);
        } else if (day == 30 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            day = day + 1;
            System.out.println(day + "." + month + "." + year);
        } else if (day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            day = 1;
            month = month + 1;
            System.out.println(day + "." + month + "." + year);
        } else if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year = year + 1;
            System.out.println(day + "." + month + "." + year);
        } else {
            System.out.println("дата введена некоректно");
        }
    }
}
