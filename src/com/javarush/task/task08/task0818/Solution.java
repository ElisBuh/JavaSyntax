package com.javarush.task.task08.task0818;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Смирнов", 500);
        map.put("Иванов", 300);
        map.put("Кузнецов", 2000);
        map.put("Соколов", 550);
        map.put("Попов", 200);
        map.put("Лебедев", 600);
        map.put("Новиков", 700);
        map.put("Козлов", 850);
        map.put("Морозов", 725);
        map.put("Петров", 530);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) mapIterator.next();
            if (entry.getValue() < 500) {
                mapIterator.remove();
                //System.out.println(entry.getValue());
            }
//            System.out.println(entry.getValue());
        }
//        for (Map.Entry<String, Integer> entry : map.entrySet()){
//            System.out.println(entry);
//
//        }
    }


    public static void main(String[] args) {
//       removeItemFromMap(createMap());

    }
}