package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Ivan", 25, "Minsk");
        Man man2 = new Man("Roma", 33, "Brest");
        Woman woman1 = new Woman("Ira", 34, "Minsk");
        Woman woman2 = new Woman("Vera", 45, "Brest");

    }

    public static class Man{
        String name;
        int age;
        String address;
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(this.name + " " + this.age + " " + this.address);
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(this.name + " " + this.age + " " + this.address);
        }
    }
}
