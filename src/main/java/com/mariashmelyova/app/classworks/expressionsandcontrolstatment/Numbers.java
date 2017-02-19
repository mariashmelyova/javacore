package com.mariashmelyova.app.classworks.expressionsandcontrolstatment;

/**
 * Created by mshm on 19-Feb-17.
 */
public class Numbers {

    public static boolean numberIsEven(int a){
        if (a == (a/2)*2){
            return true;
        }

        else{return false;}
    }

    public static String biggerNumber(int a, int b){
        if (a > b) {
            return a + " is bigger than " + b;
        }
        else if (a == b) {
            return a + " and " + b + "are equal";
        }
        else {
            return b + " is bigger than " + a;
        }
    }
}
