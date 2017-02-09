package com.javarush.task.task01.task0136;

/* 
Да хоть на Луну!
Вот и я не знал. А теперь этой информацией нужно пользоваться часто, и, чтобы не считать каждый раз, реализуй метод
getWeight(int), который принимает вес тела (в Ньютонах) на Земле, и возвращает, сколько это тело будет весить на Луне (в Ньютонах).
Тип возвращаемого значения — double.

Пример:
Метод getWeight вызывается с параметром 888.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int weightEarth) {

        Double l = 0.17, m;
        m = l*(double)weightEarth;
        return m;
       //return (double)Math.round(m/10000)/10000;

    }
}