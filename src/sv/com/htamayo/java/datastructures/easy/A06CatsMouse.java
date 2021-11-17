package sv.com.htamayo.java.datastructures.easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.*;

public class A06CatsMouse {
    /*
Cats and a Mouse
link: https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=false
score obtained: 15 of 15
*/


    public class Solution {

        // Complete the catAndMouse function below.
        static String catAndMouse(int x, int y, int z) {
            String answer = "";
            int distanceCatA = z - x;
            int distanceCatB = z - y;
            if(Math.abs(distanceCatA) == Math.abs(distanceCatB)){
                answer = "Mouse C";
            } else if(Math.abs(distanceCatA) > Math.abs(distanceCatB)){
                answer = "Cat B";
            } else {
                answer = "Cat A";
            }
            return answer;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int q = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int qItr = 0; qItr < q; qItr++) {
                String[] xyz = scanner.nextLine().split(" ");

                int x = Integer.parseInt(xyz[0]);

                int y = Integer.parseInt(xyz[1]);

                int z = Integer.parseInt(xyz[2]);

                String result = catAndMouse(x, y, z);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

            scanner.close();
        }
    }
}
