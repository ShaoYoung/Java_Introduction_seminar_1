package org.example;

public class Task_1_5 {
    public static void main(String[] args) {
//        Задание №5 (доп)
//
//Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
        String text = "Добро пожаловать на курс по Java";
        String[] words = text.split(" ");
        String temp;
        for (int i = 0; i < words.length / 2; i++) {
            temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        text = String.join(" ", words);
        System.out.println(text);
    }
}
