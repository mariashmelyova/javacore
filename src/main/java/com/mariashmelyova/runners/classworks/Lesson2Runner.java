package com.mariashmelyova.runners.classworks;


import com.mariashmelyova.app.classworks.classmethodsvaribles.NarrowingCasting;
import com.mariashmelyova.app.classworks.classmethodsvaribles.WideningCasting;

import java.text.MessageFormat;

/**
 * Created by mshm on 02-Feb-17.
 */


public class Lesson2Runner {

    public static void main(String[] args) {
        WideningCasting casting = new WideningCasting();
        casting.widening();
        int i = 123423423;
        System.out.println(((Object) i).getClass().getName());

        NarrowingCasting nCasting = new NarrowingCasting();
        nCasting.narrowing(2445.4554f);
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("OK");
            case 'C':
                System.out.println("Well done");
//                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
        String s = "";
        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s += "(" + i + ", " + j + ") ";
            }
            s += " - ";
        }
        System.out.println(Long.MIN_VALUE);
        Object object = new Object();
        String expectedToString = MessageFormat.format("{0}@{1}", Object.class.getName(), Integer.toHexString(object.hashCode()));
        System.out.println(expectedToString);
    }
}
