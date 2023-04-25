package com.javarush.task.task12.task1224;
/*
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код

        if(o instanceof Cat){
            return "Кот";
        }else if(o instanceof Tiger){
            return "Тигр";
        }else if(o instanceof Lion){
            return "Лев";
        }else if(o instanceof Bull){
            return "Бык";
        }
        return "Животное";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
//Напиши метод, который определяет, какой объект передали в него.
//Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык», «Животное».
//Requirements:
//•	Класс Solution должен содержать классы Cat, Tiger, Lion, Bull, Pig.
//•	Класс Solution должен содержать метод String getObjectType(Object o).
//•	Метод getObjectType() должен возвращать строку "Кот", если передан объект типа Cat.
//•	Метод getObjectType() должен возвращать строку "Тигр", если передан объект типа Tiger.
//•	Метод getObjectType() должен возвращать строку "Лев", если передан объект типа Lion.
//•	Метод getObjectType() должен возвращать строку "Бык", если передан объект типа Bull.