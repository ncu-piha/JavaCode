package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        displayArray(arr,0);
        displayArrayDecreasing(arr,0);
    }

    public static void displayArray(int[] arr,int idx ){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArray(arr,idx+1);
    }

    public static void displayArrayDecreasing(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        displayArrayDecreasing(arr,idx+1);
        System.out.println(arr[idx]);

    }
}
