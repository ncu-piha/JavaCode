package com.company;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        int rminutes;
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        int minutes = input.nextInt();
        int  years = minutes/525600;
        rminutes=minutes%525600;
        int months = rminutes/43200;
        rminutes=rminutes%43200;
        int days=rminutes/1440;
        rminutes=rminutes%1440;
        int hours=rminutes/60;
        rminutes=rminutes%60;
        System.out.println( years + " year " + months + " months and " + days + " days "+hours+"hours "+rminutes+" minutes");
    }
}
