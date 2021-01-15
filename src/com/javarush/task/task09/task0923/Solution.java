package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
//        String str = "Мама мыла раму.";
        char[] words = new char[str.length()];
        str.getChars(0, str.length(), words, 0);
        ArrayList<Character> glas = new ArrayList<>();
        ArrayList<Character> soglas = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            boolean x = isVowel(words[i]);
            if (x == true) {
                glas.add(words[i]);
            }
            else soglas.add(words[i]);
        }
//        for (Character e:words) System.out.print(e + " ");
        for (Character e:glas) System.out.print(e + " ");
        System.out.println();
        for (Character e:soglas) {
            if (e == ' ') {}
            else
            System.out.print(e + " ");
        }


//        System.out.println(isVowel(str));
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);
//
                                                        // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}