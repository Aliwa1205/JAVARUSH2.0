package com.javarush.task.task01.task0140;

import java.util.Scanner;

/* 
Напиши программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
Внимательно просмотри лекцию. Для считывания данных с клавиатуры используй метод nextInt() класса Scanner.
*/

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;

        if(sc.hasNextInt())
        {
            a = sc.nextInt();
            System.out.println((int)Math.pow(a,2)/*a*a*/);
        }
        else
        {
            System.out.println("ERROR!!!");
        }
    }
}