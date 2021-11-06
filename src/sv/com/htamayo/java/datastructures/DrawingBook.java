/*
link: https://www.hackerrank.com/challenges/drawing-book/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
score obtained: 9.20 of 10.0
test cases remaining: 10, 23
 */

package sv.com.htamayo.java.datastructures;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        // Write your code here
        int turnedPagesFromLast = 0;
        int turnedPagesFromBeginning = 0;

        if(n%2 == 0 && p != n){
            turnedPagesFromLast++;
        }

        //guessing turn pages from last page
        for(int i = n-1; i > p; i-=2){
            turnedPagesFromLast++;
        }

        //guessing turn pages from first page
        for(int i = 2; i <= p;i+=2){
            turnedPagesFromBeginning++;
        }

        if(turnedPagesFromBeginning < turnedPagesFromLast){
            return turnedPagesFromBeginning;
        }
        else{
            return turnedPagesFromLast;
        }
    }
}


        public class DrawingBook {
            public static void main(String[] args) throws IOException {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int p = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.pageCount(n, p);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();

                bufferedReader.close();
                bufferedWriter.close();
            }
}
