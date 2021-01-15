package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sx = reader.readLine();
        int x = Integer.parseInt(sx);
        int xL= sx.length();

        if(x==0);
        else if ((x%2)==0&&xL==1)
            System.out.println("четное однозначное число");
        else if ((x%2)>0&&xL==1)
            System.out.println("нечетное однозначное число");
        else if ((x%2)==0&&xL==2)
            System.out.println("четное двузначное число");
        else if ((x%2)>0&&xL==2)
            System.out.println("нечетное двузначное число");
        else if ((x%2)==0&&xL==3)
            System.out.println("четное трехзначное число");
        else if ((x%2)>0&&xL==3)
            System.out.println("нечетное трехзначное число");



    }
}
