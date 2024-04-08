package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        File myfile = new File("piha.txt");
        //=============Creating a file================
        try {
            myfile.createNewFile();
            System.out.println("file created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //==========Writing content in a file============
        try {
            FileWriter fileWriter = new FileWriter("piha.txt");
            fileWriter.write(" ...the content is added and is readable");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//==================Reading a file==============
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//=================deleting a file===============
        if (myfile.delete()) {
            System.out.println("deleted:" + myfile.getName());
        } else {
            System.out.println("problem occurred");
        }

        //Using iterators
        ArrayList<String> file = new ArrayList<>();
        file.add("piha");
        file.add("nona");
        file.add("Arpit");
        Iterator<String> itr = file.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("");


        //Using list iterator
        ListIterator<String> listitr = file.listIterator(file.size());
        while (listitr.hasPrevious()) {
            System.out.println(listitr.previous());
        }

        Queue<String> pq = new PriorityQueue<String>();
        pq.add("nikunj");
        pq.add("nisha");
        pq.add("rahul");
        pq.add("akshat");
        pq.add("krisha");

        //System.out.println("the priority queue is:"+pq);
        Iterator<String> itre=  pq.iterator() ;
        while(itre.hasNext()){
            System.out.println(itre.next());
        }


    }
}