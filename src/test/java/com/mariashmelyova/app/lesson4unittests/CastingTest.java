package com.mariashmelyova.app.lesson4unittests;

import com.mariashmelyova.app.classworks.classmethodsvaribles.NarrowingCasting;
import com.mariashmelyova.app.classworks.classmethodsvaribles.WideningCasting;
import com.mariashmelyova.app.utils.convertors.PrimitiveConverter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mshm on 22-Mar-17.
 */
public class CastingTest {
    @Test
    public void narrowingCastingTest(){
        NarrowingCasting nCasting = new NarrowingCasting();
        float f = 4564.4564f;
        int expRes = 4564;
        int actRes = nCasting.narrowing(f);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void wideningCastingTest(){
        WideningCasting wCasting  = new WideningCasting();
        double expRes = 127d;
        double actRes = wCasting.widening();
        Assert.assertEquals(expRes, actRes, 0.001);

    }

    @Test
    public void primitiveConverterFloatToCharTest(){
        PrimitiveConverter converter = new PrimitiveConverter();
        float f = 56.464f;
        char expRes = '8';
        char actRes = converter.floatToChar(f);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void primitiveConverterIntToCharTest(){
        PrimitiveConverter converter = new PrimitiveConverter();
        int i = 544678765;
        char expRes = '⍭';
        char actRes = converter.intToChar(i);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void primitiveConverterCharToIntTest(){
        PrimitiveConverter converter = new PrimitiveConverter();
        char c = '듮';
        int expRes = 46318;
        int actRes = converter.charToInt(c);
        Assert.assertEquals(expRes, actRes);
    }
}
