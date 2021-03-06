package com.mariashmelyova.app.lesson3unittesting;

import com.mariashmelyova.app.classworks.unittesting.SwitchCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mshm on 16-Feb-17.
 */
public class Homework3SwitchCaseTest {

    @Test
    public void howSwitchWorks1CaseTest(){
        SwitchCase set_grade = new SwitchCase();
        char grade = 'A';
        String expRes = "Excellent! Your grade is A";
        Assert.assertEquals(expRes, SwitchCase.howSwitchWorks(grade));
    }

    @Test
    public void howSwitchWorks2CaseTest(){
        char grade = 'B';
        String expRes = "OK. Well done! Your grade is B";
        Assert.assertEquals(expRes, SwitchCase.howSwitchWorks(grade));
    }

    @Test
    public void howSwitchWorks3CaseTest(){
        char grade = 'C';
        String expRes = "Well done! Your grade is C";
        Assert.assertEquals(expRes, SwitchCase.howSwitchWorks(grade));
    }

    @Test
    public void howSwitchWorks4CaseTest(){
        char grade = 'D';
        String expRes = "You passed. Better try again. Your grade is D";
        Assert.assertEquals(expRes, SwitchCase.howSwitchWorks(grade));
    }

    @Test
    public void howSwitchWorks5CaseTest(){
        char grade = 'F';
        String expRes = "Better try again. Your grade is F";
        Assert.assertEquals(expRes, SwitchCase.howSwitchWorks(grade));
    }

    @Test
    public void howSwitchWorks6CaseTest(){
        char grade = 'R';
        String expRes = "Invalid grade";
        Assert.assertEquals(expRes, SwitchCase.howSwitchWorks(grade));
    }




}
