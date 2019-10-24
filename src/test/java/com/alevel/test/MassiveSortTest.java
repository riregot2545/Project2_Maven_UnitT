package com.alevel.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MassiveSortTest {

    int [] testMassive = new int[]{3,6,13,7,24,1,5,6,21,16,22,11};

    @Test
    public void sort() {
        MassiveSort.sort(testMassive);
        for (int i = 0; i <testMassive.length-1; i++) {
            Assert.assertTrue(testMassive[i]>=testMassive[i+1]);
        }
    }
}