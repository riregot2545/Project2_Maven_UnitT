package com.alevel.test;

import java.util.Arrays;

public class MassiveMultipleNum {

    public static int [] multipleNumber(int [] massive, int number){
        int [] buffer = new int[massive.length];
        Arrays.fill(buffer,0);
        int bufferIndex = 0;

        for (int value :
                massive) {
            if (value % number == 0){
                buffer[++bufferIndex] = value;
            }
        }
        int [] result = new int[bufferIndex];
        for (int i = 0; i < bufferIndex; i++) {
            result[i] = buffer[i];
        }
        return result;
    }

}
