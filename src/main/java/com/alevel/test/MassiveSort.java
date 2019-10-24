package com.alevel.test;

public class MassiveSort {
    public static int [] sort(int [] massive){
        for(int i=0; i<massive.length;i++){
            for(int j=i+1;j<massive.length;j++){
                if(massive[i]<massive[j]){
                    int tmp = massive[i];
                    massive[i] = massive[j];
                    massive[j] = tmp;
                }
            }
        }
        return massive;
    }
}
