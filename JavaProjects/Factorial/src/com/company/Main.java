package com.company;

import java.util.Scanner;

public class Main {


          static int factorial( int number){
        if (number == 0) {
            return 1;

        }
        else
            return (number*factorial(number - 1));
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        int i,fact=1;
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }

}





