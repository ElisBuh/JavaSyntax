package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {

    public static String readString() throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String strin = reader.readLine();
        return strin;
    }

    public static int readInt() throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int in = Integer.parseInt(reader.readLine());
        return in;

    }

    public static double readDouble() throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        double doub = Double.parseDouble(reader.readLine());
        return doub;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        boolean bool = Boolean.parseBoolean(reader.readLine());
        return bool;

    }

    public static void main(String[] args) throws Exception {

    }
}
