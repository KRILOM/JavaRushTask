package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код

        for (int i = 0; i < array.length; i++) {
            if(isNumber(array[i])){

            }
        }
        for (int i = 0; i < array.length + 1; i++) {
            if(isGreaterThan(array[i], array[i+1])){

            }
        }


    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
//Задача: Пользователь вводит с клавиатуры список слов (и чисел).
//Слова вывести в возрастающем порядке, числа - в убывающем.
//
//Пример ввода:
//Вишня
//1
//Боб
//3
//Яблоко
//22
//0
//Арбуз
//
//Пример вывода:
//Арбуз
//22
//Боб
//3
//Вишня
//1
//0
//Яблоко
//Requirements:
//•	Программа должна считывать данные с клавиатуры.
//•	Программа должна выводить данные на экран.
//•	Выведенные слова должны быть упорядочены по возрастанию (используй готовый метод isGreaterThan).
//•	Выведенные числа должны быть упорядочены по убыванию.
//•	Метод main должен использовать метод sort.
//•	Метод sort должен использовать метод isGreaterThan.
//•	Метод sort должен использовать метод isNumber.
