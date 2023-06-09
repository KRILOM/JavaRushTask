package com.javarush.task.task13.task1302;

/*
Пиво-2. Возвращение
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }

        }
        @Override
        public boolean isAlcoholic(){
            return true;
        }

    }
}
//Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все его методы.
//Requirements:
//•	Класс AlcoholicBeer должен реализовывать (implements) интерфейс Drink.
//•	В классе AlcoholicBeer должны быть реализованы все методы интерфейса Drink.
//•	В классе AlcoholicBeer должно содержаться только два метода.
//•	Метод isAlcoholic должен возвращать true, т.к. пиво содержит алкоголь.
//•	Программа должна выводить на экран тип напитка в зависимости от того, что возвращает метод isAlcoholic.
