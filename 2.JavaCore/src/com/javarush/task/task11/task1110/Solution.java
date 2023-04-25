package com.javarush.task.task11.task1110;

/*
Не забываем инкапсулировать
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {

        private String name;
        private int age;
        private int weight;
        private int speed;


        private Cat(String name, int age, int weight) {

        }

        private String getName() {
            return null;
        }

        private int getAge() {
            return 0;
        }

        private void setWeight(int weight) {

        }

        private void setSpeed(int speed) {

        }
    }
}
//Посмотри внимательно на методы и добавь недостающие поля.
//Requirements:
//•	В классе Cat должно быть поле типа String с именем name.
//•	В классе Cat должно быть поле типа int с именем age.
//•	В классе Cat должно быть поле типа int с именем weight.
//•	В классе Cat должно быть поле типа int с именем speed.
//•	В классе Cat должны быть 4 поля.
//•	Все поля класса Cat должны быть private.