package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number in the list:");
        int number= sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        //adding/insertion of values
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //deletion operation
       list.remove(3);

    }

}

