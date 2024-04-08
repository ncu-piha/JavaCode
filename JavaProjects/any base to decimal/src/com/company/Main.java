package com.company;

import java.util.Scanner;

public class Main {

//    public static int getValue(int n,int b){
//        int p=1;
//        int rv=0;
//        while (n > 0) {
//
//            int dig=n%10;
//            n=n/10;
//            rv+= dig*p;
//            p=p*b;
//        }
//        return rv;
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int b=sc.nextInt();
//        int dn=getValue(n,b);
//        System.out.println(dn);

        int n =sc.nextInt();
        int[] arr=new int[n];
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }
         int max=arr[0];
         for(int i=1;i<arr.length;i++){
             if(arr[i]>max){
                 max=arr[i];
             }

         }
         for(int floor=max;floor>=1;floor--){
             for(int i=0;i<arr.length;i++){
                 if(arr[i]>=floor){
                     System.out.println("*");
                 }else{
                     System.out.println("\t");
                 }
             }
             System.out.println();
         }
    }
}
