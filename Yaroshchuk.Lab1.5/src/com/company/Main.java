package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Which Fibonacci number you want to know?");
        Scanner inScan = new Scanner(System.in);
        int a = inScan.nextInt();
        int x = 0;
        int y = 1;
        int z = 0;
        for (int i = 1; i < a; i++)
        {
            z = x + y;
            x = y;
            y = z;
        }
        System.out.println(a + "th Fibonacci number is " + z);

    }
}
