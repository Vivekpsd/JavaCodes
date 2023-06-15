/*
 Create a data file with 100 lines. 
 Each line in the file consists of a faculty member’s first name, last name, 
 rank, and salary. The faculty member’s first name and last name for the 
 ith line are FirstName and LastName. The rank is randomly generated as 
 assistant, associate, and full. The salary is randomly generated as a number 
 with two digits after the decimal point. The salary for an assistant professor 
 should be in the range from 50,000 to 80,000, for associate professor from
  60,000 to 110,000, and for full professor from 75,000 to 130,000. 
  Save the file in Salary.txt.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Faculty {
        public static void main(String[] args) {
            String[] firstNames = {"Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace", "Henry", "Isabel", "Jack"};
            String[] lastNames = {"Adams", "Brown", "Clark", "Davis", "Edwards", "Franklin", "Garcia", "Harris", "Ivanov", "Johnson"};
            String[] ranks = {"assistant", "associate", "full"};

            try {
                PrintWriter output = new PrintWriter("Salary.txt");

                Random rand = new Random();

                for (int i = 0; i < 100; i++) {
                    String fn = firstNames[rand.nextInt(firstNames.length)];
                    String ln = lastNames[rand.nextInt(lastNames.length)];
                    String r = ranks[rand.nextInt(ranks.length)];
                    double salary = 0.0;

                    switch(r){
                        case "assistant":
                            salary = rand.nextDouble(50000, 80001);
                            break;
                        case "associate":
                            salary = rand.nextDouble(60000, 1100001);
                            break;
                        case "full":
                            salary = rand.nextDouble(75000, 1300001);
                            break;
                    }
                    output.printf("%s %s %s %.2f\n", fn, ln, r, salary);
                }
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
}
