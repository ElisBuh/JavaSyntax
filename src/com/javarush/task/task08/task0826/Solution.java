package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);
        for (int i = 0; i < 5; i++)
            System.out.println(array[i]);

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        int[] copyArray = Arrays.copyOf(array, array.length);
            int j = array.length-1;
        for (int i = 0; i < array.length; i++) {
            array[i] = copyArray[j];
            j--;
        }


    }
}
