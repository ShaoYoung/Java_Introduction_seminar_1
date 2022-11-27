package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task_1_7 {
    public static void main(String[] args) {

//        Задание №7 (доп)
//
//
//На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
//- команда 1 (к1): увеличить в с раза, а умножается на c
//- команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
//Написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
//Пример 1: а = 1, b = 7, c = 1, d = 3
//ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.
//Пример 2: а = 11, b = 7, c = 2, d = 1
//ответ: “”.


//        УСЛОВИЕ ЗАДАНИЯ НЕ ПОНЯЛ. НЕОБХОДИМО УТОЧНИТЬ.

//        function func (a, b :integer) :integer;
//        begin
//        if (b < a) then
//        result:=0
//else if (b = a) then result :=1
//else result:=func(a + 1, b) + func(2 * a, b)
//        end;
//        begin
//        writeln(func(2, 10) * func(10, 32));
//        end.

        System.out.println(func_java(2, 4));


        int x = 1;
        int y = 25;
//        List<String> l = new ArrayList<>();

        String l = "";
        func_python(x, y, l);


    }

    public static int func_java(int a, int b) {
        if (b < a) {
            return 0;
        } else if (b == a) {
            return 1;
        } else return (func_java(a + 1, b) + func_java(a * 2, b));
    }

    //    public static void func_python(int x, int y, List<String> l) {
    public static void func_python(int x, int y, String l) {
        if (x == y) {
            System.out.println(l);
        } else if (x < y) {
//            l.add("k1");
            func_python(x + 3, y, l + "K1 ");
//            l.add("k2");
            func_python(x * 2, y, l + "K2 ");
        } else {
            System.out.printf("");
        }

    }
}
