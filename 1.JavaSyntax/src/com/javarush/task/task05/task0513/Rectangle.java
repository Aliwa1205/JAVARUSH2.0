package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(…)

Примеры:
— заданы 4 параметра: left, top, width, height
— ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат
— создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle {
    //напишите тут ваш код
    private int left = 4;
    private int top = 5;
    private int width = 6;
    private int height = 9;

    //— заданы 4 параметра: left, top, width, height
    public void initialize()
    {
       int left = this.left;
        int top = this.top;
        int width = this.width;
        int height = this.height;
    }

    //— ширина/высота не задана (оба равны 0)
    public void initialize (int left, int top)
    {

        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;

    }

    //— высота не задана (равно ширине) создаём квадрат
    public void initialize (int width)
    {
        this.height = width;
        this.width = width;
        int left = this.left;
        int top = this.top;


    }

//— создаём копию другого прямоугольника (он и передаётся в параметрах)
    public void initialize(Rectangle rectangle)
    {
        this.width = rectangle.width;
        this.height = rectangle.height;
        this.left = rectangle.left;
        this.top = rectangle.top;
    }


    public static void main(String[] args) {



    }
}
