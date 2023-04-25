package com.javarush.task.task10.task1013;

/*
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name, lastname, sex;
        private int age, weight, height;
        public Human(){

        }
        public Human(String name, String lastname, String sex){
            this.name = name;
            this.lastname = lastname;
            this.sex = sex;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String lastname) {
            this.name = name;
            this.lastname = lastname;
        }

        public Human(String name, String lastname, String sex, int age, int weight, int height) {
            this.name = name;
            this.lastname = lastname;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String sex, int age) {
            this.sex = sex;
            this.age = age;
        }

        public Human(int age, int weight, int height) {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String lastname, String sex, int age) {
            this.lastname = lastname;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, String lastname, String sex, int age) {
            this.name = name;
            this.lastname = lastname;
            this.sex = sex;
            this.age = age;
        }

        public Human(String lastname, String sex, int age, int weight, int height) {
            this.lastname = lastname;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
    }
}
//Напиши класс Human с 6 полями.
//Придумай и реализуй 10 различных конструкторов для него.
//Requirements:
//•	Программа не должна считывать данные с клавиатуры.
//•	В классе Human должно быть 6 полей.
//•	Все поля класса Human должны быть private.
//•	В классе Human должно быть 10 конструкторов.
//•	Все конструкторы класса Human должны быть public.
