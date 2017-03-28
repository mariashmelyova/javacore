package com.mariashmelyova.app.classworks.loopandarrays;

/**
 * Created by mshm on 23-Mar-17.
 */
public class WhileLoop {
    public static int numberDecrease(int a, int b){
        if (a <= b) {
            return 0;
        }
        else {
            do {
                System.out.println("a: " + a + "; b: " + b);
                a--;}
            while (a > b);
            System.out.println("a: " + a + "; b: " + b);
            return a;
        }
    }
}
