package com.javarush.task.task04.task0433;


/* 
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        char a = 'S';

        int i = 1;

        while (i <= 10) {
           /* for (int j = 1; j < 10; j++) {
                System.out.print(a);
            }*/
            int j = 1;
            while (j < 10) {
                System.out.print(a);
                j++;
            }

            System.out.println(a);
            i++;
        }

    }
}
