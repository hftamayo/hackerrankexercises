package sv.com.htamayo.java.datastructures.easy;
    /*
link: https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=false
score obtained: 10 of 10
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class A04SockMerchant {
    class Result {

        /*
         * Complete the 'sockMerchant' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER_ARRAY ar
         */
        static int pairsFound = 0;
        static int coincidences = 0;

        public static int sockMerchant(int n, List<Integer> ar) {
            //1. sorting the array ascendent
            Collections.sort(ar);
            //2. finding uniques values: treeSet order the results by default
            Set<Integer> treeSetUniqueValues = new TreeSet<Integer>(ar);
            //3. iterating the TreeSet and finding pairs
            for(Integer elementIndex: treeSetUniqueValues){
                for(Integer elementValue: ar){
                    if(elementValue.equals(elementIndex)){
                        coincidences++;
                    }
                }
                pairsFound += (coincidences / 2);
                coincidences = 0;
            }
            return pairsFound;
        }
    }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            int result = Result.sockMerchant(n, ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
}
