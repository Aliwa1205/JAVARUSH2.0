package com.javarush.task.task01.task0133;

/* 
Реализуй метод getCountSecondsPassedInCurrentHour(int seconds).
Метод на вход принимает целое число секунд, которые прошли с начала текущих суток.
Нужно найти количество секунд, прошедших с начала последнего часа, и вернуть это число.

Пример:
Метод getCountSecondsPassedInCurrentHour вызывается с параметром 12345.
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {

// 1 час = 3600сек.
        int i;
        i = seconds%3600;

        return i;
    }
}