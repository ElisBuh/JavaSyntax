package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int min, min1, min2, max, max1, max2;

        min1 = a < b ? a : b;
        min2 = b < c ? b : c;
        min = min1 < min2 ? min1 : min2;

        max1 = a > b ? a : b;
        max2 = b > c ? b : c;
        max = max1 > max2 ? max1 : max2;

        if (a != min && a != max)
            System.out.println(a);
        else if (b != min && b != max)
            System.out.println(b);
        else if (c != min && c != max)
            System.out.println(c);
        else if (a == b && b == c)
            System.out.println(a);
        else if (a == b)
            System.out.println(a);
        else if (b == c)
            System.out.println(b);
        else if (c == a)
            System.out.println(a);
    }
}
