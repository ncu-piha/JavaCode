package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int x= sc.nextInt();
        int lastO=lastOccurrence(arr,0,x);
        System.out.println("lastOccurrence --> "+lastO);

    }

    public static int lastOccurrence(int[]arr,int idx,int x){
        if(idx==arr.length){
            return -1;
        }
       int lisa= lastOccurrence(arr,idx+1,x);
        if(lisa==-1){
            if(arr[idx]==x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return lisa;
        }
    }
}
