package com.alevel.test;

public class MassiveMinMax {

    public static int min(int [] massive){
        int min = Integer.MAX_VALUE;
        for (int value :
                massive) {
            if (value < min)
                min = value;
        }
        return min;
    }
    public static int max(int [] massive){
        int max = Integer.MIN_VALUE;
        for (int value :
                massive) {
            if (value > max)
                max = value;
        }
        return max;
    }
}
