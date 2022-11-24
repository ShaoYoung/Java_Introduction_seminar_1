package org.example;

import java.util.ArrayList;
import java.util.List;

public class SolutionHW_1_2 {
    public static void main(String[] args) {

//        2. Вывести все простые числа от 1 до 1000

//        Список простых чисел. необходим, т.к. кол-во элементов изначально неизвестно.
        List<Integer> simpleNumbers = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            if (checkSimple(i)) {
//                если число простое, добавляем в список
                simpleNumbers.add(i);
            }
        }
//        выводим в консоль список. спецификатор %s приводи к строке любой тип (в данном случае List)
        System.out.printf("Простые числа %s", simpleNumbers);
        //        можно вывести так
//        for (int sNum: simpleNumbers) {
//            System.out.printf("Простое число %d\n", sNum);
//        }

    }

    //    проверяет число n на простое, созвращает bool
    public static boolean checkSimple(int n) {
        boolean result = true;
        for (int i = 2; i < n / 2 + 1; i++) {
//            если остаток от деления равен нулю (число делится нацело), то число не простое, возвращаем false
            if (n % i == 0) result = false;
        }
        return result;
    }

}
