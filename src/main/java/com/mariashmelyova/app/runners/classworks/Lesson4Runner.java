package com.mariashmelyova.app.runners.classworks;


import com.mariashmelyova.app.classworks.expressionsandcontrolstatment.CircleArea;
import com.mariashmelyova.app.classworks.expressionsandcontrolstatment.Numbers;
import com.mariashmelyova.app.classworks.expressionsandcontrolstatment.TriangleCalculation;

import java.util.Scanner;

/**
 * Created by mshm on 14-Feb-17.
 */
public class Lesson4Runner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the circle radius: ");
        double radius = sc.nextDouble();
        System.out.println("Area is " + CircleArea.calculate(radius));

        System.out.print("Please enter the first circle radius: ");
        double radius1 = sc.nextDouble();

        System.out.print("Please enter the second circle radius2: ");
        double radius2 = sc.nextDouble();

        System.out.println(CircleArea.calculateBigger(radius1, radius2));

        System.out.println("Enter triangle sides: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (TriangleCalculation.isTriangleRightAngled(a,b,c)){
            System.out.println("Your triangle is right-angled");
        }
        else{
            System.out.println("Your triangle is not right-angled");

        }
        //Odd aor even number
        System.out.println("Please, enter the number: ");
        int number = sc.nextInt();
        if (Numbers.numberIsEven(number)){
            System.out.println(number + " is even");
        }
        else {
            System.out.println(number + " is odd");
        }

        //What number is bigger?

        System.out.println("Please, enter two numbers: ");

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(Numbers.biggerNumber(number1, number2));



    }
}

