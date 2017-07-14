package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String b;
        int a;
        System.out.println("Введите трёхзначное число: ");
        a = in.nextInt();
        if (a > 999 | a < 100) { //почему-то не отрабатывает эта проверка!
            System.out.println("Вы допустили ошибку! Число не трёхзначное.");
        } else {
            System.out.println("Выберите нужное действие. \n Если надо сравнить первую или последнюю цифру - введите А \n Если надо сравнить первую или вторую цифру - введите Б \n Если надо сравнить вторую или последнюю цифру - введите С \n Обрите внимание что ввод производиться заглавными русскими буквами! ");
            b = in.next();
            switch (b) {
                case "А": {
                    int first, third;
                    first = (a / 100) % 10;
                    third = a % 10;
                    if (first > third) {
                        System.out.println("Первая цифра вашего числа больше третей! " + first + " > " + third);
                    } else {
                        System.out.println("Треться цифра вашего числа больше первой! " + third + " > " + first);
                    }
                    break;
                }
                case "Б": {
                    int first, second;
                    first = (a / 100) % 10;
                    second = (a / 10) % 10;
                    if (first > second) {
                        System.out.println("Первая цифра вашего числа больше второй! " + first + " > " + second);
                    } else {
                        System.out.println("Вторая цифра вашего числа больше первой! " + second + " > " + first);
                    }
                    break;
                }
                case "С": {
                    int second, third;
                    second = (a / 10) % 10;
                    third = a % 10;
                    if (second > third) {
                        System.out.println("Вторая цифра вашего числа больше третей! " + second + " > " + third);
                    } else {
                        System.out.println("Третья цифра вашего числа больше второй! " + third + " > " + second);
                    }
                    break;
                }
            }
        }

    }
}
