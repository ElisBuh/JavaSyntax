package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(reader.readLine());
        if (x%400==0)
            System.out.println("количество дней в году: 366");
        else if (x%100==0)
            System.out.println("количество дней в году: 365");
        else if (x%4==0)
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");


    }
}