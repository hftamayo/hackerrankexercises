package sv.com.htamayo.java.leveleasy;
/*
reading data from file
 */
import java.io.*;

public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int lineNumber = 1;
        try (FileReader reader = new FileReader("src/sv/com/htamayo/java/leveleasy/eof.txt");
             BufferedReader br = new BufferedReader(reader)) {

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
