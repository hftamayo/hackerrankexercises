package sv.com.htamayo.java.challenge30daysept;
/*
link: https://www.hackerrank.com/challenges/30-interfaces/problem?isFullScreen=false
score: 30 of 30
*/

import java.io.*;
import java.util.*;

public class Day20 {
    interface AdvancedArithmetic{
        int divisorSum(int n);
    }
    class Calculator implements AdvancedArithmetic {
        public int divisorSum(int n) {
            int resultSum = 0;
            for(int i=1; i<=n; i++){
                if(n%i == 0){
                    resultSum += i;
                }
            }
            return resultSum;
        }
    }

    class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.close();

            AdvancedArithmetic myCalculator = new Calculator();
            int sum = myCalculator.divisorSum(n);
            System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
            System.out.println(sum);
        }
    }
}
