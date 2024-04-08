package com.company;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Process {
    int id;
    int burstTime;
    int priority;
    int remainingTime;
    int waitingTime;
    int turnaroundTime;
    int completionTime;
    int arrivalTime;

    public Process(int id, int burstTime, int priority, int arrivalTime) {
        this.id = id;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.arrivalTime = arrivalTime;
    }
}
public class Main {

    public static void main(String[] args) {
        List<Process> processes = new ArrayList<>();
        processes.add(new Process(1, 6, 2, 0));
        processes.add(new Process(2, 8, 1, 2));
        processes.add(new Process(3, 7, 3, 4));
        processes.add(new Process(4, 3, 4, 6));

        preemptivePriorityScheduling(processes);
    }

    public static void preemptivePriorityScheduling(List<Process> processes) {
        int currentTime = 0;
        List<Process> completedProcesses = new ArrayList<>();

        System.out.println("Gantt Chart:");
        while (!processes.isEmpty()) {
            Process currentProcess = null;
            int highestPriority = Integer.MAX_VALUE;

            for (Process process : processes) {
                if (process.arrivalTime <= currentTime && process.priority < highestPriority && process.remainingTime > 0) {
                    currentProcess = process;
                    highestPriority = process.priority;
                }
            }

            if (currentProcess != null) {
                int timeSlice = 1;
                currentProcess.remainingTime -= timeSlice;
                currentTime += timeSlice;

                if (currentProcess.remainingTime == 0) {
                    currentProcess.completionTime = currentTime;
                    currentProcess.turnaroundTime = currentProcess.completionTime - currentProcess.arrivalTime;
                    currentProcess.waitingTime = currentProcess.turnaroundTime - currentProcess.burstTime;
                    completedProcesses.add(currentProcess);
                    processes.remove(currentProcess);
                }

                System.out.print(" " + currentTime + " --> P" + currentProcess.id + " -->");
            } else {
                System.out.print("| " + currentTime + " | IDLE | ");
                currentTime++;
            }
        }

        System.out.println("\n\nProcess\tBurst Time\tPriority\tArrival Time\tWaiting Time\tTurnaround Time");
        for (Process process : completedProcesses) {
            System.out.println(process.id + "\t\t" + process.burstTime + "\t\t" +
                    process.priority + "\t\t" + process.arrivalTime + "\t\t" + process.waitingTime + "\t\t" + process.turnaroundTime);
        }

        double avgWaitingTime = completedProcesses.stream()
                .mapToDouble(process -> process.waitingTime)
                .average()
                .orElse(0);

        double avgTurnaroundTime = completedProcesses.stream()
                .mapToDouble(process -> process.turnaroundTime)
                .average()
                .orElse(0);

        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }
}

