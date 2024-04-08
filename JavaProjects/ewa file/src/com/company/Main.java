package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line:");
        Stack<String> stk=new Stack<>();
        String line=sc.nextLine();

        String[] sr=line.split("[.]");

        for(int i=0;i<sr.length;i++){
            if(i==sr.length-1){
                char c=sr[i].charAt(0);
                char c1=(char)(c-32);

                String tst=sr[i].replace(c,c1);
                stk.push(tst);

            }else{
                stk.push(sr[i]);
            }

            while(!stk.empty()){
                System.out.println(""+stk.pop());
            }
            System.out.println(".");
        }
    }
}
