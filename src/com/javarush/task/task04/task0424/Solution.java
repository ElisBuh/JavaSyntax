package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(reader.readLine());
       int b = Integer.parseInt(reader.readLine());
       int c = Integer.parseInt(reader.readLine());

       if (a==b)
           if (b==c);
           else
           System.out.println(3);
       else if (a==c)
           if (c==b);
           else
           System.out.println(2);
       else if (b==c)
           if (c==a);
           else
           System.out.println(1);


    }
}
