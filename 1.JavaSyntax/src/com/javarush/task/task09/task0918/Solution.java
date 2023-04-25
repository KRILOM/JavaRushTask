package com.javarush.task.task09.task0918;

/*
Все свои, даже исключения
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends IOException {
    }

    static class MyException2 extends MyException{
    }

    static class MyException3 extends IllegalArgumentException{
    }

    static class MyException4 extends MyException3{
    }
}
//Есть четыре класса MyException, MyException2, MyException3, MyException4.
//Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения.
//
//Подсказка:
//Изучи внимательно классы Exception1, Exception2, Exception3 из второй задачи этого блока.
//Requirements:
//•	В классе Solution должно быть 4 вложенных класса: MyException, MyException2, MyException3 и MyException4.
//•	Все вложенные классы должны быть унаследованы от классов исключений.
//•	Два класса из четырех должны быть checked исключениями.
//•	Два класса из четырех должны быть unchecked исключениями.