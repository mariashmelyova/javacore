package com.mariashmelyova.app.classworks.unittesting;

/**
 * Created by mshm on 16-Feb-17.
 */
public class MethodsSet {
    public static String howSwitchWorks(char grade) {

        String s = "";
        switch (grade) {
            case 'A':
                s += "Excellent! ";
                break;
            case 'B':
                s += "OK. ";
            case 'C':
                s += "Well done! ";
                break;
            case 'D':
                s += "You passed. ";
            case 'F':
                s += "Better try again. ";
                break;
            default:
                s += "Invalid grade";
        }
        if (!s.equals("Invalid grade")) {
            s += "Your grade is " + grade;
        }
        return s;
    }
}
