package org.example;

import java.util.Scanner;

public class Task_1_1 {
    public static void main(String[] args) {
//        Задание №1
//
//Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

//        получение данных из терминала через экземпляр Scanner. Надо import java.util.Scanner;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("What is your name?: ");
//        считываем строку из консоли
        String name = iScanner.nextLine();
//        фоматированный вывод
        System.out.printf("Привет, %s!\n", name);
//        сканер надо закрывать
        iScanner.close();

    }
}
