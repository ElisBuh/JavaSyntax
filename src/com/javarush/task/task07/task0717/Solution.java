package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Formattable;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String element:result)
        System.out.println(element);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list2 = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++){
            list2.add(i, list.get(i));
        }
           int x =1;
       for (int i = 0; i < list2.size(); i++){
           list.add(x,list2.get(i));
           x+=2;
        }
        return list;
    }
}
