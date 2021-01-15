package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x=0;
        int b;
        for (boolean isExit = false; !isExit; )
        {
            String s = reader.readLine();
            isExit = s.equals("-1");
            b = Integer.parseInt(s);
            x=x+b;

        }
        System.out.println(x);

    }
}
