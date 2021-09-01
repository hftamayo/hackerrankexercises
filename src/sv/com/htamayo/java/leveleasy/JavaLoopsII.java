package sv.com.htamayo.java.leveleasy;

import java.util.*;
import java.lang.Math;
import java.io.*;

public class JavaLoopsII {
    public static void main(String []argh){
        int result = 0;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0; j<=n-1; j++){
                result = result + (int)(a + Math.pow(2, j) * b);
                System.out.print( result + " ");
            }
            System.out.println();
            result = 0;
        }
        in.close();
    }
}
