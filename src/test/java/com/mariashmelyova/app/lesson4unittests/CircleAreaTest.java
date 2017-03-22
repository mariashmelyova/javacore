package com.mariashmelyova.app.lesson4unittests;

import com.mariashmelyova.app.classworks.expressionsandcontrolstatment.CircleArea;
import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;

/**
 * Created by mshm on 19-Feb-17.
 */
public class CircleAreaTest {
    @Test
    public void circleAreaTest(){
        CircleArea circle = new CircleArea();
        double r = 2.0, expRes = 12.566370614359172;
        Assert.assertEquals(expRes, CircleArea.calculate(r), 0.001);
    }

    @Test(expected = InputMismatchException.class)
    public void circleAreaNegativeTest(){
        double r = -543.154;
        CircleArea.calculate(r);
    }

    @Test(expected = InputMismatchException.class)
    public void circleAreaNullRadius(){
        double r = 0;
        CircleArea.calculate(r);
    }

    @Test
    public void calculateBiggerArea1Test(){
        double r1 = 7;
        double r2 = 4;
        Assert.assertEquals("Area1 is bigger", CircleArea.calculateBigger(r1,r2));
    }

    @Test
    public void calculateBiggerArea2Test(){
        double r1 = 7;
        double r2 = 10;
        Assert.assertEquals("Area2 is bigger", CircleArea.calculateBigger(r1,r2));
    }

    @Test
    public void calculateBiggerEqualsAreasTest(){
        double r1 = 10;
        double r2 = 10;
        Assert.assertEquals("Areas are equal", CircleArea.calculateBigger(r1,r2));
    }

    @Test(expected = InputMismatchException.class)
    public void calculateBiggerInvalidValueTest(){
        double r1 = 0;
        double r2 = 10;
        CircleArea.calculateBigger(r1,r2);
    }
    @Test(expected = InputMismatchException.class)
    public void calculateBiggerInvalid2ValueTest(){
        double r1 = 10;
        double r2 = -10;
        CircleArea.calculateBigger(r1,r2);
    }





}
