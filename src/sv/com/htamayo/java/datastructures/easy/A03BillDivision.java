package sv.com.htamayo.java.datastructures.easy;
/*
link: https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=false
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

public class A03BillDivision {
    class Result {

        /*
         * Complete the 'bonAppetit' function below.
         *
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY bill
         *  2. INTEGER k
         *  3. INTEGER b
         */
        static int sharedItems = 0;
        static int sharedAmount = 0;

        public static void bonAppetit(List<Integer> bill, int k, int b) {
            //1. iterate to calculate the shared bill
            for(Integer item: bill){
                if(!item.equals(bill.get(k))){
                    sharedItems += item;
                }
            }

            //2. calculate shared amount
            sharedAmount = sharedItems / 2;

            if((b - sharedAmount) == 0){
                System.out.println("Bon Appetit");
            } else{
                System.out.println((b - sharedAmount));
            }

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        Result.bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
