package com.alevel.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MassiveMinMaxTest {

    int [] testMassive1 = new int[]{3,6,13,7,24,1,5,6,21,16,22,11};
    int [] testMassive2 = new int[]{14, 70,  3, 67, 79, 62, 82, 95, 23, 86, 13,  5, 68, 16,  9, 46, 35, 65, 45, 17, 38, 27, 55, 15, 88, 69};

    @Test
    public void min() {
        Assert.assertEquals(1,MassiveMinMax.min(testMassive1));
        Assert.assertEquals(3,MassiveMinMax.min(testMassive2));
    }

    @Test
    public void max() {
        Assert.assertEquals(24,MassiveMinMax.max(testMassive1));
        Assert.assertEquals(95,MassiveMinMax.max(testMassive2));
    }
}