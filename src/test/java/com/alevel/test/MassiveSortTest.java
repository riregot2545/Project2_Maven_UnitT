package com.alevel.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MassiveSortTest {

    int [] testMassive1 = new int[]{3,6,13,7,24,1,5,6,21,16,22,11};
    int [] testMassive2 = new int[]{14, 70,  3, 67, 79, 62, 82, 95, 23, 86, 13,  5, 68, 16,  9, 46, 35, 65, 45, 17, 38, 27, 55, 15, 88, 69};

    @Test
    public void sort() {
        MassiveSort.sort(testMassive1);
        for (int i = 0; i <testMassive1.length-1; i++) {
            Assert.assertTrue(testMassive1[i]>=testMassive1[i+1]);
        }
        MassiveSort.sort(testMassive2);
        for (int i = 0; i <testMassive2.length-1; i++) {
            Assert.assertTrue(testMassive2[i]>=testMassive2[i+1]);
        }
    }
}