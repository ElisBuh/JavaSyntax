package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"мама", "мыла","раму");
        list.add(1,"именно");
        list.add(3,"именно");
        list.add(5,"именно");

        for (String element:list) System.out.println(element);
    }
}
