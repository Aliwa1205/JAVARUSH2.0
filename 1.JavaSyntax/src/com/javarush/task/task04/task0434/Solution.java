package com.javarush.task.task04.task0434;


/* 
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        int i = 1;

        while (i<=10)
        {
            int j = 1;
            while (j<=10)
            {
                System.out.print(i*j +" ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}