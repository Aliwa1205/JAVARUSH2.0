package com.javarush.task.task04.task0432;



/* 
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String var = bufferedReader.readLine();
        int num = Integer.parseInt(bufferedReader.readLine());

        int i = 1;
        while (i <= num)
        {
            System.out.println(var);
            i++;
        }


    }
}
