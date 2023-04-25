package com.javarush.task.task09.task0908;

/*
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            String s = null;
            String m = s.toLowerCase();
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
        //напишите тут ваш код
    }
}
//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//String s = null;
//String m = s.toLowerCase();
//Requirements:
//•	Программа должна выводить сообщение на экран.
//•	В программе должен быть блок try-catch.
//•	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
//•	Выведенное сообщение должно содержать тип возникшего исключения.
//•	Имеющийся код в методе main не удалять.
