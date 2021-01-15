package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasil",2,5,1);
        cat1.name = "Vasil";
        cat1.age = 2;
        cat1.weight = 10;
        cat1.weight = 5;
        Cat cat2 = new Cat("Grish",4,1,6);
        cat2.name = "Grisha";
        cat2.age = 5;
        cat2.weight = 1;
        cat2.weight = 53;
        Cat cat3 = new Cat("tom",2,4,10);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}