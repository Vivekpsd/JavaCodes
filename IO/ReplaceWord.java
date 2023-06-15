/* 
Write a program that removes all the occurrences of a specified 
string from a text file. For example, invoking java Exercise12_11 John 
filename removes the string John from the specified file. 
Your program should get the arguments from the command line.
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceWord {
    public static void main(String[] args) {
        String filename = args[0];
        String toReplace = args[1];

        try {
            File checkFile = new File(filename);
            BufferedReader br = new BufferedReader(new FileReader(checkFile));
            StringBuilder str = new StringBuilder();

            String line;

            while((line = br.readLine()) != null) {
                line = line.replaceAll(toReplace, "");
                str.append(line).append('\n');
            }

            br.close();

            FileWriter writer = new FileWriter(checkFile);
            writer.write(str.toString());
            writer.close();

            System.out.println("Removed all occurrences of \"" + toReplace + "\" from " + checkFile);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
