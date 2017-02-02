package com.mariashmelyova.app.classworks.classmethodsvaribles;


/**
 * Created by mshm on 02-Feb-17.
 */


public class Runner {

    public static void main(String[] args) {
        WideningCasting casting = new WideningCasting();
        casting.widening();
        int i = 123423423;
        System.out.println(((Object)i).getClass().getName());

        NarrowingCasting nCasting = new NarrowingCasting();
        nCasting.narrowing();

    }
}
