package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        One one=new One(1,2,3,4,5,6,7,8,9,10);
    }
}
class One{
    int x=0;
    int y=1;
    One(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9){
       while (x<10){
           System.out.print(a0*y + " ");
           System.out.print(a1*y + " ");
           System.out.print(a2*y + " ");
           System.out.print(a3*y + " ");
           System.out.print(a4*y + " ");
           System.out.print(a5*y + " ");
           System.out.print(a6*y + " ");
           System.out.print(a7*y + " ");
           System.out.print(a8*y + " ");
           System.out.print(a9*y + " ");
           System.out.println("");
           y++;
           x++;
       }
    }
}
