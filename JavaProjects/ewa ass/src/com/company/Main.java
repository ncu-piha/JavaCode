package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File myfile = new File("dictionary.txt ");
//creating a file
        try {
            myfile.createNewFile();
            System.out.println("file created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
//writing a file
        try {
            FileWriter fileWriter = new FileWriter("dictionary.txt");
            fileWriter.write(" ...the content is added and is readable");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//reading a file
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
    }
}
