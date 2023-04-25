package com.javarush.task.task10.task1001;

/*
Задача №1 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        System.out.println(b);
        byte c = (byte) (a * b);
        System.out.println(c);
        double f = (char) 1234.15;
        System.out.println(f);
        long d = (int) (a + f / c + b);
        System.out.println(d);
    }
}
//Правильно расставь операторы приведения типа, чтобы получился ответ: d > 0.
//int a = 0;
//int b = (byte) a + 46;
//byte c = (byte) (a*b);
//double f = (char) 1234.15;
//long d = (short) (a + f / c + b);
//Requirements:
//•	Программа должна выводить текст на экран.
//•	Нельзя менять команду вывода на экран.
//•	Метод main() должен содержать переменную a типа int.
//•	Метод main() должен содержать переменную b типа int.
//•	Метод main() должен содержать переменную c типа byte.
//•	Метод main() должен содержать переменную f типа double.
//•	Метод main() должен содержать переменную d типа long.
//•	Начальное значение переменных при инициализации менять нельзя. Можно только редактировать операторы приведения типа (добавлять/удалять/изменять).
//•	Программа должна выводить число больше, чем 0.