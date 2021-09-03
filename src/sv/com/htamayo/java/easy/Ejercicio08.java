package sv.com.htamayo.java.easy;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Ejercicio08 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner rawData = new Scanner(System.in);
        try{
            int x = rawData.nextInt();
            int y = rawData.nextInt();
            System.out.println(x/y);

        }catch(InputMismatchException ime){
            System.out.println(ime.getClass().getName());
        }catch(ArithmeticException ae){
            System.out.println(ae.toString());
        }catch(NumberFormatException nfe){
            System.out.println(nfe.toString());
        }

    }
}
