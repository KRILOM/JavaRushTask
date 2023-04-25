package com.javarush.task.task09.task0919;

/*
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try{
        divideByZero();
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        }
    public static void divideByZero(){
        int divideByZero = 1 / 0;
        System.out.println(divideByZero);
    }


}
//Создай метод public static void divideByZero, в котором подели любое число на ноль и выведи на экран результат деления.
//Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
//Requirements:
//•	В классе должен быть метод public static void divideByZero().
//•	Метод divideByZero должен содержать операцию деления любого целого числа на ноль.
//•	Метод divideByZero должен вызывать System.out.println или System.out.print.
//•	Метод main должен содержать блок try..catch.
//•	Метод main должен отлавливать любые исключения метода divideByZero.
//•	Программа должна выводить стек-трейс пойманого исключения.