package com.mariashmelyova.app.classworks.expressionsandcontrolstatment;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by mshm on 14-Feb-17.
 */
public class CircleArea {
    public static final double PI = 3.14d;
    public static double calculate(double radius) {
        if (radius > 0) {
            double pi = Math.PI;
            double circleArea = pi * Math.pow(radius, 2);
            return circleArea;
        }
        else {
            System.out.println("Radius should be bigger than 0");
            throw new InputMismatchException();
        }
    }
    public static String calculateBigger(double radius1, double radius2) {
        if (radius1 > 0 && radius2 > 0) {
            double circleArea1 = PI * Math.pow(radius1, 2);
            double circleArea2 = PI * Math.pow(radius2, 2);

            if (circleArea1 > circleArea2) {
                return "Area1 is bigger";
            } else if (circleArea1 == circleArea2) {
                return "Areas are equal";
            } else {
                return "Area2 is bigger";
            }
        }
        else {
            System.out.println("Radius should be bigger than 0");
            throw new InputMismatchException();
        }

    }
}
