/*
Write a program that will count the number of characters, words, 
and lines in a file. Words are separated by whitespace characters. 
The file name should be passed as a command-line argument 
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        String filename = args[0];

        try {
            File inputfile = new File(filename);
            BufferedReader bf = new BufferedReader(new FileReader(inputfile));
            int wordCount = 0;
            int charCount = 0;
            int lineCount = 0;
            String line;

            while((line = bf.readLine()) != null) {
                charCount += line.length();
                wordCount += line.split("\\s+").length;
                lineCount++;
            }
            bf.close();

            System.out.println("File statistics for " + filename + ":");
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }  
}
