package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        int n;
        for(int i=0;i<n/2;i++){
            if(n!=0){
                for(int j=1;j<=(7-2*n)/2;j++)
                    System.out.println(" ");
            }
            System.out.print("*");
        }
    }
}
