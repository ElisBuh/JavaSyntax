package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
       Zerg zerg1=new Zerg();
       zerg1.name="q";
        Zerg zerg2=new Zerg();
        zerg2.name="hw";
        Zerg zerg3=new Zerg();
        zerg3.name="he";
        Zerg zerg4=new Zerg();
        zerg4.name="hr";
        Zerg zerg5=new Zerg();
        zerg5.name="ht";
        Protoss protoss1=new Protoss();
        protoss1.name="As";
        Protoss protoss2=new Protoss();
        protoss2.name="Ad";
        Protoss protoss3=new Protoss();
        protoss3.name="Af";
        Terran terran1=new Terran();
        terran1.name="zx";
        Terran terran2=new Terran();
        terran2.name="zc";
        Terran terran3=new Terran();
        terran3.name="zv";
        Terran terran4=new Terran();
        terran4.name="zb";
        //напишите тут ваш код

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
