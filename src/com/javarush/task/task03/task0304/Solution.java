package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double c,d;
        c=i*0.1;
        d=c+i;
        return d;
        //напишите тут ваш код

    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
