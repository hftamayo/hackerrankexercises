package sv.com.htamayo.java.easy;


import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Ejercicio02 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner rawData = new Scanner(System.in);
        String strA = rawData.next();
        BigInteger a = new BigInteger(strA);
        String strB = rawData.next();
        BigInteger b = new BigInteger(strB);

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

    }
}