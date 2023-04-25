package com.javarush.task.task09.task0912;
/*
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }
        //напишите тут ваш код
    }
}
//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//int num=Integer.parseInt("XYZ");
//System.out.println(num);
//Requirements:
//•	Программа должна выводить сообщение на экран.
//•	В программе должен быть блок try-catch.
//•	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
//•	Выведенное сообщение должно содержать тип возникшего исключения.
//•	Имеющийся код в методе main не удалять.