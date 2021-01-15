package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    String name;
    int height;
    String color;
    public void initialize(String eName){
        name = eName;
    }
    public void initialize(String eName, int eHeight){
        name = eName;
        height = eHeight;
    }
    public void initialize(String eName, int eHeight, String eColor){
        name = eName;
        height = eHeight;
        color = eColor;
    }

    public static void main(String[] args) {

    }
}
