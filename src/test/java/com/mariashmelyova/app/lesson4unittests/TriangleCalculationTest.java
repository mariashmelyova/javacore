package com.mariashmelyova.app.lesson4unittests;

import com.mariashmelyova.app.classworks.expressionsandcontrolstatment.TriangleCalculation;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mshm on 16-Feb-17.
 */
public class TriangleCalculationTest {
    @Test
    public void triangleIsRightAngledTest(){
        TriangleCalculation triangle = new TriangleCalculation();
        int a  = 3, b = 4, c = 5;
        Assert.assertTrue(triangle.isTriangleRightAngled(a,b,c));
    }

    @Test
    public void triangleIsNotRightAngledTest(){
        int a = 5, b = 1, c = 2;
        Assert.assertFalse(TriangleCalculation.isTriangleRightAngled(a,b,c));
    }

    @Test
    public void isTriangleRightAngledNegativeInputValueTest(){
        int a = -5, b = -6, c = -2;
        Assert.assertFalse(TriangleCalculation.isTriangleRightAngled(a,b,c));
    }

    @Test
    public void isTriangleRightAngledNegativeNullValueTest(){
        int a = 0, b = 0, c = 0;
        Assert.assertFalse(TriangleCalculation.isTriangleRightAngled(a,b,c));
    }


}
