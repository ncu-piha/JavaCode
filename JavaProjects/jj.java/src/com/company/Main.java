package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

 class Main {
    static int maximum, minimum;
   static void findmaxmin(int[]arr)
    {
        int maxid=0,minid=0;
        for(int i=1;i<arr.length;i++) {
            if (arr[i] > arr[maxid])
                maxid = i;
            if (arr[i] < arr[minid]) {
                minid = i;
            }
            maximum = arr[maxid];
            minimum = arr[minid];
        }
        }



    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

	int [] arr=new int[n];
        System.out.println("enter values");
    for(int i=0;i<arr.length;i++) {
        arr[i] = sc.nextInt();
    }
        findmaxmin(arr);
        System.out.println("\n"+maximum+":"+minimum);
        }
        }







