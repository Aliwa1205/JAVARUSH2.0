package com.javarush.task.task04.task0442;


/* 
Суммирование
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));


        int s = 0;

        while (true) // for( ; ; ) то же самое
        {

            int a = Integer.parseInt(rd.readLine());

            s+=a;

            if (a==-1)
            {
                break;//выйти из цикла
            }

        }

        System.out.println(s);

    }
}
