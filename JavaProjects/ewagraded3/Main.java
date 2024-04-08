package com.company;

import java.util.Scanner;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                } else if (ch == '}') {
                    boolean val1 = handleClosing(st, '{');
                    if (val1 == false) {
                        System.out.println(val);
                        return;
                    } else if (ch == ']') {
                        boolean val2 = handleClosing(st, ']');
                        if (val2 == false) {
                            System.out.println(val);
                            return;
                        }
                    }
                }


            }
        }


    }

    private static boolean handleClosing(Stack<Character> st, char corresch) {
        if(st.size()==0){
            return false;
        }else if(st.peek()!=corresch){
            return false;

        }else{
            st.pop();
            return true;
        }
    }
    }