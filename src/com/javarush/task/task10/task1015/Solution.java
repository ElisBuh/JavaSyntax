package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
          ArrayList<String>[] list = new ArrayList[3];
          list[0] = new ArrayList<String>();
          list[1] = new ArrayList<>();
          list[2] = new ArrayList<>();

          list[0].add("ma");
          list[1].add("fg");
          list[2].add("aa");



        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}