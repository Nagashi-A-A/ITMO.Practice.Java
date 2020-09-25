package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        int n = newScan.nextInt();

        MyVector [] arr = MyVector.vecArray(n);

        for (int i = 0; i < n; i++){
            System.out.println("Vector: " + i + " x: " +
                    arr[i].x + ", y: " + arr[i].y + ", z: " + arr[i].z);
        }
            double len = MyVector.vLength(arr[0]);
            double scalar = MyVector.scalarProduct(arr[0], arr[1]);
            final MyVector vProd = MyVector.crossProduct(arr[0],arr[1]);
            double cos = MyVector.vectorCos(arr[0],arr[1]);
            final MyVector vSum = MyVector.vectorSum(arr[0],arr[1]);
            final MyVector vSub = MyVector.vectorSub(arr[0],arr[1]);

                System.out.println("Vector length: " + len);
                System.out.println("Scalar product of two vectors: " + scalar);
                System.out.println("Cross product of two vectors: " + "x: " +
                        vProd.x + ", y: " + vProd.y + ", z: " + vProd.z);
                System.out.println("Cosine of an angle of two vectors: " + cos);
                System.out.println("Vector result of Addition: " + "x: " +
        vSum.x + ", y: " + vSum.y + ", z: " + vSum.z);
                System.out.println("Vector result of Subtraction : " + "x: " +
        vSub.x + ", y: " + vSub.y + ", z: " + vSub.z);

                //vSum = new MyVector(8, 8, 8);
        arr[1] = new MyVector(8, 8, 8);
        System.out.println("Vector: " + 1 + " x: " +
                arr[1].x + ", y: " + arr[1].y + ", z: " + arr[1].z);


    }
}
