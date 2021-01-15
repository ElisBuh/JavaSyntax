package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader number=new BufferedReader(new InputStreamReader(System.in));
        String sNum=number.readLine();
        int num=Integer.parseInt(sNum);
        if (num==1)
            System.out.println("понедельник");
        else if (num==2)
            System.out.println("вторник");
        else if (num==3)
            System.out.println("среда");
        else if (num==4)
            System.out.println("четверг");
        else if (num==5)
            System.out.println("пятница");
        else if (num==6)
            System.out.println("суббота");
        else if (num==7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");

    }
}