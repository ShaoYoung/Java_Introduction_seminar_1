package org.example;

public class Task_1_2 {
    public static void main(String[] args) {
//        Задание №2
//
//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
        int[] arr = new int[]{0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) count++;

            else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }

            System.out.printf("Элемент %d счётчик %d\n", i, count);

        }
        System.out.println(max);

    }
}
