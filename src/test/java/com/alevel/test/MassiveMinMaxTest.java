package com.alevel.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MassiveMinMaxTest {

    int [] testMassive = new int[]{3,6,13,7,24,1,5,6,21,16,22,11};

    @Test
    public void min() {
        Assert.assertEquals(MassiveMinMax.min(testMassive),1);
    }

    @Test
    public void max() {
        Assert.assertEquals(MassiveMinMax.max(testMassive),24);
    }
}