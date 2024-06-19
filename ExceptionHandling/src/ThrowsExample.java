import java.io.*;

public class ThrowsExample {
    public static void main(String[] args) {
        ThrowsExample example = new ThrowsExample();
        try {
            example.readFile("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    // Method that declares it throws IOException
    public void readFile(String filePath) throws IOException {
        FileReader file = new FileReader(filePath);
        BufferedReader fileInput = new BufferedReader(file);

        // Print the first line of the file
        System.out.println(fileInput.readLine());
        fileInput.close();
    }
}