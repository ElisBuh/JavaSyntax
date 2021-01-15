package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader number= new BufferedReader(new InputStreamReader(System.in));

        String sA=number.readLine();
        String sB=number.readLine();
        String sC=number.readLine();

        int a=Integer.parseInt(sA);
        int b=Integer.parseInt(sB);
        int c=Integer.parseInt(sC);

        if (a+b>c&&a+c>b&&c+b>a)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");

    }
}