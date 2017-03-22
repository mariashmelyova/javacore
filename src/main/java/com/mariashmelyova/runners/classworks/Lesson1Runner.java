package com.mariashmelyova.runners.classworks;

import com.mariashmelyova.app.classworks.classmethodsvaribles.NarrowingCasting;
import com.mariashmelyova.app.classworks.classmethodsvaribles.WideningCasting;

/**
 * Created by mshm on 22-Mar-17.
 */
public class Lesson1Runner {
    public static void main(String[] args) {
        NarrowingCasting nCasting = new NarrowingCasting();
        System.out.println(nCasting.narrowing(154.456f));

        WideningCasting wCasting = new WideningCasting();
        System.out.println(wCasting.widening());
    }
}
