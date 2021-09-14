package sv.com.htamayo.java.challenge30daysept;


import java.io.*;
import java.util.*;

public class Day06 {

    static String s = "";
    static Scanner rawData;
    static int t = 0;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int x = 1;
        rawData = new Scanner(System.in);
        t = rawData.nextInt();
        rawData.nextLine();
        do{
            s = rawData.nextLine();
            for(int i=0; i<s.length(); i++){
                //even numbers
                if(i%2 == 0){
                    System.out.print(s.charAt(i));
                }
            }
            System.out.print(" ");
            for( int i = 0; i<s.length(); i++){
                if(i%2 != 0){
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
            x++;
        }while(x <= t);

        rawData.close();
    }

}
