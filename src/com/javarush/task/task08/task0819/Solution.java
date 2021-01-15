package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.iterator().next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        Cat cat1 = new Cat();
        set.add(cat1);
        Cat cat2 = new Cat();
        set.add(cat2);
        Cat cat3 = new Cat();
        set.add(cat3);
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat e: cats) System.out.println(e);
    }

    public static class Cat{
//        public Cat() {
//            String name;
//        }

    }
}
