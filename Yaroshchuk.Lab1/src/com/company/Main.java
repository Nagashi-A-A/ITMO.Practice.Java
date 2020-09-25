package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double rArr [] = new double [50];
        double maxNum = 0;
        double minNum = 0;
        int z = 0;
        for (int i = 0; i < rArr.length; i++) {
            rArr [i] = Math.random()+5;
        }

        for (int i = 0; i < rArr.length-1; i++) {
            if (rArr[z]>rArr[i+1])
                maxNum = rArr[z];
            else if (rArr[z] <= rArr[i+1])
            {
                maxNum = rArr[i + 1];
                z = i + 1;
            }
            }

        for (int i = 0; i < rArr.length-1; i++) {
            if (rArr[z]<rArr[i+1])
                minNum = rArr[z];
            else if (rArr[z] >= rArr[i+1])
            {
                minNum = rArr[i + 1];
                z = i + 1;
            }
        }

        double avNum = 0;

        for (int i = 0; i < rArr.length; i++) {
            avNum = avNum + rArr[i];
        }

        double avSum = avNum / rArr.length;

        System.out.println("The biggest number is: " + maxNum);
        System.out.println("The smallest number is: " + minNum);
        System.out.println("The average number is: " + avSum);
    }
}
