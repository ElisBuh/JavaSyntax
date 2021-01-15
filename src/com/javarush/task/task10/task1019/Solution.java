package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> map = new HashMap<>();
        while (true){
        String id = reader.readLine();

        if (id.equals("")){
            break;
        }

        int number = Integer.parseInt(id);
        String name = reader.readLine();

        map.put(name, number);
        }
        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getValue() + " " + entry.getKey());
        }

//        System.out.println("Id=" + id + " Name=" + name);
    }
}
