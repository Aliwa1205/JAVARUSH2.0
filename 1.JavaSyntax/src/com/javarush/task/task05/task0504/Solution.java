package com.javarush.task.task05.task0504;


/* 
Трикотаж
Пару задач назад студенты секретного центра JavaRush создавали класс Cat.
Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat,
а точнее — основываясь на нём, как на шаблоне. Их — котов — должно быть трое. Наполните этих троих жизнью, то есть,
конкретными данными.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Tom", 8, 10 ,15);
        Cat cat2 = new Cat("Vasya", 7, 6, 9);
        Cat cat3 = new Cat("Myrka", 6, 7, 13);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}