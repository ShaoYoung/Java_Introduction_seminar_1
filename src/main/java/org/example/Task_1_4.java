package org.example;


public class Task_1_4 {
    public static void main(String[] args) {

//        Задание №4
//
//
//Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
//Если общего префикса нет, вернуть пустую строку "".

//        длина префикса
        int prefLength = 2;
//      массив строк
        String[] arr = new String[]{"преподаватель преподаёт предмет", "командир командует", "просто текст"};
//        массив числа общих префиксов в строках
        int[] prefCount = new int[arr.length];
        int numMaxPrefCount = -1;
        int maxPrefCount = 0;
        for (int i = 0; i < arr.length; i++) {
            prefCount[i] = getCountPref(arr[i], prefLength);
            if ((prefCount[i] > 1) & (prefCount[i] > maxPrefCount)) {
                maxPrefCount = prefCount[i];
                numMaxPrefCount = i;
            }
            System.out.printf("Строка:'%s', кол-во общих префиксов: %d\n", arr[i], prefCount[i]);
        }
        if (numMaxPrefCount != (-1)) {
            System.out.printf("Строка:'%s' имеет %d слов(а) с общим префиксом", arr[numMaxPrefCount], prefCount[numMaxPrefCount]);
        } else {
            System.out.println("В строках нет слов с общими префиксами");
        }
    }

    public static int getCountPref(String text, int prefLength) {
//        разбиваем строку на слова, разделитель - пробел
        String[] words = text.split(" ");

        //        массив префиксов (подстрок длиной 2 символа)
        String[] subW = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            subW[i] = words[i].substring(0, prefLength);
        }

        int maxPref = 0;
        int countPref = 0;

//      проходим по каждому слову и сравниваем префиксы, считаем кол-во совпадений
        for (String pattern : subW) {
            for (String pref : subW) {
//                сравниваем паттерн и префикс
//                System.out.printf("pattern %s - pref %s", pattern, pref);
//                System.out.println();
//                лучше через equalsIgnoreCase - сравнение строк без учёта регистра
                if (pattern.equalsIgnoreCase(pref)) countPref++;
            }
            if (countPref > maxPref) maxPref = countPref;
            countPref = 0;
        }
//        System.out.println(maxPref);
        return maxPref;
    }

}
