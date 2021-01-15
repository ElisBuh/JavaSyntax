package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
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
                System.out.print("S");
                y++;
            }
            System.out.println();
            x++;

        }

    }
}



