package com.mariashmelyova.app.lesson5utittests;

import com.mariashmelyova.app.classworks.unittesting.SwitchCase;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by mshm on 22-Mar-17.
 */

@RunWith(JUnitParamsRunner.class)
public class SwitchCaseDataDrivenTest {

    @Test
    @FileParameters(value = "src/test/resources/gradesTest.csv")
    public void SwitchCaseTest(char grade, String expRes)     {
    Assert.assertEquals(expRes, SwitchCase.howSwitchWorks(grade));
}
}
