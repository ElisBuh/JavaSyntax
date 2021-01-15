package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
"имя" захватит мир через "число" лет. Му-ха-ха!
Вася захватит мир через 8 лет. Му-ха-ха!
Вася захватит мир через 8 лет. Му-ха-ха!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        String name = reader.readLine();
        int number = Integer.parseInt(sNumber);

        System.out.println(name + " захватит мир через " + number + " лет. Му-ха-ха!");

        System.out.println("1 + 2 = " + 1 + 2);
        //напишите тут ваш код

    }
}
