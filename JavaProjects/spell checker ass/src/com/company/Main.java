package com.company;

import java.io.BufferedReader;
import java.io.*;
import java.util.HashSet;
import java.util.*;

class main {

    public static void main(String[] args) throws IOException {
        Set<String> set1 = new HashSet<String>();


        FileReader a = new FileReader("dictionary.txt");
        BufferedReader b = new BufferedReader(a);
        String sr;


        while ((sr = b.readLine()) != null) {
            set1.add(sr);

        }
        Set<String> set2 = new HashSet<String>();


        FileReader c = new FileReader("words.txt");
        BufferedReader d = new BufferedReader(c);
        String src;
        while ((src = d.readLine()) != null) {
            set2.add(src);

        }
        set2.removeAll(set1);
        System.out.println(set2);

    }
}
