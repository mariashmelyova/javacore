package com.mariashmelyova.app.utils.runners;

import com.mariashmelyova.app.utils.convertors.PrimitiveConverter;

/**
 * Created by mshm on 29-Jan-17.
 */
public class Lesson3Runner {
    public static void main(String args[]) {
        PrimitiveConverter converter = new PrimitiveConverter();
        converter.charToInt('7');
        converter.floatToChar(120.25f);
        converter.intToChar(55451215);
    }
}
