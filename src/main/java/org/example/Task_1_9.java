package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Task_1_9 {
    public static void main(String[] args) {

//        Задание №9 (доп)
//
//Записать в файл следующие данные:
//
//Name Surname Age
//Kate Smith 20
//Paul Green 25
//Mike Black 23
//        второй агрумент отвечает за дозапись уже имеющегося. false - записывает новый, true - дозаписывает существующий
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("Name Surname Age");
//            перенос на следующую строку можно сделать так
            fw.append('\n');
            fw.write("Kate Smith 20\n");
            fw.write("Paul Green 25\n");
            fw.write("Mike Black 23\n");
            fw.flush();
//            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
