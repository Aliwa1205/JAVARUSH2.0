package com.javarush.task.task04.task0438;

/* 
Используя цикл for вывести на экран:
— горизонтальную линию из 10 восьмёрок
— вертикальную линию из 10 восьмёрок.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        for (int i = 0;i<10;i++) {
            for (int j = 0; i==0&&j < 10; j++)
                System.out.print("8");
            System.out.println("         8");
        }
    }
       /* for (int i = 0; i <10 ; i++) {

            System.out.print("8");

        }
        System.out.println("");
        for (int j = 0; j<10; j++) {

            System.out.println("         8");
        }



    }*/
}
