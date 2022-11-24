package org.example;

public class Task_1_8 {
    public static void main(String[] args) {
//        Задание №8 (доп)
//
//Задан массив, например, nums = [1,7,3,6,5,6].
//Написать программу, которая найдет индекс i для этого массива такой,
// что сумма элементов с индексами < i равна сумме элементов с индексами > i.
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        int result = -1;
        for (int i = 1; i < nums.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i; j++) sumLeft += nums[j];
            System.out.printf("i = %d, Сумма слева %d ", i, sumLeft);

            for (int j = i + 1; j < nums.length; j++) sumRight += nums[j];
            System.out.printf("Сумма справа %d\n", sumRight);

            if (sumLeft == sumRight) {
                result = i;
                break;
            }
        }
        System.out.printf("Индекс массива i, при котором сумма элементов с индексами < i равна сумме элементов с индексами > i, = %d", result);
    }
}
