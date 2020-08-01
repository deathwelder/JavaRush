package ru.javarush.level4;

public class StringHelper {
    public static void main(String[] args) {

       System.out.println(multiply("Amigo ", 15));
    }

    public static String multiply(String s) {
        String result = "";
        for (int i = 0; i < 4; i++) {
            result = result+s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + s;

        }
        return result;
    }
}
