package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(read.readLine());
        int b=Integer.parseInt(read.readLine());
        int c=Integer.parseInt(read.readLine());

        if (a==b&a==c&c==b)
            System.out.println(a+" "+b+" "+c);
        else if(a==b)
            System.out.println(a+" "+b);
        else if (a==c)
            System.out.println(a+" "+c);
        else if (b==c)
            System.out.println(b+ " " +c);
    }
}