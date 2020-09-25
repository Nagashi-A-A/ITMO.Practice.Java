package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inScan = new Scanner(System.in);
        int []newArr = {3,4,6,2,6,44,78,54,3,2,6,7,1,8,9,6,5,4,30,9};

        System.out.println("We have array filled with numbers" + Arrays.toString(newArr));
        System.out.println("Which number you want to delete from array?:");
        int delInt  = inScan.nextInt();
        int countArr = 0;

        for (int i = 0, si = 0; i < newArr.length; i++) {
            if (newArr[i] == delInt) {
                countArr++;
            }
        }

        int secondArr [] = new int[newArr.length - countArr];

        for (int i = 0, si = 0; i < newArr.length; i++)
        {
            if (newArr[i] == delInt)
            {
                continue;
            }
            else {
                secondArr[si++] = newArr[i];
            }
        }
            System.out.println("And now we have deleted " + delInt + " from the array: " + Arrays.toString(secondArr));
    }
}
