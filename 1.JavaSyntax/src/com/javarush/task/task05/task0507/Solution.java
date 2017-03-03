package com.javarush.task.task05.task0507;

/*
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int s = 0;


        while (true)
        {
            int i = Integer.parseInt(br.readLine());

            if (i==-1)
            {
                break;
            }
            s+=i;
            cnt++;
        }

        double d1 = s;
        double d2 = cnt;

        System.out.println(d1/d2);

    }
}

