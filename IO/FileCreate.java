/*
Write a program to create a file named Exercise12_15.txt if it does not exist. 
Write 100 integers created randomly into the file using text I/O. 
Integers are separated by spaces in the file. Read the data back from the file and display the data in increasing order.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FileCreate {
    public static void main(String[] args) {
        // file object for output file
        File outputFile = new File("Exercise12_15.txt");
        

        try {
            // printwriter for output file
            PrintWriter output = new PrintWriter(outputFile);

            // write 100 random no. in file
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                output.print(rand.nextInt(100) + " ");
            }
            // close printer object
            output.close();

            // read data back and display in increasing order
            Scanner input = new Scanner(outputFile);
            int[] data = new int[10];
            int count = 0;
            
            while (input.hasNextInt()) {
                data[count] = input.nextInt();
                count++;
            }
            
            input.close();
            
            Arrays.sort(data);
            
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + " ");
            }

            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
