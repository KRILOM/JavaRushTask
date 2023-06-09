package com.javarush.task.task12.task1223;
/*
И снова Пушистик…
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public final String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        @Override
        public void setName(String name){
             this.name = "";
        }

    }
}
//Добавь один метод в класс Cat так, чтобы программа ничего не выводила на экран.
//Requirements:
//•	Класс Solution должен содержать класс Pet.
//•	Класс Solution должен содержать класс Cat.
//•	Класс Cat должен наследоваться от класса Pet.
//•	Класс Pet должен содержать два метода getName() и setName().
//•	Добавь один метод в класс Cat так, чтобы программа ничего не выводила на экран.
//•	Программа должна выводить на экран результат метода getName() объекта pet.
