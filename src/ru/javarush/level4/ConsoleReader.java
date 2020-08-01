package ru.javarush.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {

    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        return a;
    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());
        return b;
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double c = Double.parseDouble(reader.readLine());
        return c;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean d = Boolean.parseBoolean(reader.readLine());
        return d;

    }

    public static void main(String[] args) throws Exception {

        readDouble();

    }
}
