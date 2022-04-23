package sv.com.htamayo.java.challenge30daysept;
/*
https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem?isFullScreen=false

A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
Given a number, n, determine and print whether it's Prime or Not prime.
 */

import java.io.*;
import java.util.*;

public class Day25Running {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int n = in.nextInt();

            if (n >= 2 && isPrime(n))
                System.out.println("Prime");
            else System.out.println("Not prime");
        }

        in.close();
    }
}
