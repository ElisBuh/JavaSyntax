package com.javarush.task.task10.task1012;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

//         Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }
        ArrayList<Character> listChar = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char[] strToArray = list.get(i).toCharArray();
            for (int j = 0; j < strToArray.length; j++) {
                listChar.add(strToArray[j]);
            }
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0;
            for (int j = 0; j < listChar.size(); j++) {
                if (alphabet.get(i).equals(listChar.get(j))){
                    count++;
                }
            }
            map.put(alphabet.get(i),count);
        }

        for (int i = 0; i < alphabet.size(); i++){
            System.out.println(alphabet.get(i) + " " + map.get(alphabet.get(i)));
        }
    }
}
