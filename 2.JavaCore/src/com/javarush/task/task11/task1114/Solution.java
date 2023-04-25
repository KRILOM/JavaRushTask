package com.javarush.task.task11.task1114;

/*
Происхождение видов
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Fish {

    }

    public class Lizard extends Fish {

    }

    public class Dinosaur extends Lizard{

    }

}
//Измени три класса: Fish (рыба), Lizard (ящерица), Dinosaur (динозавр).
//Унаследуй ящерицу от рыбы и динозавра от ящерицы.
//Requirements:
//•	В классе Solution должен быть public класс Fish (рыба).
//•	В классе Solution должен быть public класс Lizard (ящерица).
//•	В классе Solution должен быть public класс Dinosaur (динозавр).
//•	Класс Lizard должен быть унаследован от класса Fish.
//•	Класс Dinosaur должен быть унаследован от класса Lizard.