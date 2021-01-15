package com.javarush.task.task02.task0201;

/* 
Реализуем метод print
*/

public class Solution {

    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    public static void print(String text) {
        int x=0;
        while (x<4){
            System.out.println(text);
            x++;
        }

        //напишите тут ваш код
    }
}
