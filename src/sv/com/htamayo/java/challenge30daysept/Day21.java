package sv.com.htamayo.java.challenge30daysept;
/*
https://www.hackerrank.com/challenges/30-sorting/problem?isFullScreen=false
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day21 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            int n = 3;
            int numberOfSwaps = 0;
            int currentValue = 0;
            int nextValue = 0;

            String[] aTemp = new String[3];
            aTemp[0] = "300";
            aTemp[1] = "200";
            aTemp[2] = "100";
            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aTemp[i]);
                a.add(aItem);
            }

            /*
            this code has a bug:
            the highest value is moved to the last position but the first value is always 1
            it doesn't matter 1 is not part of the data structure
            */
            /*
            for (int i = 0; i < n; i++) {
                // Track number of elements swapped during a single array traversal
                for (int j = 0; j < n-1; j++) {
                    // Swap adjacent elements if they are in decreasing order
                    if (a.get(j) > a.get(j + 1)) {
                        numberOfSwaps++;
                        temp = a.get(j);
                        a.set(j, j+1);
                        a.set(j+1, temp);
                    }
                }
                */
            for (int i = 0; i < n; i++) {
                // Track number of elements swapped during a single array traversal
                for (int j = 0; j < n-1; j++) {
                    // Swap adjacent elements if they are in decreasing order
                    currentValue = a.get(j);
                    nextValue = a.get(j+1);
                    if (currentValue > nextValue) {
                        numberOfSwaps++;
                        a.set(j, nextValue);
                        a.set(j+1, currentValue);
                    }
                }

                // If no elements were swapped during a traversal, array is sorted
                if (numberOfSwaps == 0) {
                    break;
                }
            }
            System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
            System.out.println("First Element: "+ a.get(0));
            System.out.println("Last Element: "+ a.get(a.size()-1));
        }
    }
