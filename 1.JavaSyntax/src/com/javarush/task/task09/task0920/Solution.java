package com.javarush.task.task09.task0920;

/*
Обратный отсчёт Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //напишите тут ваш код
        }
    }
}
//Написать в цикле обратный отсчёт от 10 до 0. Для задержки использовать Thread.sleep(100);
//Обернуть вызов sleep в try..catch.
//Requirements:
//•	Программа должна выводить отсчет от 10 до 0.
//•	Программа должна выводить на экран новое число каждые 100 миллисекунд.
//•	Программа должна использовать метод "Thread.sleep(100);".
//•	Метод main должен содержать блок try..catch.
//•	Метод main не должен кидать исключений.