package com.company;

import java.util.Random;

public class MyVector {
    double x;
    double y;
    double z;

    MyVector(double a,double b, double c) {
       x = a;
       y = b;
       z = c;
    }

    static double vLength(MyVector v) {
        double length;
        length = Math.sqrt(Math.pow(v.x,2) + Math.pow(v.y,2) + Math.pow(v.z,2));
        return length;
    }
    static double scalarProduct (MyVector vOne, MyVector vTwo){
                double vScalar;
        vScalar = vOne.x * vTwo.x + vOne.y * vTwo.y + vOne.z * vTwo.z;
        return vScalar;
    }

    static MyVector crossProduct (MyVector vOne, MyVector vTwo){
        double x = vOne.y * vTwo.z - vOne.z * vTwo.y;
        double y = vOne.z * vTwo.x - vOne.x * vTwo.z;
        double z = vOne.x * vTwo.y - vOne.y * vTwo.x;
        final MyVector myVector;
        myVector = new MyVector(x, y, z);
        return myVector;
    }

    static double vectorCos (MyVector vOne, MyVector vTwo){
        double cos;
        cos = scalarProduct(vOne, vTwo)/ (vLength(vOne) * vLength(vTwo));
        return cos;

    }

    static MyVector vectorSum (MyVector vOne, MyVector vTwo) {
        MyVector sumVector;
        sumVector = new MyVector(vOne.x + vTwo.x, vOne.y + vTwo.y, vOne.z + vTwo.z);
        return sumVector;

    }

    static MyVector vectorSub (MyVector vOne, MyVector vTwo){
        MyVector subVector;
        subVector = new MyVector(vOne.x - vTwo.x, vOne.y - vTwo.y, vOne.z - vTwo.z);
        return subVector;
    }

    static MyVector [] vecArray(int n){
        MyVector [] vecArr = new MyVector[n];
        Random newRandom = new Random();
        for (int i = 0; i < n; i++){
            double x = newRandom.nextInt(30);
            double y = newRandom.nextInt(30);
            double z = newRandom.nextInt(30);
            final MyVector v = new MyVector(x, y, z);
            vecArr[i] = v;
        }
        return vecArr;
    }

}
