package com.javarush.task.task12.task1213;

/*
«Исправь код», часть 2
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }

}
//Исправь код, чтобы программа компилировалась.
//Requirements:
//•	Класс Pet должен быть статическим.
//•	Класс Pet должен иметь два метода.
//•	Метод getChild() должен быть абстрактным.
//•	Класс Pet должен быть объявлен с модификатором, который запрещает создавать конкретные объекты этого класса.