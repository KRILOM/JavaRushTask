package com.javarush.task.task11.task1109;

/*
Как кошка с собакой
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog dog = new Dog("Sharik", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class Cat {
    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog {
    private String name;
    private int speed;

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}
//Скрой все внутренние переменные класса Cat и Dog.
//Также скрой все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
//Requirements:
//•	Переменные класса Cat должны быть скрыты.
//•	Переменные класса Dog должны быть скрыты.
//•	Методы класса Cat должы быть скрыты.
//•	Методы класса Dog должы быть скрыты.
//•	Методы, с помощью которых классы Cat и Dog взаимодействуют друг с другом, должны быть публичными.




