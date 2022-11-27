package org.example;

import java.util.Scanner;

public class SolutionHW_1_4 {
    public static void main(String[] args) {
//        4. *+Задано уравнение вида q + w = e, где q, w, e >= 0.
//        Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//        Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

        //        получение данных из терминала через экземпляр Scanner. Надо import java.util.Scanner;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите двузначное число q (на месте любого разряда может стоять '?': ");
        String qString = iScanner.nextLine();
        System.out.printf("Введите двузначное число w (на месте любого разряда может стоять '?': ");
        String wString = iScanner.nextLine();
        System.out.printf("Введите двузначное число e: ");
        String eString = iScanner.nextLine();
        int e = Integer.parseInt(eString);
        iScanner.close();

//      Ещё один вариант решения. Можно в циклах заменить знак '?' на цифру. Только сначала посчитать количество вопросов.
//      Потом простым перебором вариантов. Количество вариантов - 10 в степени количество вопросов.
//      Ольга скидывала решение в ответ на ДЗ.

//      Для тестирования программы
//        String qString = "??";
//        String wString = "22";
//        int e = 100;
        boolean solutionFound = false;

//        конвертируем введённую строку qString в массив символов
        char[] qArray = qString.toCharArray();
        int q = 0;
        boolean qTen = false;
        int qPow = 0;
        boolean qOne = false;
        int qVar;
        if (qArray[0] == '?') {
            qTen = true;
            qPow = 1;
        } else {
//            преобразование char в int по основанию 10
            q += Character.digit(qArray[0], 10) * 10;
        }
        if (qArray[1] == '?') {
            qOne = true;
            qPow = 0;
        } else {
//            преобразование char в int по основанию 10
            q += Character.digit(qArray[1], 10);
        }

//        Конвертируем введённую строку wString в массив символов. По идее надо обернуть 27-47 и 51-70 в метод.
//        Но Java не Python, возврат разнотипных переменных из метода немного сложнее. Надо разбираться.
        char[] wArray = wString.toCharArray();
        int w = 0;
        boolean wTen = false;
        int wPow = 0;
        boolean wOne = false;
        int wVar;
        if (wArray[0] == '?') {
            wTen = true;
            wPow = 1;
        } else {
//            преобразование char в int по основанию 10
            w += Character.digit(wArray[0], 10) * 10;
        }
        if (wArray[1] == '?') {
            wOne = true;
            wPow = 0;
        } else {
//            преобразование char в int по основанию 10
            w += Character.digit(wArray[1], 10);
        }

//для поиска двух вопросов подряд или ?? + ??
        qVar = getVariant(q, qTen, qOne, qPow, 0);
        wVar = getVariant(w, wTen, wOne, wPow, 0);
//  Если используется двойной амперсанд и первое выражение ложно (false), то второе выражение даже не будет проверяться,
//  т.к. вне зависимости от него,всё выражение будет ложным. При одном амперсанде будут вычислены оба условия.
        if ((qVar == -1) & (wVar == -1)) {
            System.out.printf("Одно из решений: %d + %d = %d\n", e, 0, e);
        } else if (qVar == -1) {
            System.out.printf("Одно из решений: %d + %d = %d\n", e - wVar, wVar, e);
        } else if (wVar == -1) {
            System.out.printf("Одно из решений: %d + %d = %d\n", qVar, e - qVar, e);
        } else {
            for (int i = 0; i <= 9; i++) {
                qVar = getVariant(q, qTen, qOne, qPow, i);
//            System.out.printf("qVar = %d\n", qVar);
                for (int j = 0; j <= 9; j++) {
                    wVar = getVariant(w, wTen, wOne, wPow, j);
                    if (qVar + wVar == e) {
                        System.out.printf("Одно из решений: %d + %d = %d\n", qVar, wVar, e);
                        solutionFound = true;
                        break;
                    }
                    if (solutionFound) break;
//                System.out.printf("wVar = %d\n", wVar);
//                System.out.printf("qVar + wVar = %d\n", qVar + wVar);
                }
            }
            if (!solutionFound) {
                System.out.println("Не могу найти решение с заданными условиями!");
            }
        }
    }

    //    метод предлагает вариант переменной в зависимости от того, где стоят вопросы
    public static int getVariant(int q, boolean qTen, boolean qOne, int qPow, int i) {
        int varFind;
        if (qTen & qOne) {
//        если оба символа ??
//            System.out.println("оба символа ??");
            varFind = -1;
//        если оба символа цифры
        } else if (!(qTen) & !(qOne)) {
//            System.out.println("оба символа цифры");
            varFind = q;
        } else {
            varFind = q + (int) (i * Math.pow(10, qPow));
        }
//        System.out.println(varFind);
        return varFind;
    }

}
