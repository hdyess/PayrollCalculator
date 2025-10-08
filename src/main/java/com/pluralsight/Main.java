package com.pluralsight;

import java.io.*;

public class Main {


    public static void main(String[] args) {


        try {

            FileReader fileReader = new FileReader("employees.csv");

            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;

            while ((input = bufReader.readLine()) != null) {

                Employee emp = new Employee();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }


    } // closes main method
}// closes main class
