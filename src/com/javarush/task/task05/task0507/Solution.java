package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int y = 0;
        while (true) {
            int x = Integer.parseInt(reader.readLine());
            if (x==-1)
            break;
            sum+=x;
            y++;
        }
        System.out.println(sum/y);
    }
}

