package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    double[] newArr = new double[10];
        for (int i = 0; i < newArr.length - 1; i++) {
            newArr [i] = Math.random()+5;
        }
        System.out.println("before sort:");
        System.out.println(Arrays.toString(newArr));
        
        for (int i = 0; i < newArr.length; i++) {
            int b = i;
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[j] < newArr[b]) {
                    b = j;
                }
            }
            double tmp = newArr[i];
            newArr[i] = newArr[b];
            newArr[b] = tmp;
        }
        System.out.println("After sort:");
        System.out.println(Arrays.toString(newArr));
    }
}
