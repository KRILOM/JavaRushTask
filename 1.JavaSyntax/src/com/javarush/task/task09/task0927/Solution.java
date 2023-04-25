package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> stringCatMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            stringCatMap.put(String.valueOf(i), new Cat("Cat" + i));
        }
        return stringCatMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> catSet = new HashSet<>(map.values());
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
//Есть класс кот - Cat, с полем "имя" (String).
//Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
//Получить из Map множество(Set) всех котов и вывести его на экран.
//Requirements:
//•	Программа не должна считывать данные с клавиатуры.
//•	Метод createMap должен создавать новый объект HashMap<String, Cat>.
//•	Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
//•	Метод createMap должен возвращать созданный словарь.
//•	Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
//•	Программа должна вывести всех котов из множества на экран.