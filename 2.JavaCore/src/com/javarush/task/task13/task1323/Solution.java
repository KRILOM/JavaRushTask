package com.javarush.task.task13.task1323;

/*
Интерфейс Updatable в классе Screen
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable{
        @Override
        public void onSelect(){

        }
        @Override
        public void refresh(){

        }
    }
}
//Реализуй интерфейс Updatable в классе Screen.
//Requirements:
//•	Интерфейс Updatable должен наследовать (extends) интерфейс Selectable.
//•	Класс Screen должен реализовывать (implements) интерфейс Updatable.
//•	В классе Screen должен быть реализован метод onSelect интерфейса Selectable.
//•	В классе Screen должен быть реализован метод refresh интерфейса Updatable.