package com.javarush.task.task04.task0427;

/* 
Ввести с клавиатуры целое число в диапазоне 1 — 999. Вывести его строку-описание следующего вида:
«четное однозначное число» — если число четное и имеет одну цифру,
«нечетное однозначное число» — если число нечетное и имеет одну цифру,
«четное двузначное число» — если число четное и имеет две цифры,
«нечетное двузначное число» — если число нечетное и имеет две цифры,
«четное трехзначное число» — если число четное и имеет три цифры,
«нечетное трехзначное число» — если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 — 999, в таком случае ничего не выводить на экран.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String var = bufferedReader.readLine();
        int a = Integer.parseInt(var);

        if (a >= 1 && a <= 999) {
            if (isEven(a)) { //if (com.javarush.task.task04.task0426.Solution.isEven(a)) {
                if (numberDigit(a) == 1) {
                    System.out.println("четное однозначное число");
                } else if (numberDigit(a) == 2) {
                    System.out.println("четное двузначное число");
                } else if (numberDigit(a) == 3) {
                    System.out.println("четное трехзначное число");
                }
            } else {
                if (numberDigit(a) == 1) {
                    System.out.println("нечетное однозначное число");
                } else if (numberDigit(a) == 2) {
                    System.out.println("нечетное двузначное число");
                } else if (numberDigit(a) == 3) {
                    System.out.println("нечетное трехзначное число");
                }
            }
        }
    }


    private static int numberDigit(int a) {
        if (a >= 1 && a <= 9) {
            return 1;
        } else if (a >= 10 && a <= 99) {
            return 2;
        } else if (a >= 100 && a <= 999) {
            return 3;
        } else {
            return 0;
        }

    }

    private static boolean isEven(int a)
    {
        return a%2==0;
    }

}
