/*
 Suppose that a text file contains an unspecified number of scores 
 separated by blanks. Write a program that prompts the user to enter 
 the file, reads the scores from the file, and displays their total
  and average
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScoreCount {
    public static void main(String[] args) {
        
        String filename = args[0];

        try {
            File inputfile = new File(filename);

            Scanner scn = new Scanner(inputfile);
            int total = 0;
            int count = 0;

            while(scn.hasNextLine()) {
                int score = scn.nextInt();
                total += score;
                count++;
            }

            System.out.println("Total Score: " + total);
            System.out.println("Average Score: " + (total/count));

            scn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
