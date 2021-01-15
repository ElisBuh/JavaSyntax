package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(10);
        for (int i = 0; i<10; i++){
            list.add(reader.readLine());
        }
        int min = list.get(0).length();
        int max = list.get(0).length();
        for (String element:list){
            if(min > element.length()) min=element.length();
        }
        for (String element:list){
            if(max < element.length()) max=element.length();
        }
        for (String element:list){
            if (element.length()==max||element.length()==min){
                System.out.println(element);
                break;
            }
        }
    }
}
