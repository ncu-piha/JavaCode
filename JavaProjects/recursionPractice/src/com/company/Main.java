package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
       int n =sc.nextInt();
       printIncreasing(n);
       printDecreasing(n);
    }

    public static void printIncreasing(int n){
        //base case
        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.print(n);

    }

    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        printDecreasing(n-1);
    }
}
