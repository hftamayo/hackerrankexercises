package sv.com.htamayo.java.cadenas;


import java.io.*;
import java.util.*;

public class Ejercicio01{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String firstA = A.substring(0, 1);
        String firstB = B.substring(0, 1);

        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(firstA.toUpperCase()+A.substring(1) + " " + firstB.toUpperCase()+B.substring(1));
    }
}