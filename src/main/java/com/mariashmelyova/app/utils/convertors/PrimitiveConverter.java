package com.mariashmelyova.app.utils.convertors;

/**
 * Created by mshm on 29-Jan-17.
 */
public class PrimitiveConverter {
    public char floatToChar(float number){
        char someChar = (char) number;
        System.out.println("Input float value is " + number + ". Output char value is " + someChar);
        return someChar;
    }

    public char intToChar(int number){
        char someChar = (char) number;
        System.out.println("Input integer value is " + number + ". Output char value is " + someChar);
        return someChar;
    }

    public int charToInt(char someChar){
        int number= (int) someChar;
        System.out.println("Input char value is " + someChar + ". Output integer value is " + number);
        return someChar;
    }
}
