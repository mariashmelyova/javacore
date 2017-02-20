package com.mariashmelyova.app.lesson4unittests;

import com.mariashmelyova.app.classworks.expressionsandcontrolstatment.Numbers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mshm on 20-Feb-17.
 */
public class NumbersTest {

    @Test
    public void numberIsEvenTrueTest(){
        int a = 10;
        Assert.assertTrue(Numbers.numberIsEven(a));
    }

    @Test
    public void numberIsEvenZeroTest(){
        int a = 0;
        Assert.assertTrue(Numbers.numberIsEven(a));
    }

    @Test
    public void numberIsEvenFalseTest(){
        int a = 7;
        Assert.assertFalse(Numbers.numberIsEven(a));
    }

    @Test
    public void numberIsEvenNegativeValueTest(){
        int a = -7;
        Assert.assertFalse(Numbers.numberIsEven(a));

        int b = -10;
        Assert.assertTrue(Numbers.numberIsEven(b));
    }

    @Test
    public void biggerNumberATest(){
        int a = 2147483647, b = 100;
        Assert.assertEquals("2147483647 is bigger than 100", Numbers.biggerNumber(a, b));
    }

    @Test
    public void biggerNumberBTest(){
        int a = 4, b = 123454;
        Assert.assertEquals("123454 is bigger than 4", Numbers.biggerNumber(a, b));
    }

    @Test
    public void biggerNumberEqualsTest(){
        int a = 4, b = 4;
        Assert.assertEquals("4 and 4 are equal", Numbers.biggerNumber(a, b));
    }

    @Test
    public void biggerNumberNegativeValuesTest(){
        int a = -4, b = -2147483648;
        Assert.assertEquals("-4 is bigger than -2147483648", Numbers.biggerNumber(a, b));
    }

    @Test
    public void biggerNumberNullValueTest(){
        int a = 0, b = -2147483648;
        Assert.assertEquals("0 is bigger than -2147483648", Numbers.biggerNumber(a, b));
    }






}
