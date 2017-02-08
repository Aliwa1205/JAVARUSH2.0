package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String var = bufferedReader.readLine();
        int a = Integer.parseInt(var);

        Solution solution = new Solution();


        if (a == 0) {
            System.out.println("ноль");
            return;
        }


        if (solution.isPositiv(a))
        {
            if (isEven(a)) {
                System.out.println("положительное четное число");
            }
            else
            {
                System.out.println("положительное нечетное число");
            }
        }
        else
        {
            if(isEven(a))
            {
                System.out.println("отрицательное четное число");
            }
            else
            {
                System.out.println("отрицательное нечетное число");
            }
        }


    }

    private boolean isPositiv(int a)
    {
        return a>0;
    }

    private static boolean isEven(int a)
    {
        return a%2==0;
    }
}
