package com.company;

class Mythread extends Thread{
    private int count;
    public Mythread(int count){
        this.count = count;
    }
    public void run() {
        count++;
        if(count<50) {

           // System.out.println("I am thread " + count);
            Mythread t1 = new Mythread(count);
            t1.start();
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hello from Thread  "+ count );
    }
}
   public class Main {
    public static void main(String[] args) {
        Mythread t1 = new Mythread(0);
        t1.start();
    }
}