package com.javarush.task.task04.task0429;

/* 
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
«количество отрицательных чисел: а», «количество положительных чисел: б»,
где а, б — искомые значения.
*/

import java.io.*;

public class Solution {

    /*    public static void main(String[] args) throws Exception {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bufferedReader.readLine());
            int m = Integer.parseInt(bufferedReader.readLine());
            int p = Integer.parseInt(bufferedReader.readLine());

            int counto = 0, countp = 0;

            if (n < 0) {
                counto++;
            } else if (n != 0) {
                countp++;
            }
            if (m < 0) {
                counto++;
            } else if (m != 0) {
                countp++;
            }
            if (p < 0) {
                counto++;
            } else if (p != 0) {
                countp++;
            }
            System.out.println("количество отрицательных чисел: " + counto);
            System.out.println("количество положительных чисел: " + countp);

        }*/
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int m = Integer.parseInt(bufferedReader.readLine());
        int p = Integer.parseInt(bufferedReader.readLine());

        int[] arr = {n, m, p};

        int a = 0; // result -
        int b = 0; // result +

        for (int i = 0; i < 3; i++) {

            if (arr[i] != 0) {

                if (isPositiv(arr[i])) {
                    b++;
                } else {
                    a++;
                }
            }
        }

        System.out.println("количество отрицательных чисел: " + a);
        System.out.println("количество положительных чисел: " + b);


    }

    private static boolean isPositiv(int x) {
        return x > 0;
    }

}
