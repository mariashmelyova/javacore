package com.mariashmelyova.app.lesson5utittests;

import com.mariashmelyova.app.classworks.unittesting.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by mshm on 22-Mar-17.
 */
@RunWith(JUnitParamsRunner.class)
public class DataProviderMathFunctionsTest {
    @Test
    @FileParameters(value = "src/test/resources/testdata.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderMultiplyTest(int arg1, int arg2, int expRes){
        Assert.assertEquals(expRes, MathFunc.multiply(arg1, arg2));
    }

}
