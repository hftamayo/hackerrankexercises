package sv.com.htamayo.java.leveleasy;

import java.io.*;

public class EndOfFile2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int lineNumber = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter data: ");
            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + " " +line);
                lineNumber++;
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}

/*
int firstNum, secondNum, result;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      try {
         System.out.println("Enter a first number:");
         firstNum = Integer.parseInt(br.readLine());
         System.out.println("Enter a second number:");
         secondNum = Integer.parseInt(br.readLine());
         result = firstNum * secondNum;
         System.out.println("The Result is: " + result);
      } catch (IOException ioe) {
         System.out.println(ioe);
      }
 */