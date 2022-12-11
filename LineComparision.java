package com.lineComparision;

import java.util.Scanner;
import java.lang.Math;
public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to Line comparison computation program");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first co-ordinates:");
        System.out.println("Enter x1 value:");
        double x1 = sc.nextDouble();
        System.out.println("Enter y1 value:");
        double y1 = sc.nextDouble();
        System.out.println("Enter x2 value:");
        double x2 = sc.nextDouble();
        System.out.println("Enter y2 value:");
        double y2 = sc.nextDouble();

        double length = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println(length);
    }
}

