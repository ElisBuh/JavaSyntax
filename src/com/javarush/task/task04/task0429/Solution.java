package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int A=0, B=0, C=0;
        int Aa=0,Bb=0, Cc=0;

        if (a>0) A=1;
        else if (a==0) A=0;
        else Aa=1;

        if (b>0) B=1;
        else if (b==0) B=0;
        else Bb=1;

        if (c>0) C=1;
        else if (c==0) C=0;
        else Cc=1;

        System.out.println("количество отрицательных чисел: " + (Aa+Bb+Cc));
        System.out.println("количество положительных чисел: " + (A+B+C));

    }
}
