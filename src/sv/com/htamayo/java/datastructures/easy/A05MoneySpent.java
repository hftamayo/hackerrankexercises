package sv.com.htamayo.java.datastructures.easy;
/*
link: https://www.hackerrank.com/challenges/electronics-shop/problem?isFullScreen=false
score: 5.36 of 15
failed test: 9/16
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class A05MoneySpent {
    public class Solution {
        /*
         * Complete the getMoneySpent function below.
         */

        static int getMoneySpent(int[] keyboards, int[] drives, int b) {
            /*
             * Write your code here.
             */
            List<Integer> iterateList;
            int mostExpensiveValue = 0;
            int result = -1;
            //1. copy the array's values to a list
            List<Integer> lstKb = IntStream.of(keyboards).boxed().collect(Collectors.toList());
            Collections.sort(lstKb);
            List<Integer> lstDrives = IntStream.of(drives).boxed().collect(Collectors.toList());
            Collections.sort(lstDrives);
            //2. getting the highest value of each list
            int mostExpensiveKb = lstKb.get(keyboards.length - 1);
            int mostExpensiveDv = lstDrives.get(drives.length - 1);

            //3. compare which is the list with highest value to iterate the other one
            if (mostExpensiveKb > mostExpensiveDv) {
                iterateList = lstDrives; //lstDrives will be iterated against keyboards
                mostExpensiveValue = lstKb.get(keyboards.length - 1);
            } else {
                iterateList = lstKb; //listKb will be iterated against drives
                mostExpensiveValue = lstDrives.get(drives.length - 1);
            }

            for (Integer currentElement : iterateList) {
                if ((mostExpensiveValue + currentElement) <= b) {
                    result = mostExpensiveValue + currentElement;
                    break;
                }
            }
            return result;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] bnm = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int b = Integer.parseInt(bnm[0]);

            int n = Integer.parseInt(bnm[1]);

            int m = Integer.parseInt(bnm[2]);

            int[] keyboards = new int[n];

            String[] keyboardsItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
                int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
                keyboards[keyboardsItr] = keyboardsItem;
            }

            int[] drives = new int[m];

            String[] drivesItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int drivesItr = 0; drivesItr < m; drivesItr++) {
                int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
                drives[drivesItr] = drivesItem;
            }

            /*
             * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
             */

            int moneySpent = getMoneySpent(keyboards, drives, b);

            bufferedWriter.write(String.valueOf(moneySpent));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }
}