package com.javarush.task.task13.task1324;

import java.awt.*;

/*
Один метод в классе
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal{
        public String getName() {
            return "Fox";
        }
    }
}
//Реализуй интерфейс Animal в классе Fox.
//Поменяй код так, чтобы в классе Fox был только один метод - getName.
//Учти, что методы удалять нельзя.
//Requirements:
//•	Интерфейс Animal должен быть реализован в классе Fox.
//•	В классе Fox должен быть реализован только один метод — getName.
//•	Интерфейс Animal изменять нельзя.
//•	Дополнительные классы или интерфейсы создавать нельзя.