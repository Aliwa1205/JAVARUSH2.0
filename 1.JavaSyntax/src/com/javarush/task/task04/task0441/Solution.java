package com.javarush.task.task04.task0441;


/* 
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вивести любое из них.
*/
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[3];

        for (int i = 0; i <array.length; i++) {

            array[i] = Integer.parseInt(rd.readLine());
        }
        Arrays.sort(array);
        System.out.println(array[1]);
    }
}
