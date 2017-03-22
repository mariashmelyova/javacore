package com.mariashmelyova.app.lesson3unittesting;

import com.mariashmelyova.app.classworks.unittesting.MathFunc;
import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;

/**
 * Created by mshm on 15-Feb-17.
 */
public class MathFuncTest {

    @Test
    public void multiplyTest(){
        MathFunc func = new MathFunc();
        int a = 1, b = 2, expRes = 2;
        Assert.assertEquals(expRes, MathFunc.multiply(a,b));


    }

//    @Test(expected = InputMismatchException.class)
//    public void multyplyDoubleTest(){
//        double a = 123.225, b = 45554;
//        MathFunc.multiply(a,b);
//    }
}
