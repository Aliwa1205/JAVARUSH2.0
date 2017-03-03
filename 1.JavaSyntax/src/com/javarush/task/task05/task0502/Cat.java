package com.javarush.task.task05.task0502;

/*Реализовать метод fight

Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false — если нет.

Должно выполняться условие:
если cat1.fight(cat2) = true,
то cat2.fight(cat1) = false*/



public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

   /* // 3-тий способ с перегрузкой

    public Cat(int a, int w, int s)
    {
        this.age = a;
        this.weight = w;
        this.strength = s;
    }
    public Cat(int a, int w)
    {
        this.age = a;
        this.weight = w;
        this.strength = 0;
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код

        if (this.age + this.weight - this.strength >= anotherCat.age + anotherCat.weight - anotherCat.strength)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat(50,15,8);
        Cat cat2 = new Cat(4,20);
        cat1.fight(cat2);
        System.out.println(cat1.fight(cat2));
    }
*/

/*// 2-й способ с конструктором
    public Cat(int a, int w, int s)
    {
        this.age = a;
        this.weight = w;
        this.strength = s;
    }
    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код

        if (this.age + this.weight - this.strength >= anotherCat.age + anotherCat.weight - anotherCat.strength)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat(50,15,8);
        Cat cat2 = new Cat(4,20,7);
        cat1.fight(cat2);
        System.out.println(cat1.fight(cat2));
    }*/

    // 1-й вариант, без использования конструкторв
    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код

        if (this.age + this.weight - this.strength >= anotherCat.age + anotherCat.weight - anotherCat.strength)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.name = "Vasya";
        cat1.age = 50;
        cat1.weight = 15;
        cat1.strength = 8;

        Cat cat2 = new Cat();
        cat2.name = "Tom";
        cat2.age = 4;
        cat2.weight = 20;
        cat2.strength = 7;

        cat1.fight(cat2);
        System.out.println(cat1.fight(cat2));
    }
}
