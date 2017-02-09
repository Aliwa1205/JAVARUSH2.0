package com.javarush.task.task01.task0129;

/* 
Реализуй метод printCircleLength. Параметр метода — радиус окружности. Метод должен вывести на экран длину окружности, рассчитанной по формуле:
L = 2 * Pi * radius.
Результат — дробное число (тип double).
В качестве значения Pi используй значение 3.14.
*/

public class Solution {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {

        double L, M;
        L = 2 * Math.PI * (double) radius;
        System.out.println((double)Math.round(L*10000)/10000);


       /* M = Math.round(L * 10000);  // округление
        System.out.println(M / 10000);*/
    }
}