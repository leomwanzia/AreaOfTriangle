package com.leo;

import java.util.Scanner;

public class AreaOfTriangle { //public class that should match the file name
    public static void main(String[] args) { //where the execution of the program starts
        Scanner in = new Scanner(System.in); //reads from the standard input of the user

        System.out.println("Enter the base of the triangle :"); //prompt to the user
        // reading the double input of the base
        double base = in.nextDouble();

        System.out.println("Enter the height of the triangle :"); // prompt to enter the height of the triangle
        // reading the double input for the height
        double height = in.nextDouble();

        // Area = 0.5 x base x height
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is :" + area);


    }
}
