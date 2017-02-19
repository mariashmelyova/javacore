package com.mariashmelyova.app.lesson4unittests;

import com.mariashmelyova.app.classworks.expressionsandcontrolstatment.TriangleCalculation;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mshm on 16-Feb-17.
 */
public class TriangleCalculationTest {
    @Test
    public void isTriangleRightAngledTest(){
        int a  = 3, b = 4, c = 5;
        Assert.assertTrue(TriangleCalculation.isTriangleRightAngled(a,b,c));

        a = 0; b = 1; c = 2;
        Assert.assertFalse(TriangleCalculation.isTriangleRightAngled(a,b,c));
    }
}
