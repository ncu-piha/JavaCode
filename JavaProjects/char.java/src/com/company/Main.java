package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        ch=sc.next().charAt(0);
        if( (ch == 'A' )|| (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U') || ch == 'a' || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
            System.out.println("vowel");
        } else  if (ch == 'w' || ch == 'W'||ch=='B'||ch=='b'||ch=='C'||ch=='c'||ch=='d'||ch=='D'||ch=='F'||ch=='f'||ch=='G'||ch=='g'||ch=='H'||ch=='h'||ch=='I'||ch=='i'||ch=='J'||ch=='j'||ch=='K'||ch=='k'||ch=='L'||ch=='l') {
            System.out.println("consonent");
        }else
                System.out.println("neither vowel nor consonent");


    }
}
