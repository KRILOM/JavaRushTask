package com.javarush.task.task12.task1210;

/*
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }
    public static int max(int a, int b){
        if (a > b)
            return a;
        else
            return b;
    }
    public static long max(long a, long b){
        if (a > b)
            return a;
        else
            return b;
    }
    public static double max(double a, double b){
        if (a > b)
            return a;
        else
            return b;
    }
    //Напишите тут ваши методы
}
//Напиши public static методы: int max(int, int), long max(long, long), double max(double, double).
//Каждый метод должен возвращать максимальное из двух переданных в него чисел.
//Requirements:
//•	Программа не должна выводить текст на экран.
//•	Класс Solution должен содержать четыре метода.
//•	Класс Solution должен содержать статический метод int max(int, int).
//•	Метод int max(int, int) должен возвращать максимальное из двух чисел типа int.
//•	Класс Solution должен содержать статический метод long max(long, long).
//•	Метод long max(long, long) должен возвращать максимальное из двух чисел типа long.
//•	Класс Solution должен содержать статический метод double max(double, double).