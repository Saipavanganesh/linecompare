package com.lineComparision;

import java.util.Scanner;
import java.lang.Math;
import java.lang.Double;
public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to Line comparison computation program");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for first line");
        System.out.println("Enter first co-ordinates:");
        System.out.println("Enter x1 value:");
        double x1 = sc.nextDouble();
        System.out.println("Enter y1 value:");
        double y1 = sc.nextDouble();
        System.out.println("Enter x2 value:");
        double x2 = sc.nextDouble();
        System.out.println("Enter y2 value:");
        double y2 = sc.nextDouble();
        double length1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println(length1);

        System.out.println("Enter coordinates for second line");
        System.out.println("Enter first co-ordinates:");
        System.out.println("Enter x3 value:");
        double x3 = sc.nextDouble();
        System.out.println("Enter y3 value:");
        double y3 = sc.nextDouble();
        System.out.println("Enter x4 value:");
        double x4 = sc.nextDouble();
        System.out.println("Enter y4 value:");
        double y4 = sc.nextDouble();
        double length2 = Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));
        System.out.println(length2);

        if(Double.toString(length1).equals(Double.toString(length2))){
            System.out.println("Both Strings are equal");
        }
        else{
            System.out.println("Both Strings are not equal");
        }
    }
}

