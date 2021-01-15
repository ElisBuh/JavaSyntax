package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int x=1;
        int y=1;

        while (x<11)
        {
            y=1;
            while (y<11)
            {
            System.out.print(y*x+" ");
            y++;
            }
            System.out.println();
            x++;

        }

    }
}
