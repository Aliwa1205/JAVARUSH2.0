package com.javarush.task.task05.task0501;

/* 
Создание кота
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
*/

public class Cat {
    //напишите тут ваш код
    // public static class Cat {

    public String name;
    public int age, weight, strength;
   //}

/*    public static void printName(Cat cat){
        System.out.println(cat.name);
    }
    public static void printAge(Cat cat){
        System.out.println(cat.age);
    }
    public static void printWeight(Cat cat){
        System.out.println(cat.weight);
    }
    public static void printStrength(Cat cat){
        System.out.println(cat.strength);
    }*/

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "VVVVVVVV";
        cat.age = 8;
        cat.weight = 15;
        cat.strength = 5;
        /*printName(cat);
        printAge(cat);
        printWeight(cat);
        printStrength(cat);*/

    }

}
