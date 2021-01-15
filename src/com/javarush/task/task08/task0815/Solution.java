package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Смирнов", "Сильвестр");
        map.put("Иванов", "Дмитрий");
        map.put("Кузнецов", "Арнольд");
        map.put("Соколов", "Роман");
        map.put("Попов", "Максим");
        map.put("Лебедев", "Ярослав");
        map.put("Новиков", "Роман");
        map.put("Козлов", "Михаил");
        map.put("Морозов", "Илья");
        map.put("Петров", "Алексей");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int cout=0;
        for (Map.Entry<String,String> entry:map.entrySet()){
            if(name.equals(entry.getValue()) ){
                cout++;
            }
        }
        return cout;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int cout=0;
        for (Map.Entry<String,String> entry:map.entrySet()){
            if(lastName.equals(entry.getKey()) ){
                cout++;
            }
        }
        return cout;

    }

    public static void main(String[] args) {
//        System.out.println(getCountTheSameFirstName(createMap(),"Роман"));
//        System.out.println(getCountTheSameLastName(createMap(),"Лебедев"));

    }
}
