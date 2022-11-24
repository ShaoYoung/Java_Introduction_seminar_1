package org.example;

import java.util.Scanner;

public class SolutionHW_1_1 {
    public static void main(String[] args) {

//        1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//
//        получение данных из терминала через экземпляр Scanner. Надо import java.util.Scanner;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
//        считываем строку из консоли
        String nString = iScanner.nextLine();
        int n = Integer.parseInt(nString);
//        сканер надо закрывать
        iScanner.close();
//
        int summaN = 0;
        int multiN = 1;
        for (int i = 1; i <= n ; i++) {
            summaN+=i;
            multiN*=i;
        }

        System.out.printf("Сумма чисел от 1 до %d = %d\nПроизведение чисел от 1 до %d = %d", n, summaN, n, multiN);

    }
}
