package com.javarush.task.task02.task0219;

/* 
Печатаем трижды
*/

public class Solution {
    public static void print3(String text) {
        System.out.print(text);
        System.out.print(" " +text+ " ");
        System.out.println(text);
        //напишите тут ваш код

    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
