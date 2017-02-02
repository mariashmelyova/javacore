package com.mariashmelyova.app.classworks.classmethodsvaribles;

/**
 * Created by mshm on 02-Feb-17.
 */
public class NarrowingCasting {
    int int1 = 0;
    float float1 = 300000000000000.14159f;

    public void narrowing(){
        int1 = (int) float1;
        System.out.println(int1);
    }
}
