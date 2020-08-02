package ru.javarush.level4;

import javax.xml.namespace.QName;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {


    public static void printString(String s) {
        System.out.println(s);

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double USD;

        USD = eur * exchangeRate;

        return USD;
    }

    public static double AddTenProcent(int i) {
        double j = 100;
        double k = 10;
        return ((i / j) * k) + i;
    }

    public static void printData(String mounth, int day, int year) {

        System.out.println("Дата моего рождения: " + " " + mounth + " " + day + " " + year);
    }

    public static long getVolume(int a, int b, int c) {
        return a * b * c;
    }

    public static void wtiteConsole(String s) {
        System.out.println("printing: " + s);
    }

    public static int convertToSeconds(int hours) {
        return hours * 3600;
    }

    public static void TableComplexity() {

        int[][] array = new int[11][11];

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                array[i][j] = i * j;
                System.out.print(array[i][j] + "\t");

            }
            System.out.println();
        }
    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }

    public static int GetMeteFromCentimetre(int centimetre) {
        return centimetre / 100;
    }

    public static int sumDigitsInNumber(int number) {

        char[] array = Integer.toString(number).toCharArray();
        int i1 = Character.getNumericValue(array[0]);
        System.out.println(i1);
        int i2 = Character.getNumericValue(array[1]);
        System.out.println(i2);
        int i3 = Character.getNumericValue(array[2]);
        System.out.println(i3);
        return i1 + i2 + i3;
    }

    public static void comparate(int a) {
        if (a < 5) {
            System.out.println("Число меньше 5");
        } else if (a > 5) {
            System.out.println("число больше 5");
        } else System.out.println("Число равно 5");


    }

    public static void displayClosesetToTen(int a, int b) {

        int c = abs(a - 10);
        int d = abs(b - 10);

        if (c < d) {
            System.out.println(a);
        } else if (d < c) {
            System.out.println(b);
        }


    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public static void checkInterval(int a) {
        if (a < 50 | a > 100) {
            System.out.println("Число " + a + " не попало в интервал");
        } else System.out.println("Число " + a + " попало в интервал");

    }

    public static void checkSeason(int mounth) {
        if (mounth == 1 | mounth == 2 | mounth == 12) {
            System.out.println("Зима");
        }
        if (mounth == 3 | mounth == 4 | mounth == 5) {
            System.out.println("Весна");
        }
        if (mounth == 6 | mounth == 7 | mounth == 8) {
            System.out.println("Лето");
        }
        if (mounth == 9 | mounth == 10 | mounth == 11) {
            System.out.println("Осень");
        }

    }

    public static void LeapYear() {

        System.out.print("Введите год: ");
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        // r = year;
        int b = 400;
        int a = 100;
        int c = 4;

        if (year % b == 0 | year % a == 0 | year % c == 0) {
            System.out.println(year + " - Високосный год");
        } else System.out.println(year + " - Не високосный");
    }

    public static void ExistTriangle() {
        System.out.print("Введите три стороны треугольника: ");
        Scanner sc = new Scanner(System.in);
        Scanner cc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);

        int a = sc.nextInt();
        int b = cc.nextInt();
        int c = ss.nextInt();

        if (a + b > c & a + c > b & b + c > a) {
            System.out.println("Треугольник существует");
        } else System.out.println("Треугольник не существует");
    }

    public static void Svetofor() {
        while (true) {
            double ALL_TIME = 1440;
            double ONE_HOUR = 60;
            double HOUR;
            double time = 0;
            double green;
            double GREEN_PER = 3;
            double yellow1;
            double yellow2;
            double green1;
            double green2;
            double green3 = 0;
            double green4 = 0;
            Scanner sc = new Scanner(System.in);

            double t = sc.nextInt();

            for (time = 0; time < 60; time = time + 5) {
                green1 = time;
                if (t == green1) {
                    System.out.print("Зелёный");
                }
                System.out.print(green1 + " ");

            }
            System.out.println();
            for (time = 0; time < 60; time = time + 5) {
                green2 = time + 1;
                if (t == green2) {
                    System.out.print("Зелёный");
                }
                System.out.print(green2 + " ");

            }
            System.out.println();
            for (time = 0; time < 60; time = time + 5) {
                green3 = time + 2;
                if (t == green3) {
                    System.out.print("Зелёный");
                }
                System.out.print(green3 + " ");

            }
            System.out.println();
            for (time = 0; time < 60; time = time + 5) {
                green4 = time + 3;
                //     if (t == green4) {
                //        System.out.print("Зелёный");
                //   }
                System.out.print(green4 + " ");


            }

            for (time = 2; time < 60; time = time + 5) {
                yellow1 = time + 1;
                if (t == yellow1) {
                    System.out.println("Жёлтый");
                }
                //  System.out.print(yellow1 + " ");
            }
            System.out.println();
            for (time = 2; time < 60; time = time + 5) {
                yellow2 = time + 2;
                if (t == yellow2) {
                    System.out.println("Жёлтый");
                }
                //System.out.print(yellow2 + " ");
            }


        }

    }

    public static void Equal3Numbers() {
        System.out.print("Введите три числа: ");
        Scanner sc = new Scanner(System.in);
        Scanner cc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);

        int a = sc.nextInt();
        int b = cc.nextInt();
        int c = ss.nextInt();

        if (a == b & a == c & b == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.println(a + " " + b);
        } else if (a == c) {
            System.out.println(a + " " + c);
        } else if (b == c) {
            System.out.println(b + " " + c);
        }

    }

    public static void Equals2Numbers() throws IOException {
        System.out.print("Введите 2 числа: ");
        Scanner reader1 = new Scanner(System.in);
        int a = reader1.nextInt();
        Scanner reader2 = new Scanner(System.in);
        int b = reader2.nextInt();

        if (a < b) {
            System.out.println(a);
        } else if (a > b) System.out.println(b);

        if (a == b) {
            System.out.println(a + " " + b);
        }
    }

    public static void Max4Numbers() {
        System.out.println("Введите 4 числа");
        Scanner n1 = new Scanner(System.in);
        int a = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        int b = n2.nextInt();
        Scanner n3 = new Scanner(System.in);
        int c = n3.nextInt();
        Scanner n4 = new Scanner(System.in);
        int d = n4.nextInt();


        if (a == b & b == c & c == d) {
            System.out.println(a + " " + b + " " + c + " " + d);
        } else {
            int answer = Math.max(Math.max(a, b), Math.max(c, d));
            System.out.println(answer);
        }
    }

    public static void SortOf3() {
        System.out.println("Введите 3 числа");
        Scanner n1 = new Scanner(System.in);
        int a = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        int b = n2.nextInt();
        Scanner n3 = new Scanner(System.in);
        int c = n3.nextInt();

        int nums[];
        nums = new int[3];
        nums[0] = a;
        nums[1] = b;
        nums[2] = c;
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);

    }

    public static void LenghtOfName() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Scanner ss = new Scanner(System.in);
        String b = ss.nextLine();


        if (a.equals(b)) {
            System.out.println("Имена идентичны");
        } else if (a != b & a.length() == b.length()) {
            System.out.println("Длины имён равны");
        }
    }

    public static void HowOld() {
        System.out.print("Введите своё имя: ");
        Scanner name = new Scanner(System.in);
        String a = name.nextLine();
        System.out.print("Введите ваш возраст: ");
        Scanner age = new Scanner(System.in);
        int b = age.nextInt();

        if (b < 18) {
            System.out.println("Подрасти ещё," + a);
        }


    }

    public static void FaceControl() {
        System.out.print("Введите своё имя: ");
        Scanner name = new Scanner(System.in);
        String a = name.nextLine();
        System.out.print("Введите ваш возраст: ");
        Scanner age = new Scanner(System.in);
        int b = age.nextInt();

        if (b > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }

    public static void ThreeNumbers() {
        System.out.print("Введите три числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner cc = new Scanner(System.in);
        int b = cc.nextInt();
        Scanner ss = new Scanner(System.in);
        int c = ss.nextInt();

        if (a == b & a != c) {
            System.out.println(3);
        } else if (a == c & a != b) {
            System.out.println(2);
        } else if (b == c & b != a) {
            System.out.println(1);
        }
    }

    public static void TheGoalIsSet() {
        System.out.print("Введите координаты: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner ss = new Scanner(System.in);
        int b = ss.nextInt();

        if (a > 0 & b > 0) {
            System.out.println("1");
        } else if (a < 0 & b > 0) {
            System.out.println("2");
        } else if (a < 0 & b < 0) {
            System.out.println("3");
        } else if (a > 0 & b < 0) {
            System.out.println("4");
        }

    }

    public static void isNegativeOrPozitive() {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 0 & a % 2 == 0) {
            System.out.println("отрицательное четное число");
        }
        if (a < 0 & a % 2 != 0) {
            System.out.println("отрицательное нечетное число");
        }
        if (a == 0) {
            System.out.println("ноль");
        }
        if (a > 0 & a % 2 == 0) {
            System.out.println("положительное четное число");
        }
        if (a > 0 & a % 2 != 0) {
            System.out.println("положительное нечетное число");
        }
    }

    public static void DescriptionNumber() {
        System.out.print("Введите число от 1 до 999: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0 & a >= 1 & a <= 999) {
            System.out.print("Чётное");
            if (a <= 999 & a >= 100) {
                System.out.print(" трёхзначное число");
            } else if (a <= 99 & a >= 10) {
                System.out.print(" двухзначное число");
            } else if (a <= 9 & a >= 1) {
                System.out.print(" однозначное число");
            }
        }

        if (a % 2 != 0 & a >= 1 & a <= 999) {
            System.out.print("Нечётное");
            if (a <= 999 & a >= 100) {
                System.out.print(" трёхзначное число");
            } else if (a <= 99 & a >= 10) {
                System.out.print(" двухзначное число");
            } else if (a <= 9 & a >= 1) {
                System.out.print(" однозначное число");
            }
        }
    }

    public static void isPositive() {
        System.out.print("Введите 3 числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner cc = new Scanner(System.in);
        int b = cc.nextInt();
        Scanner ss = new Scanner(System.in);
        int c = ss.nextInt();
        int count = 0;

        if (a > 0) count++;
        if (b > 0) count++;
        if (c > 0) count++;

        System.out.println(count);
    }

    public static void PositiveAndNegativeNumbers() {
        System.out.print("Введите 3 числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner cc = new Scanner(System.in);
        int b = cc.nextInt();
        Scanner ss = new Scanner(System.in);
        int c = ss.nextInt();
        int COUNT_PLUS = 0;
        int COUNT_MINUS = 0;

        if (a > 0) COUNT_PLUS++;
        if (b > 0) COUNT_PLUS++;
        if (c > 0) COUNT_PLUS++;
        if (a < 0) COUNT_MINUS++;
        if (b < 0) COUNT_MINUS++;
        if (c < 0) COUNT_MINUS++;


        System.out.println("количество отрицательных чисел: " + COUNT_MINUS + "," + "количество положительных чисел: " + COUNT_PLUS);


    }

    public static void From1To10() {
        int a = 0;
        while (a < 10) {
            a++;
            System.out.println(a);
        }
    }

    public static void From10To1() {
        int a = 10;
        while (a > 0) {
            System.out.println(a);
            a--;
        }
    }

    public static void StringNumbers() {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.print("Введите число: ");
        Scanner ss = new Scanner(System.in);
        int b = ss.nextInt();
        boolean c = false;
        int d = 0;
        while (!c) {
            System.out.println(a);
            d++;
            if (b == d) {
                c = true;
            }
        }
    }

    public static void Dollars() {
        String a = "$$$$$$$$$$";
        int i = 0;
        while (i < 10) {
            System.out.println(a);
            i++;

        }
    }

    public static void EvenNumbers() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }

    public static void FourAngales() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner ss = new Scanner(System.in);
        int b = ss.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }

    public static void Lines() {
        for (int i = 0; i < 10; i++) {
            System.out.print(8);

        }

        for (int i = 0; i < 10; i++) {
            System.out.println(8);

        }
    }

    public static void TheLetter() {
        System.out.print("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(a + " любит тебя");
        }

    }

    public static void Money() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Я никогда не буду работать за копейки. Амиго");

        }
    }

    public static void MiddleNumber() {
        System.out.print("Введите 3 числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner ss = new Scanner(System.in);
        int b = ss.nextInt();
        Scanner cc = new Scanner(System.in);
        int c = cc.nextInt();

        if (a == b & b == c) {
            System.out.println(a);
        } else if (a == b | a == c) {
            System.out.println(a);
        } else if (b == a | b == c) {
            System.out.println(b);
        } else if (c == a | c == b) {
            System.out.println(c);
        } else {
            int max = Math.max(Math.max(a, b), c);
            int min = Math.min(Math.min(a, b), c);
            int mid = a + b + c - (min + max);
            System.out.println(mid);
        }
    }

    public static void Summ() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while (true) {
            int a = sc.nextInt();
            sum = sum + a;
            if (a == -1) {
                System.out.println(sum);
                break;
            }

        }

    }

    public static void MiddleArh() {
        Scanner sc = new Scanner(System.in);
        double sum = 1;
        List<Double> array = new ArrayList<>();
        while (true) {
            double a = sc.nextDouble();
            sum = sum + a;
            if (a > 0) {
                array.add(a);
            }

            if (a == -1) {
                double middle = sum / array.size();
                System.out.println(array.size());
                System.out.println(sum);
                System.out.println(middle);
                break;

            }
        }
    }

    static class Person {
        String name;
        int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }

    public static class Man {
        String name;
        int age;
        String address;

        public String getDescription() {
            return name + " " + age + " " + address;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name) {
            this.name = name;
        }

        public Man(int age) {
            this.age = age;
        }

        public Man(int age, String address) {
            this.address = address;
        }

    }

    public static class Woman {
        String name;
        int age;
        String address;

        public String getDescription() {
            return name + " " + age + " " + address;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(String name) {
            this.name = name;
        }

        public Woman(int age) {
            this.age = age;
        }

        public Woman(int age, String address) {
            this.address = address;
        }

    }

    public static class Dog1 {
        int age;
        int height;
        String name;

        public Dog1(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }

    public static class Cat1 {
        int age;
        int height;
        String name;

        public Cat1(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }

    public static class Mouse {
        int age;
        int height;
        String name;

        public Mouse(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }

    public static void SumSecond() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int num = 0;
        while (true) {
            String s = buffer.readLine();
            if (s.equals("exit")) {
                System.out.println(sum);
                break;
            } else {
                num = Integer.parseInt(s);
                sum = sum + num;
            }
        }
    }

    public static void algorithm() throws IOException {
        System.out.print("Введите число: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(reader.readLine());
        int[] array;
        array = new int[K];
        int maximum = 0;
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

        for (int g = 0; g < array.length ; g++) {

            int N = Integer.parseInt(reader1.readLine());
            // if (N < array.length) break;

            if (N > 0) {
                array[g] = N;

        }}

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1; j++)
                    if (array[j] > array[j + 1]) {
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;

                    }
            }
            System.out.println(array[array.length - 1]);

        }
    }

    public static void EvenAndOdd() throws IOException {
        System.out.println("Введите число: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = String.valueOf(reader.readLine());
        char[] chars = n.toCharArray();
        int Even = 0;
        int Odd = 0;
        for (int i = 0; i < chars.length; i++) {
            int y = Character.getNumericValue(chars[i]);
            if (y % 2 == 0) {
                Even++;
            } else if (y % 2 != 0) {
                Odd++;
            }
        }

        System.out.println("Even: " + Even + " " + "Odd: " + Odd);


    }

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double a = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
        return a;
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double INDEX = weight / (height * height);
            if (INDEX < 18.5) {
                System.out.println("Недовес меньше чем 18.5");
            }

            if (INDEX > 18.5 & INDEX < 25) {
                System.out.println("Нормальный: между 18.5 и 25");
            }

            if (INDEX > 25 & INDEX < 30) {
                System.out.println("Избыточный вес: между 25 и 30");
            }

            if (INDEX > 30) {
                System.out.println("Ожирение: 30 или больше");
            }
        }}

    public static class Calculator {
            public static int plus(int a, int b) {
                return  a + b;
            }

            public static int minus(int a, int b) {
                return a -b;
            }

            public static int multiply(int a, int b) {
                return a * b;
            }

            public static double division(int a, int b) {
                return a / b;
            }

            public static double percent(int a, int b) {
                return ((double)a / 100) * (double)b;
            }
    }

    public static class Idea {
        public String getDescription() {
            return "FOO";
        }
    }
            public static void printIdea(Idea idea) {
            System.out.println(idea.getDescription());
            }

            public static class KissMyShinyMetalAss {
                    public static void Print() {
                        System.out.println("Я");
                    }
            }

    public static class CatParients {
        private String name;
        private CatParients Mother;
        private CatParients Father;

        CatParients(String name) {
            this.name = name;
        }

        CatParients(String name, CatParients Mother) {
            this.name = name;
            this.Mother = Mother;
        }

        CatParients(String name, CatParients Mother, CatParients Father) {
            this.name = name;
            this.Mother = Mother;
            this.Father = Father;
        }



        @Override
        public String toString() {
            if (Mother == null & Father == null)
                return "The cat's name is " + name + ", no mother " + ", no father";
            else if (Mother != null & Father == null)
                return "The cat's name is " + name + ", mother is " + Mother.name + ", no father";
            else if(Mother == null & Father != null) return "The cat's name is " + name + ", No Mother " + " father is" + Father.name;
            else if(Mother != null & Father != null)
                return "The cat's name is " + name + ", mother is " + Mother.name + ", father is" + Father.name;
            else return "БЛЯТЬ";
        }
    }

    public static void MassiveAlghoritm() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            int K = Integer.parseInt(reader.readLine());
            arr[i] = K;
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;

                    }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);

            }

        }
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            int N = Integer.parseInt(reader.readLine());
            arr[i] = N;

        }
        return arr;
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print("max is: " + max);
        return 0;
    }

    public static String[] strMassive() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[10];

        for (int i = 0; i < arr.length ; i++) {
            if (i == 8) break;
            String N = reader.readLine();
            arr[i] = N;
        }

        for (int i = 0; i < 10; i++) {
                System.out.print(arr[9 - i]);
        }
        return null;
    }

    public static void intMassive() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[10];
        int[] list = new int[10];

        for (int i = 0; i < arr.length ; i++) {
            String N = reader.readLine();
            arr[i] = N;

        }

        for (int i = 0; i < list.length ; i++) {
                list[i] = arr[i].length();
                System.out.println(list[i]);
        }
    }

    public static int[] reverseMassive() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            int N = Integer.parseInt(reader.readLine());
            list[i] = N;
        }

        for (int i = 0; i < 10 ; i++) {
            System.out.println(list[9 - i]);

        }
        return null;
    }

    public static int[] BigMassive() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        int[] list1 = new int[10];
        int[] list2 = new int[10];

        for (int i = 0; i < list.length ; i++) {
            int N = Integer.parseInt(reader.readLine());
            list[i] = N;
        }

        for (int i = 0; i <= 9 ; i++) {
            list1[i] = list[i];
            list2[i] = list[10 + i];
        }

        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);

        }

        return null;
    }

    public static int[] StreetsAndHouses() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[15];
        int ODD = 0;
        int EVEN = 0;

        for (int i = 0; i < list.length; i++) {
            int N = Integer.parseInt(reader.readLine());
            list[i] = N;
        }
        for (int i = 0; i < list.length ; i++) {

            if(i % 2 == 0 ) {
                EVEN = EVEN + list[i];
            }

            if(i % 2 != 0) {
                ODD = ODD + list[i];
            }
        }

        if (ODD > EVEN) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        if (ODD < EVEN) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        return null;
    }

    public static void FristArrayList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5 ; i++) {
             String N = reader.readLine();
             list.add(N);
        }
        System.out.print(list.size());
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }

    public static void MaxString() throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String N = reader.readLine();
            strings.add(N);
        }
        int max = strings.get(0).length();
        for (int i = 0; i < strings.size() ; i++) {
            if (strings.get(i).length() > max) {
                max = strings.get(i).length();
            }
        }

        for (int i = 0; i <  strings.size(); i++) {
            if (strings.get(i).length() == max) {
                System.out.println(strings.get(i));
            }

        }
    }

    public static void MinString() throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5 ; i++) {
            String N = reader.readLine();
            strings.add(N);
        }

        int min = strings.get(0).length();
        for (int i = 0; i < strings.size() ; i++) {
            if (strings.get(i).length() < min) {
                min = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size() ; i++) {
            if (strings.get(i).length() == min) {
                System.out.println(strings.get(i));
            }

        }
    }

    public static void BeginArraylist() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10 ; i++) {
            String N = reader.readLine();
            list.add(0, N);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static void DeleteAndPast() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String N = reader.readLine();
            list.add(N);
        }

        for (int i = 0; i < 13 ; i++) {
            list.remove(list.size() - 1);
            list.add(0, list.get(list.size() - 1));
        }

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
    
    
    public static void VeryVery() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String N = reader.readLine();
            list.add(N);
        }

        int max = list.get(0).length();
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }

        int min = list.get(0).length();
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == max) {
                System.out.println(list.get(i));
                break;
            } else  if (list.get(i).length() == min) {
                System.out.println(list.get(i));
            }
        }


    }

    public static void Jolushka() throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20 ; i++) {
            int N = Integer.parseInt(reader.readLine());
            list.add(N);
        }

        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) % 3 == 0) {
                list1.add(list.get(i));
            }

            if (list.get(i) % 2 == 0) {
                list2.add(list.get(i));
            }

            if (list.get(i) % 3 != 0 && list.get(i) % 2 != 0) {
                list3.add(list.get(i));
            }

            if (list.get(i) % 3 == 0 && list.get(i) % 2 == 0) {
                list1.add(list.get(i));
                list2.add(list.get(i));
            }
        }

    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }



}

