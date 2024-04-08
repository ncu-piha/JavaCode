package com.company;
import java.util.*;



class Process {
    String name;
    int arrivalTime;
    int burstTime;
    int remainingTime;

    public Process(String name, int arrivalTime, int burstTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<Process> processes = new ArrayList<>();
        processes.add(new Process("P1", 0, 1));
        processes.add(new Process("P2", 1, 2));
        processes.add(new Process("P3", 2, 2));
        processes.add(new Process("P4", 3 , 4 ));

        int timeQuantum = 2;

        preemptiveRoundRobin(processes, timeQuantum);
    }

    public static void preemptiveRoundRobin(ArrayList<Process> processes, int timeQuantum) {
        int n = processes.size();
        int currentTime = 0;
        int totalExecutionTime = 0;

        Queue<Process> queue = new LinkedList<>();
        ArrayList<String> ganttChart = new ArrayList<>();

        while (true) {
            boolean allProcessesDone = true;
            for (Process process : processes) {
                if (process.arrivalTime <= currentTime && process.remainingTime > 0) {
                    allProcessesDone = false;

                    if (process.remainingTime <= timeQuantum) {
                        currentTime += process.remainingTime;
                        totalExecutionTime += process.remainingTime;
                        process.remainingTime = 0;
                    } else {
                        currentTime += timeQuantum;
                        totalExecutionTime += timeQuantum;
                        process.remainingTime -= timeQuantum;
                    }

                    ganttChart.add(process.name + " - " + currentTime);
                    queue.add(process);
                    break; // Preempt the current process
                }
            }

            if (!queue.isEmpty()) {
                Process nextProcess = queue.poll();
                queue.add(nextProcess); // Move the preempted process to the end of the queue
            }

            if (allProcessesDone) {
                break;
            }
        }

        System.out.println("Gantt Chart:");
        for (String item : ganttChart) {
            System.out.print(item + " -> ");
        }
        System.out.println("End");

        System.out.println("\nProcess Table:");
        System.out.println("Process | Arrival Time | Burst Time | Completion Time | Turnaround Time | Waiting Time");
        for (Process process : processes) {
            int completionTime = process.arrivalTime;
            for (String item : ganttChart) {
                String[] parts = item.split(" - ");
                if (parts[0].equals(process.name)) {
                    completionTime = Integer.parseInt(parts[1]);
                    break;
                }
            }
            int turnaroundTime = completionTime - process.arrivalTime;
            int waitingTime = turnaroundTime - process.burstTime;
            System.out.printf("%s\t   %d\t\t%d\t\t%d\t\t%d\t\t%d%n", process.name, process.arrivalTime,
                    process.burstTime, completionTime, turnaroundTime, waitingTime);
        }

    }
        }






