package sv.com.htamayo.java.cadenas;


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String firstA = A.substring(0, 1);
        String firstB = B.substring(0, 1);

        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.len + B.length);
        System.out.println(firstA+A.substring(1) + " " + firstB+B.substring(1));

    }
}