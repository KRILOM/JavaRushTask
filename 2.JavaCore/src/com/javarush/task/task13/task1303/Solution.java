package com.javarush.task.task13.task1303;

/*
Пиво с колой не мешать
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        print(new Beer());
        print(new Cola());
    }

    private static void print(Drink drink) {
        System.out.println(drink.getClass().getSimpleName());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class Beer implements Drink{
        @Override
        public boolean isAlcoholic(){
            return true;
        }
    }

    public static class Cola implements Drink{
        @Override
        public boolean isAlcoholic(){
            return false;
        }
    }
}
//Реализуй интерфейс Drink в классах Beer и Cola.
//Requirements:
//•	Класс Beer должен реализовывать (implements) интерфейс Drink.
//•	Класс Cola должен реализовывать (implements) интерфейс Drink.
//•	В классе Beer должны быть реализованы все методы интерфейса Drink.
//•	В классе Cola должны быть реализованы все методы интерфейса Drink.