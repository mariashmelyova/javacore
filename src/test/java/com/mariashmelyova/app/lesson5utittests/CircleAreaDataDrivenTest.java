package com.mariashmelyova.app.lesson5utittests;

import com.mariashmelyova.app.classworks.expressionsandcontrolstatment.CircleArea;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by mshm on 22-Mar-17.
 */
@RunWith(JUnitParamsRunner.class)
public class CircleAreaDataDrivenTest {

    @Test
    @FileParameters(value = "src/test/resources/circleAreaTest.csv")
    public void calculateBiggerAreaTest(double radius1, double radius2, String expRes){
        Assert.assertEquals(expRes, CircleArea.calculateBigger(radius1, radius2));

    }

}
