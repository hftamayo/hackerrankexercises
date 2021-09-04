package sv.com.htamayo.java.easy;

import java.util.*;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int val = 0;
        for(int i=0; i<n; i++){
            val = scan.nextInt();
            a[i] = val;
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}