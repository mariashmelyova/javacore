package com.mariashmelyova.runners.classworks;

import com.mariashmelyova.app.utils.convertors.PrimitiveConverter;

/**
 * Created by mshm on 29-Jan-17.
 */
public class Lesson3Runner {
    public static void main(String args[]) {
        PrimitiveConverter converter = new PrimitiveConverter();
        converter.charToInt('7');
        converter.floatToChar(56.464f);
        converter.intToChar(46576878);
    }
}
