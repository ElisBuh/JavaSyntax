package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        int min1 = list.get(0).length()<list.get(1).length()?list.get(0).length():list.get(1).length();
        int min2 = list.get(2).length()<list.get(3).length()?list.get(2).length():list.get(3).length();
        int min3 = min1<min2?min1:min2;
        int min = min3<list.get(4).length()?min3:list.get(4).length();
        if (list.get(0).length()==min)
            System.out.println(list.get(0));
        if (list.get(1).length()==min)
            System.out.println(list.get(1));
        if (list.get(2).length()==min)
            System.out.println(list.get(2));
        if (list.get(3).length()==min)
            System.out.println(list.get(3));
        if (list.get(4).length()==min)
            System.out.println(list.get(4));


    }
}
