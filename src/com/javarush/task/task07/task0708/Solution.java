package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>(5);

        for (int i = 0; i<5; i++)
        {
        strings.add(reader.readLine());
        }
        int n= 0;
        for (String element:strings) {
            if (n<element.length()){
                n = element.length();
            }
        }
        for (String element:strings){
            if (element.length() == n){
                System.out.println(element);
            }
        }

    }
}
