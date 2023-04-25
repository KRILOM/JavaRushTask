package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/*
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayList = new ArrayList[2];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<>();
            arrayList[i].add(i + " added");
        }

        return arrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
//Создай массив, элементами которого будут списки строк.
//Заполни массив любыми данными и выведи их на экран.
//Requirements:
//•	Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
//•	Метод createList должен возвращать созданный массив.
//•	Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
//•	Программа должна выводить данные на экран.
//•	Метод main должен вызывать метод createList.
//•	Метод main должен вызывать метод printList.