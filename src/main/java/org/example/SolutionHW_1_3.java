package org.example;

import java.util.Scanner;

public class SolutionHW_1_3 {
    public static void main(String[] args) {

//        3. Реализовать простой калькулятор (+ - / * степень) операнд 1, операнд 2, действие

        //        получение данных из терминала через экземпляр Scanner. Надо import java.util.Scanner;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
//        считываем строку из консоли
        String nString1 = iScanner.nextLine();
        int n1 = Integer.parseInt(nString1);
        System.out.printf("Введите второе число: ");
//        считываем строку из консоли
        String nString2 = iScanner.nextLine();
        int n2 = Integer.parseInt(nString2);
        System.out.printf("Введите действие (+, -, /, *, ^: ): ");
//        считываем строку из консоли
        String operation = iScanner.nextLine();
//        сканер надо закрывать
        iScanner.close();

        double result = 0;
        boolean correctInput = true;


        switch (operation) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "/":
//                преобразуем в double для того, чтобы результат представлял число с плавающей точкой
//                иначе если в операции деления участвуют два целых числа, то результат деления будет округляться до целого числа,
//                даже если результат присваивается переменной float или double
                result = (double) n1 / (double) n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "^":
                result = Math.pow(n1, n2);
                break;
            default:
                System.out.println("Ошибочный ввод действия над числами");
                correctInput = false;
                break;
        }
//        вывод результата с округлением до 2 знаков после запятой
        if (correctInput) System.out.printf("%d %s %d = %.2f", n1, operation, n2, result);


    }
}
