package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private String adress;
        private int numberPhone;
        private int numberPassport;

        public Human(String name) {
        }
        public Human(String name, int age){
        }
        public Human(String name, int age, boolean sex){
        }
        public Human(String name, int age, boolean sex,String adress){
        }
        public Human(String name, int age, boolean sex,String adress, int numberPhone){
        }
        public Human(String name, int age, boolean sex,String adress, int numberPhone, int numberPassport){
        }
        public Human(int age, boolean sex,String adress, int numberPhone, int numberPassport){
        }
        public Human(boolean sex,String adress, int numberPhone, int numberPassport){
        }
        public Human(String adress, int numberPhone, int numberPassport){
        }
        public Human(int numberPhone, int numberPassport){
        }
    }
}
