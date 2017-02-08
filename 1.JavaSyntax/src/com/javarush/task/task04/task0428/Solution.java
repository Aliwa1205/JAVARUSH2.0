package com.javarush.task.task04.task0428;

/* 
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int[] arr = {a,b,c};

        int w = 0; // result

        for (int i = 0; i < 3; i++) {

            if (isPositiv(arr[i]))
            {
               w++;
            }

        }

        System.out.println(w);
    }

    private static boolean isPositiv(int x)
    {
        return x>0;
    }
}
