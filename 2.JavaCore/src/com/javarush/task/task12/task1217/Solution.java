package com.javarush.task.task12.task1217;

/*
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

//add interfaces here - добавь интерфейсы тут
    public interface CanFly{
        boolean canfly();
    }
    public interface CanRun{
        boolean canrun();
    }
    public interface CanSwim{
        boolean canswim();
    }
}

//Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
//Добавить в каждый интерфейс по одному методу.
//Requirements:
//•	Класс Solution должен содержать интерфейс CanFly.
//•	Класс Solution должен содержать интерфейс CanRun.
//•	Класс Solution должен содержать интерфейс CanSwim.
//•	Интерфейс CanFly должен содержать один метод.
//•	Интерфейс CanRun должен содержать один метод.
//•	Интерфейс CanSwim должен содержать один метод.