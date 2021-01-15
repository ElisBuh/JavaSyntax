package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();

        map.put("васька", new Cat("васька"));
        map.put("мурка", new Cat("мурка"));
        map.put("дымка", new Cat("дымка"));
        map.put("рыжик", new Cat("рыжик"));
        map.put("серый", new Cat("серый"));
        map.put("снежок", new Cat("снежок"));
        map.put("босс", new Cat("босс"));
        map.put("борис", new Cat("борис"));
        map.put("барсик", new Cat("барсик"));
        map.put("гарфи", new Cat("гарфи"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> entaySet = new HashSet<>(map.values());
        return entaySet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
