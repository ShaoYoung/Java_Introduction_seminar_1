package org.example;

import java.util.Scanner;

public class Task_1_6 {
    public static void main(String[] args) {
//        Задание №6 (доп)
//
//Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
//Пример 1: а = 3, b = 2, ответ: 9
//Пример 2: а = 2, b = -2, ответ: 0.25
//Пример 3: а = 3, b = 0, ответ: 1
        //        получение данных из терминала через экземпляр Scanner. Надо import java.util.Scanner;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число a: ");
//        считываем строку из консоли
        String nString = iScanner.nextLine();
        int a = Integer.parseInt(nString);
        System.out.printf("Введите число b: ");
//        считываем строку из консоли
        nString = iScanner.nextLine();
        int b = Integer.parseInt(nString);
//        сканер надо закрывать
        iScanner.close();
        double res = Math.pow(a, b);
        System.out.printf("%d в степени %d равно %.0f", a, b, res);
    }
}
