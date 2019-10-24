package com.alevel.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MassiveMultipleNumTest {

    int [] testMassive = new int[]{3,6,13,7,24,1,5,6,21,16,22,11};
    int number = 3;

    @Test
    public void multipleNumber(){
        int [] multiple3Massive = new int[]{3,6,24,6,21};
        Assert.assertArrayEquals(multiple3Massive,MassiveMultipleNum.multipleNumber(testMassive,number));
    }

}