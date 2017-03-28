package com.mariashmelyova.runners.classworks;

import com.mariashmelyova.app.classworks.loopandarrays.WhileLoop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mshm on 23-Mar-17.
 */
public class Lesson6Runner {
    public static void main(String[] args) {
        ArrayList arraylistobject = new ArrayList();
        arraylistobject.add(23);
        System.out.println(arraylistobject);
        int a = 1;

        System.out.println("Original a value " + a);

        System.out.println("Post-increment a " + a++);

        System.out.println("After post-increment" + a);

        System.out.println("Pre-increment a " + ++a);

        System.out.println("After pre-increment " + a);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int c = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        WhileLoop.numberDecrease(c, b);

        for(int i = 0; i <= 10; i++){
            i *= 5;
            System.out.println(i);
        }

        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }


        int count = 0;
        for(int i = 0; i <=20; i+=2){
            count++;
        }
        System.out.println(count);

        int [] array = {2, 4, 5, 8, 7};
         for(int i: array){
             System.out.println(i);
         }

         int arr [] = {3, 4};
        for(int i: arr){
            System.out.println(i);
        }

    }
}
