package com.javarush.task.task13.task1307;

/*
Параметризованый интерфейс
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>//допишите здесь ваш код
    {
        @Override
        public SimpleObject<String> getInstance(){

            return null;
        }
    }
}
//В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
//Requirements:
//•	Класс StringObject должен реализовывать интерфейс SimpleObject.
//•	Интерфейс SimpleObject в классе StringObject должен быть реализован с параметром типа String.
//•	В классе StringObject реализуй метод getInstance интерфейса SimpleObject.
//•	Дополнительные классы или интерфейсы создавать нельзя.