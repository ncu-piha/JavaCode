package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class player {
    public String name;
    public double Strikerate;
    public int id;
    public int jerseynumber;

    player(String name, double Strikerate, int id, int jerseynumber){
        this.name=name;
        this.Strikerate=Strikerate;
        this.id=id;
        this.jerseynumber=jerseynumber;
    }
}

   class byply implements Comparator<player>{


       @Override
       public int compare(player a, player b) {

           if (a.Strikerate==b.Strikerate){
               if (a.name==b.name){
                   if (a.id>b.id){
                       return -1;
                   }if (a.id<b.id){
                       return +1;

                   }

               }
               int q=a.name.compareToIgnoreCase(b.name);
               return q;
           }
           if (a.Strikerate>b.Strikerate){
               return -1;
           }
           if(a.Strikerate<b.Strikerate){
               return +1;

           }
           return 0;
    }

       }




public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<player> List= new ArrayList<>();
        System.out.println("enter the inputs of the players:");
        int input=sc.nextInt();
        for(int i=1;i<=input;i++){
            System.out.println("enter name of the player");
            String name= sc.next();

            System.out.println("enter the strikerate");
            Double Strikerate= sc.nextDouble();

            System.out.println("enter the id");
            int id=sc.nextInt();

            System.out.println("enter the jerseynumber");
            int jerseynumber= sc.nextInt();

            List.add(new player(name,Strikerate,id,jerseynumber));
        }
        Collections.sort(List,new byply());
        System.out.println("sorted list is :");
        for(int i=0;i<List.size();i++){
            System.out.println("Name:"+List.get(i).name + "Strikerate:"+List.get(i).Strikerate+"ID:"+List.get(i).id+"jerseynumber:"+List.get(i).jerseynumber);
        }
    }

    }



