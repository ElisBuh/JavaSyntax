package com.javarush.task.task08.task0824;

import javax.net.ssl.HostnameVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> none = new ArrayList<>();
        ArrayList<Human> parentsFather = new ArrayList<>();
        ArrayList<Human> parentMother = new ArrayList<>();
        ArrayList<Human> parents = new ArrayList<>();
        Human grandFather1 = new Human("Bill", 88, true, parentsFather);
        Human grandMother1 = new Human("Ina", 90, false, parentsFather);
        Human grandFather2 = new Human("Villi", 88, true, parentMother);
        Human grandMother2 = new Human("Ganna", 90, false, parentMother);
        Human father = new Human("Kail", 55, true, parents);
        parentsFather.add(father);
        Human mother = new Human("Alla", 50, false, parents);
        parentMother.add(mother);
        Human children1 = new Human("Mo", 20, true,none);
        Human children2 = new Human("Bo", 19, false,none);
        Human children3 = new Human("Ko", 21, true,none);
        parents.add(children1);
        parents.add(children2);
        parents.add(children3);

        System.out.println(grandFather1.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        public Human(String name, int age, boolean sex, ArrayList<Human> list){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children =list;
        }
        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
