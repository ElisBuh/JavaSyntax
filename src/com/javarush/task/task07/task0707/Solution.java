package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hi");
        list.add("lol");
        list.add("As");
        list.add("Pol");
        list.add("Son");
        System.out.println(list.size());
        for (String e:list) System.out.println(e);

    }
}
