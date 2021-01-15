package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int x1,x2,x3,x4;
        x1=number/100;
        x2=number%100/10;
        x3=number%10;
        x4=x1+x2+x3;
        return x4;
        //напишите тут ваш код
    }
}