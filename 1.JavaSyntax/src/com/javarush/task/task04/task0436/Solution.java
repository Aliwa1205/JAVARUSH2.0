package com.javarush.task.task04.task0436;


/* 
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bufferedReader.readLine());
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i <m; i++) {

            for (int j = 0; j <n; j++) {
                System.out.print("8");
            }

            System.out.println("");
        }
    }
}
