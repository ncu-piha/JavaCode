package com.company;

import java.util.*;

class student {
    public int ID;
    public String firstName;
    public int CGPA;
    student(int ID, String firstName, int CGPA){
        this.ID= ID;
        this.firstName= firstName;
        this.CGPA= CGPA;
    }
}
class byCGPA implements Comparator<student>{
    public int compare(student a, student b){
        if(a.CGPA==b.CGPA){
            if(a.firstName==b.firstName){
                if(a.ID>b.ID){
                    return -1;
                }
                if(a.ID<b.ID){
                    return +1;
                }
            }
            int q=a.firstName.compareToIgnoreCase(b.firstName);
            return q;
        }
        if(a.CGPA>b.CGPA){
            return -1;
        }
        if(a.CGPA<b.CGPA){
            return +1;
        }

        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<student> objList= new ArrayList<>();
        System.out.println("Enter number of inputs: ");
        int inputs= sc.nextInt();
        System.out.println("Enter details of students: ");
        int id, gpa;
        String name;
        for(int i=1;i<=inputs;i++){
            System.out.println("Enter id: ");
            id=sc.nextInt();
            System.out.println("Enter name: ");
            name=sc.next();
            System.out.println("Enter cgpa: ");
            gpa=sc.nextInt();
            objList.add(new student(id,name,gpa));
        }
        Collections.sort(objList,new byCGPA());
        System.out.println("CGPA Sorted List is: ");
        for(int i=0;i<objList.size();i++){
            System.out.println("ID: "+objList.get(i).ID+" Name: "+objList.get(i).firstName+" CGPA: "+objList.get(i).CGPA);
        }
    }
}
