package com.javarush.task.task10.task1003;

/*
Задача №3 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        System.out.println(f);
        int i = (int) f;
        System.out.println(i);
        int b = (byte) (i + f);
        System.out.println(b);
    }
}
//Добавь одну операцию по преобразованию типа, чтобы получился ответ: b = 0.
//float f = (float)128.50;
//int i = (int)f;
//int b = (int)(i + f);
//Requirements:
//•	Программа должна выводить текст на экран.
//•	Нельзя менять команду вывода на экран.
//•	Метод main() должен содержать переменную f типа float.
//•	Метод main() должен содержать переменную i типа int.
//•	Метод main() должен содержать переменную b типа int.
//•	Начальное значение переменных при инициализации менять нельзя. Можно добавлять только операторы приведения типа.
//•	Программа должна выводить число 0.
