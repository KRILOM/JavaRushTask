package com.javarush.task.task10.task1004;

/*
Задача №4 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println((char)nine);
    }
}
//Добавь одну операцию по преобразованию типа, чтобы на экран вывелось 9.
//short number = 9;
//char zero = '0';
//int nine = (zero + number);
//Requirements:
//•	Программа должна выводить текст на экран.
//•	Нельзя менять команду вывода на экран. В ней можно только добавлять операторы приведения типа.
//•	Метод main() должен содержать переменную number типа short.
//•	Метод main() должен содержать переменную zero типа char.
//•	Метод main() должен содержать переменную nine типа int.
//•	Начальное значение переменных при инициализации менять нельзя. Можно добавлять только операторы приведения типа.
//•	Программа должна выводить число 9.