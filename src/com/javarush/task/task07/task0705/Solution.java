package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayBig = new int[20];
        int[] arraySmall1 = new int[10];
        int[] arraySmall2 = new int[10];
        for (int i = 0; i < arrayBig.length; i++){
            arrayBig[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < arraySmall1.length; i++){
            arraySmall1[i] = arrayBig[i];
        }
        int j = 10;
        for (int i = 0; i < arraySmall2.length; i++){
            arraySmall2[i] = arrayBig[j];
            //System.out.println(arrayBig[j]);
            j++;
        }
        for (int element:arraySmall2) System.out.println(element);
    }
}
