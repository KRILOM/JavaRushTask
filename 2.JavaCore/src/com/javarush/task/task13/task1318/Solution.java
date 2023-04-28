package com.javarush.task.task13.task1318;
import java.io.*;
import java.util.Scanner;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int data;
        while (fileInputStream.available() > 0) {
            data = fileInputStream.read();
            System.out.print((char)data);
        }
        reader.close();
        fileInputStream.close();
    }
}
//В этой задаче тебе нужно:
//
//Считать с консоли путь к файлу.
//Вывести в консоли (на экран) содержимое файла.
//Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
//Requirements:
//•	Программа должна считывать c консоли путь к файлу.
//•	Программа должна выводить на экран содержимое файла.
//•	Поток чтения из файла (FileInputStream) должен быть закрыт.
//•	BufferedReader также должен быть закрыт.