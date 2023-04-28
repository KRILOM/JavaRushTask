package com.javarush.task.task13.task1325;

import java.awt.*;

/*
Компиляция программы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        @Override
        public Color getColor() {
            return null;
        }
    }

}
//Исправь классы Fox и BigFox так, чтобы программа компилировалась.
//В решении этой задачи не нужно создавать экземпляры базового класса.
//Метод main не изменяй.
//Requirements:
//•	Интерфейс Animal должен быть реализован в классе Fox.
//•	В классе Fox должен быть реализован только один метод — getName().
//•	В интерфейсе Animal должен быть объявлен метод getColor().
//•	Класс BigFox должен быть потомком класса Fox.
//•	Класс Fox должен быть абстрактным.