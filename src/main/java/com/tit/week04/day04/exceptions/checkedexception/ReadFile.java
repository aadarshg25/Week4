package com.tit.week04.day04.exceptions.checkedexception;

import java.io.*;

public class ReadFile{
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Source.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
