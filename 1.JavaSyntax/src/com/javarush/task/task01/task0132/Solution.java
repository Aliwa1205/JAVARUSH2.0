package com.javarush.task.task01.task0132;

/* 
Реализуй метод sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число.
Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        String s = String.valueOf(number);
        int d = 0;

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            d+=Integer.valueOf(String.valueOf(s.charAt(i)));
            // делаем преобразование сначала чара в стринг а затем в инт, поэтому если так оставить, то s.charAt(i) вернет для 5 = 53ипо
            // ASCII 4 = 52, 6 = 54 и ссумирует их.Если мы просто выведем System.out.println(s.charAt(i)); то вернет правильно - т.к.
            // принт содержит неявное преобразование, но если надо сложить, то чар сначала слаживает а потом преобразовует и возвращает.

        }
        return d;
    }
}