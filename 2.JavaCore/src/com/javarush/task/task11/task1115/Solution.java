package com.javarush.task.task11.task1115;
/*
От школьника до пенсии
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Schoolboy {

    }

    public class Student extends Schoolboy{

    }

    public class Worker extends Student{

    }

    public class Retiree extends Worker{

    }

}
//Измени четыре класса: Schoolboy (школьник), Student (студент), Worker (Сотрудник), Retiree (Пенсионер).
//Унаследовать студента от школьника, сотрудника от студента, пенсионера от сотрудника.
//Requirements:
//•	В классе Solution должен быть public класс Schoolboy (школьник).
//•	В классе Solution должен быть public класс Student (студент).
//•	В классе Solution должен быть public класс Worker (Сотрудник).
//•	В классе Solution должен быть public класс Retiree (Пенсионер).
//•	Класс Student должен быть унаследован от класса Schoolboy.
//•	Класс Worker должен быть унаследован от класса Student.
//•	Класс Retiree должен быть унаследован от класса Worker.
