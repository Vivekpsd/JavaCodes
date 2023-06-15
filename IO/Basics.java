import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) throws Exception {
        /*
        // code to create new file
        File myfile = new File("demo.txt");
        myfile.createNewFile();

        // code to write to file
        FileWriter myFileWriter = new FileWriter("demo.txt");
        myFileWriter.write("Hello World");
        myFileWriter.close();
        

        // reading a file
        File myFile = new File("demo.txt");
        Scanner scn = new Scanner(myFile);
        
        while(scn.hasNextLine()) {
            String line = scn.nextLine();
            System.out.println(line);
        }

        */

        // deleting a file
        File myFile = new File("demo.txt");
        if (myFile.delete()) {
            System.out.println("File got deleted!");
        }
    }
}