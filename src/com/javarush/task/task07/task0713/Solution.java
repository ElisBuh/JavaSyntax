package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int e:list){
            if (e%3 == 0) list1.add(e);
            else if(e%2 == 0);
            else list3.add(e);
        }

        for (int e:list){
            if(e%2 == 0) list2.add(e);
        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int e:list){
            System.out.println(e);
        }
    }
}
