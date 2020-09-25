package com.company;

public class Main {

    public static void main(String[] args) {
	int a, b;
	boolean isPrime;

        for(a=2; a<100; a++) {
            isPrime = true;
            if (a%2==0) isPrime = false;

            for (b=2; b<(a/b); b++) {
                if((a%b) == 0) isPrime = false;
                break;
            }

            if(isPrime) {
                System.out.println(a + " is prime");
            }
        }
    }
}
