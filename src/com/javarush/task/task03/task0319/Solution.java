package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
"Имя" получает "число1" через "число2" лет.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();;
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();
        int number1 = Integer.parseInt(sNumber1);
        int number2 = Integer.parseInt(sNumber2);
        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");
        //напишите тут ваш код

    }
}
