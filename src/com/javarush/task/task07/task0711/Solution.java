package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        String x,z;
        for (int i = 0; i < 13; i++){
            x = list.get(4);
            list.remove(4);
            list.add(0,x);
        }
        for (String element:list) System.out.println(element);
    }
}