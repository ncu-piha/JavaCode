package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //int a[n+2]];
        long a[n+2];
        for(i=1;i<=n;i++)
        {
             n=sc.nextInt();
        }
        int x=sc.nextInt();

        for(i=1;i<=n;i++)
        {
            if(a[i]==x)
            {
                System.out.println(i);
                break;
            }
        }
    }

}


