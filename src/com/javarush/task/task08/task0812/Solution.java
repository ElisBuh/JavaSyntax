package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list =new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i).equals(list.get(i+1))){
                x++;
            }
            else{
            if (x>y){
                y = x;
                x = 0;
                }
            else x = 0;}
        }
        if(x>y) y = x;
        System.out.println(y+1);

    }
}
