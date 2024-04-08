package com.company;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {

        int choice = 0;
        int[] a = new int[5];
        Scanner s = new Scanner(System.in);

        System.out.print("Enter 5 Numbers for the Array: ");
        for(int i=0; i<5; i++)
            a[i] = s.nextInt();

        System.out.println("----------------MENU---------------");
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Alternate Add");
        choice= s.nextInt();
        switch (choice)
        {
            case 1:

                System.out.print("Sum of all : ");
                int sum = 0;
                for(int i=0;i<a.length;i++)
                {

                    sum += a[i];
                }
                System.out.println(sum);
                break;

            case 2:
            {
                System.out.print("Sum of alternate : ");
                int jam=0;
                for(int i=0;i<a.length;i=i+2)
                {
                    jam += a[i];
                }
                System.out.println(jam);
                break;
            }
        }
    }
}
