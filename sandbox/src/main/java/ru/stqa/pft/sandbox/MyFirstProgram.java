package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main (String [] args) {
        hello("world");
        hello("user");
        hello("Darianna");

        double l = 5;
        System.out.println("The of a square with a side of " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("The area of a rectangle with sides " + a + " and " + b + " is equal to " + area(a,b));
    }

    public static void hello (String somebody){
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area (double len){
        return len * len;

    }
    public static double area(double a, double b){
        return a * b;
    }
}

