package com.javarush.task.task09.task0925;

/*
Статики не на своем месте
*/

public class Solution {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.A = 5;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}


//    ConditionsClass tree
//
//    Расставь модификаторы static так, чтобы пример скомпилировался.
//        Requirements:
//        •	В классе должна быть переменная A.
//        •	В классе должна быть переменная B.
//        •	В классе должна быть переменная C.
//        •	Метод main не изменять.
//        •	Метод getA не изменять.
//        •	В классе должно быть 3 статических поля.