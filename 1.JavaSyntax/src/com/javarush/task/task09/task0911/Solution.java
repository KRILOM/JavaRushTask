package com.javarush.task.task09.task0911;

import java.util.HashMap;

/*
Исключение при работе с коллекциями Map
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
        //напишите тут ваш код
    }
}
//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//HashMap<String, String> map = new HashMap<String, String>(null);
//map.put(null, null);
//map.remove(null);
//Requirements:
//Программа должна выводить сообщение на экран.
//В программе должен быть блок try-catch.
//Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
//Выведенное сообщение должно содержать тип возникшего исключения.
//Имеющийся код в методе main не удалять.