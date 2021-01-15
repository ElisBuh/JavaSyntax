package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName,catMother,catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,catMother,catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parent2;
        private Cat parent3;

        Cat(String name) {

            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }
        Cat(String name, Cat parent2, Cat parent3){
            this.name = name;
            this.parent = parent2;
            this.parent2 = parent2;
            this.parent3 = parent3;



        }

        @Override
        public String toString() {
            if (parent == null)
                return "The cat's name is " + name + ", no mother, " + "no father";
            else if (parent2 == null)
                return "The cat's name is " + name + ", no mother, father is " + parent.name;
            else if (parent3 == null)
                return "The cat's name is " + name + ", mother is " +parent.name+ ", no father";
            else
                return "The cat's name is " + name + ", mother is " + parent2.name + ", father is " + parent3.name;
        }
    }

}
