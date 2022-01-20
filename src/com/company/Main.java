package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Hello, world");

        int age = 17;
        double gpa = 3.2;
        boolean isSnowing = true;
        String city = "Columbus";

        System.out.println(age + " | " + gpa + " | " + isSnowing);
        System.out.println(city);
        System.out.println(city.toUpperCase());

        float pi = 3.14f;
        System.out.println(pi);

        int dailyHighs[] = {50, 60, 70, 80, 90};

        for(int i=0; i<=4; i++){
            System.out.println(dailyHighs[i]);
        }

        int quotient = 10/4;
        System.out.println(quotient);

        double quotient2 = 10.0/4;
        System.out.println(quotient2);

        int i = 2;

        int result = ++i *2;
        System.out.println(result);

        System.out.println("what is your name?");
        String name = input.nextLine();
        System.out.println(name.toUpperCase());
    }
}
