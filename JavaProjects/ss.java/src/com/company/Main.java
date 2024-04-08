package com.company;

public class Main {

    public static void main(String[] args) {

	for(int i=0,k=0;i<4;i++,k++){
        for(int j=0;j<4-k;j++) {
            System.out.print("*");

        }
        System.out.println("");
    }
    }
}
