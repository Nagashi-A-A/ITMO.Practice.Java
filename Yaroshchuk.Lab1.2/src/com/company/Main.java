package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner inScan = new Scanner(System.in);
       double a = inScan.nextDouble();
        double b = inScan.nextDouble();
        double mySum = 0;
        double h = 0;
       for (double i = 1; i <= a; i++)
       {

           //mySum += h;
           //mySum = mySum + h;
           mySum = mySum + Math.pow(i,b);
       }
        System.out.println("The algebraic sum of " + a + " numbers in " + b + " power is: " + mySum);
    }
}
