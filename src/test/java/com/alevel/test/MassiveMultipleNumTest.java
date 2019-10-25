package com.alevel.test;

import org.junit.Assert;
import org.junit.Test;

public class MassiveMultipleNumTest {

    int [] testMassive1 = new int[]{3,6,13,7,24,1,5,6,21,16,22,11};
    int [] testMassive2 = new int[]{14, 70,  3, 67, 79, 62, 82, 95, 23, 86, 13,  5, 68, 16,  9, 46, 35, 65, 45, 17, 38, 27, 55, 15, 88, 69};
    int numberForMass1 = 3;
    int numberForMass2 = 5;

    @Test
    public void multipleNumber(){
        int [] multiple3Massive = new int[]{3,6,24,6,21};
        Assert.assertArrayEquals(multiple3Massive,MassiveMultipleNum.multipleNumber(testMassive1,numberForMass1));

        int [] multiple5Massive = new int[]{70,95,5,35,65,45,55,15};
        Assert.assertArrayEquals(multiple5Massive,MassiveMultipleNum.multipleNumber(testMassive2,numberForMass2));
    }

}