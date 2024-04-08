package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter marks of five subjects:");
        Scanner sc=new Scanner(System.in);
        float total=500;
        System.out.println("marks of english:");
        float a=sc.nextInt();

        System.out.println("marks of hindi:");
        float b=sc.nextInt();

        System.out.println("marks of maths:");
        float c=sc.nextInt();

        System.out.println("marks of science:");
        float d=sc.nextInt();

        System.out.println("marks of sst:");
        float e=sc.nextInt();

        float sum=a+b+c+d+e;
        float percent=(sum/total)*100;
        System.out.println("percent of student:"+percent);

    }
}
