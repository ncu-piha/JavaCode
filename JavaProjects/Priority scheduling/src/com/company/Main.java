package com.company;
import java.util.*;

//class Process {
//    int id;
//    int arrivalTime;
//    int burstTime;
//    int priority;
//    int completionTime;
//    int turnaroundTime;
//    int waitingTime;
//
//    public Process(int id, int arrivalTime, int burstTime, int priority) {
//        this.id = id;
//        this.arrivalTime = arrivalTime;
//        this.burstTime = burstTime;
//        this.priority = priority;
//    }
//}
class PreemptiveScheduling {
    public class Main {


        public static void main(String[] args) {

            InputHandler in = new InputHandler();
            float avgWait = 0;
            float avgTurnAround = 0;
            ArrayList<Process> processes = in.getProcesses();

            ArrayList<Process> processesCpy = InputHandler.cloneInputProcesses(processes);
            ArrayList<GanttRecord> gantt = new PreemptiveScheduling().getGantt(processes);

            //all processes
            System.out.println("List of all processes.");
            for (Process p : processesCpy) {
                System.out.println(p.toString());
            }
            System.out.println();

            //gantt chart
            System.out.println("GANTT chart");
            for (int i = 0; i < gantt.size(); i++) {
                GanttRecord gR = gantt.get(i);
                if (i == 0)
                    System.out.print(gR.toString());
                else
                    System.out.print(" --P" + gR.getProcessId() + "-- |" + gR.getOutTime() + "|");
            }
            System.out.println();
            System.out.println();

            //completion time(koha e perfundimit)
            System.out.println("Completion Time");
            for (Process p : processesCpy) {
                int completionTime = PreemptiveScheduling.getCompletionTime(p, gantt);
                System.out.println("P" + p.getProcessID() + ": t = " + completionTime);
            }

            //turn around time(koha e qendrimit)
            System.out.println("Turn Around Time");
            for (Process p : processesCpy) {
                int turnAroundTime = PreemptiveScheduling.getTurnAroundTime(p, gantt);
                System.out.println("P" + p.getProcessID() + ": t = " + turnAroundTime);
                avgTurnAround += turnAroundTime;
            }
            avgTurnAround = avgTurnAround / processesCpy.size();

            //waiting time(koha e pritjes)
            System.out.println("Waiting Time");
            for (Process p : processesCpy) {
                int waitingTime = PreemptiveScheduling.getWaitingTime(p, gantt);
                System.out.println("P" + p.getProcessID() + ": t = " + waitingTime);
                avgWait += waitingTime;
            }
            avgWait = avgWait / processesCpy.size();

            System.out.println("Average Turn Around Time : " + avgTurnAround);
            System.out.println("Average Waiting Time : " + avgWait);
        }
    }
}
