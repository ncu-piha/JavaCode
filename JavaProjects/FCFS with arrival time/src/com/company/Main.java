package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of processes: ");
        int n = sc.nextInt();


        int bt[] = new int[20];

        int at[] = new int[20];

        System.out.println("\nEnter the Burst Time for each process.");
        for (int i = 0; i < n; i++) {
            System.out.print("\nFor Process " + (i + 1) + ":");
            bt[i] = sc.nextInt();
        }

        System.out.println("\nEnter the arrival time for each process.");
        for (int j = 0; j < n; j++) {
            System.out.print("\nFor Process " + (j + 1) + ":");
            at[j] = sc.nextInt();
        }


        avg_wt_tt(n, bt, at);
    }


    private static void waiting_time(int n, int[] bt, int[] wt, int[] at) {

        int temp[] = new int[20];
        temp[0] = 0;

        for (int i = 0; i < n; i++) {
            wt[i] = 0;
            temp[i + 1] = temp[i] + bt[i];


            wt[i] = temp[i] - at[i];
        }
    }


    private static void turnaround_time(int n, int[] bt, int[] wt, int[] tt) {
        for (int i = 0; i < n; i++) {

            tt[i] = bt[i] + wt[i];
        }
    }


    private static void avg_wt_tt(int n, int[] bt, int[] at) {
        int wt[] = new int[n];
        int tt[] = new int[n];


        waiting_time(n, bt, wt, at);

        turnaround_time(n, bt, wt, tt);


        System.out.println("\nProcesses ||" + " Burst Time ||" + " Arrival Time ||" + " Waiting Time ||" + " Turn-Around Time ");

        float awt = 0;
        float att = 0;

        for (int i = 0; i < n; i++) {

            awt = awt + wt[i];


            att = att + tt[i];


            System.out.println(i + 1 + "\t  ||\t" + bt[i] + "\t||\t" + at[i] + "\t||\t" + wt[i] + "\t||\t " + tt[i]);
        }


        awt = awt / n;

        att = att / n;

        System.out.println("\nAverage waiting time = " + awt);
        System.out.println("\nAverage turn around time = " + att);
    }
}
