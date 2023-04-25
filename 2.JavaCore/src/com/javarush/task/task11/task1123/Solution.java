package com.javarush.task.task11.task1123;


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }

        // напишите тут ваш код
        int min = Arrays.stream(inputArray).min().getAsInt();
        int max = Arrays.stream(inputArray).max().getAsInt();


        return new Pair(min, max);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
//Реализуй метод, который возвращает объект класса Pair. В поле x этого объекта должно содержаться минимальное число, а в поле y - максимальное число из массива inputArray.
//Requirements:
//•	Программа не должна считывать данные с клавиатуры.
//•	Класс Pair не изменяй.
//•	Метод main не изменяй.
//•	Допиши реализацию метода getMinimumMaximumPair: он должен возвращать пару из минимума и максимума.
//•	Программа должна вывести правильный результат.
//•	Метод getMinimumMaximumPair не должен изменять массив inputArray.