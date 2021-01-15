package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] words = new char[string.length()];
        string.getChars(0, string.length(), words, 0);
        String newString = "";
        for (int i = 0; i < words.length; i++) {
            words[0] = Character.toUpperCase(words[0]);
            if (words[i] == ' ') {
                words[i + 1] = Character.toUpperCase(words[i + 1]);
            }
            newString += words[i];
        }
        System.out.println(newString);
    }
}
