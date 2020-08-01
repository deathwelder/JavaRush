package ru.javarush.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cat {
    String name = null;
    int age;
    int weight;
    int strength;
    String color;
    String address;
    static int CatCount;
    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
        CatCount++;


    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;
        this.age = Integer.parseInt(null);
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public void initialize(String name) {
        this.name = name;
        this.age = 5;
        this.color = "Black";

    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public boolean fight(Cat anotherCat) {
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int score = ageScore + weightScore + strengthScore;
        return score > 0; // return score > 0 ? true : false;
    }

    public static int GetCatCount() {
        return CatCount;
    }

    public static void setCatCount(int CatCount) {

         Cat.CatCount = CatCount;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("barsik", 3, 5, 7);
        Cat cat2 = new Cat("Vaska", 1, 1, 1);
        Cat cat3 = new Cat("Martin", 10, 5, 3);



        if (cat1.fight(cat2)) {System.out.println("кот1 победил");}
        else {System.out.println("кот2 победил");}

        if (cat2.fight(cat3)) {System.out.println("кот2 победил");}
        else {System.out.println("кот3 победил");}

        if (cat3.fight(cat1)) {System.out.println("кот3 победил");}
        else {System.out.println("кот1 победил");}
    }

}
