package com.javarush.task.task08.task0816;

import javax.swing.text.html.HTMLDocument;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {

    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JUNE 1 2012"));
        map.put("Кузнецов", dateFormat.parse("JULY 1 2012"));
        map.put("Соколов", dateFormat.parse("AUGUST 1 2012"));
        map.put("Попов", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Лебедев", dateFormat.parse("MAY 1 2012"));
        map.put("Новиков", dateFormat.parse("JUNE 1 2012"));
        map.put("Козлов", dateFormat.parse("JUNE 1 2012"));
        map.put("Морозов", dateFormat.parse("JUNE 1 2012"));
        map.put("Петров", dateFormat.parse("JUNE 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        long timeX = dateFormat.parse("MAY 31 2012").getTime();
        long timeY = dateFormat.parse("SEPTEMBER 1 2012").getTime();
        
        Iterator mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String, Date> entry = (Map.Entry<String, Date>) mapIterator.next();
            if (entry.getValue().getTime() > timeX && entry.getValue().getTime() < timeY) {
                mapIterator.remove();
            }
        }
//        Iterator mapIterator2 =  map.entrySet().iterator();
//        while (mapIterator2.hasNext()) {
//            Map.Entry<String, Date> entry = (Map.Entry<String, Date>) mapIterator2.next();
//            System.out.println(entry.getValue());
//        }
    }

    public static void main(String[] args){
//        removeAllSummerPeople(createMap());

    }
}
