package com.javarush.task.task10.task1016;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        /**
         * Version 1
         */
        for (int i = 0; i < list.size(); i++) {
            int counter = 0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    counter++;
                } else{
                    result.put(list.get(i), counter );
                }
            }
        }
/**
 * Version 2
 */
        for (String s:list) {
            int counter = 0;
            if(result.containsKey(s)){
                counter = result.get(s) + 1;
                result.put(s, counter);
            }else {
                result.put(s, counter++);
            }
        }
        //напишите тут ваш код


        return result;
    }

}
//Введи с клавиатуры 20 слов в список. Посчитай, сколько раз каждое из них встречается в списке.
//Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальное слово, а второй - число раз, сколько раз данное слово встречалось в списке.
//
//Выведи содержимое словаря на экран.
//В тестах регистр (большая/маленькая буква) влияет на результат.
//Requirements:
//•	Метод countWords должен объявлять и инициализировать HashMap с типом элементов <String, Integer>.
//•	Метод countWords должен возвращать созданный словарь.
//•	Метод countWords должен добавлять в словарь ключи, соответствующие уникальным словам, и значения по этим ключам, отображающие, сколько раз встречалось слово.
//•	Программа должна выводить на экран полученный словарь.
//•	Метод main должен вызывать метод countWords.

