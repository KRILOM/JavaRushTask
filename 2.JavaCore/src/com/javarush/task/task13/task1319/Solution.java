package com.javarush.task.task13.task1319;

import java.io.*;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        String outputFileName = "file.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
          //  String outputFileName = reader.readLine();
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
                    writter.write(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }



//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        while(true){
//            BufferedWriter bufferedWriter = new BufferedWriter();
//            if()
//        }

    }
}
//В этой задаче тебе нужно:
//
//Прочесть с консоли имя файла.
//Считывать строки с консоли, пока пользователь не введет строку "exit".
//Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.
//Requirements:
//•	Программа должна считывать c консоли имя файла.
//•	Создай и используй объект типа BufferedWriter.
//•	Программа не должна ничего считывать из файловой системы.
//•	Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
//•	Программа должна записать все введенные строки (включая "exit", но не включая имя файла) в файл: каждую строчку — с новой строки.
//•	Метод main должен закрывать объект типа BufferedWriter после использования.
//•	Метод main не должен выводить данные на экран.