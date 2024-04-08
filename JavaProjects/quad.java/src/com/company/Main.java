
	package com.company;

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.print("Enter the value of a: ");
                int a = input.nextInt();
                System.out.print("Enter the value of b: ");
                int b = input.nextInt();
                System.out.print("Enter the value of c: ");
                int c = input.nextInt();
                double d= b * b - 4.0 * a * c;
                if (d> 0.0)
                {
                    double r1 =-b + Math.pow(d, 0.5) / 2.0 * a;
                    double r2 = -b - Math.pow(d, 0.5) / 2.0 * a;
                    System.out.println("The roots are " + r1 + " and " + r2);
                }
                else if (d == 0.0)
                {
                    double r1 = -b / 2.0 * a;
                    double r2 = -b / 2.0 * a;
                    System.out.println("The root is " + r1+ "and"+r2);
                }
                else
                {

                    System.out.println("Roots are imaginary");
                }
            }
        }



