package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int[] array = getInts();

        int maximum;
        int minimum;
        Arrays.sort(array);




        maximum = array[19];
        minimum = array[0];
        System.out.print(maximum + " " + minimum);
        //for (int e:array) System.out.println(e);
    }

    public static int[]getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;

    }
}
