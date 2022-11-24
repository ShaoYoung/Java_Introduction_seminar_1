package org.example;

import java.util.Arrays;

public class Task_1_3 {
    public static void main(String[] args) {

//        Задание №3
//
//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
        int[] arr = new int[]{1, 2, 3, 3, 4, 3, 3, 5};
//        вспомогательный массив аналогичной длины
        int[] arrTemp = new int[arr.length];
//        искомый элемент
        int val = 3;
//        начало записи во вспомогательном массиве
        int countStart = 0;
//        для определения конца записи во вспомогательном массиве
        int countEnd = 1;
//      перебираем каждый элемент исходного массива
        for (int elem : arr) {
//            если это искомый элемент, записываем в конец вспомогательного массива
            if (elem == val) {
                arrTemp[arr.length - countEnd] = elem;
                countEnd++;
//                иначе в начало
            } else {
                arrTemp[countStart] = elem;
                countStart++;
            }
            System.out.printf("Очередная итерация %s\n", Arrays.toString(arrTemp));

        }
        System.out.printf("Итоговый массив %s", Arrays.toString(arrTemp));
    }
}
