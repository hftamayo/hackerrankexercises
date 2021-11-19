package sv.com.htamayo.java.challenge30daysept;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day14 {
    /*
link: https://www.hackerrank.com/challenges/30-scope/problem?isFullScreen=false
score obtained: 30 of 30
*/

    class Difference {
        private int[] elements;
        public int maximumDifference;

        // Add your code here
        public Difference(int[] e){
            elements = e;
        }

        public void computeDifference(){
            List<Integer> lstResult = new ArrayList<>();

            for(int curValue : elements){
                for(int nextValue: elements){
                    lstResult.add(Math.abs(curValue - nextValue));
                }
            }
            maximumDifference = Collections.max(lstResult);
        }

    } // End of Difference class

    public class Solution {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();

            Difference difference = new Difference(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
    }
}
