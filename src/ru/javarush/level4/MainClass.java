package ru.javarush.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        string.trim();
        ArrayList<Character> upperMass = new ArrayList<>();
        int len = string.length();
        char[] result = string.toCharArray();
        Character.toUpperCase(string.charAt(1));
        upperMass.add(Character.toUpperCase(result[0]));
        for (int i = 1; i < len; i++) {
            int j = 0;
            if (string.charAt(i - 1) == ' ') {
                    upperMass.add(Character.toUpperCase(result[i]));
            }  else upperMass.add(result[i]);
        }


        for (int i = 0; i < upperMass.size() ; i++) {
            System.out.print(upperMass.get(i));
        }
        //напишите тут ваш код
    }

}

















