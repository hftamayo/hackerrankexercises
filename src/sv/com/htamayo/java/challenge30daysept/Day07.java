package sv.com.htamayo.java.challenge30daysept;

import java.util.Scanner;

public class Day07 {
    static Scanner rawData;
    static int N = 0;
    public static void main(String[] args)  {

        rawData = new Scanner(System.in);
        N = rawData.nextInt();
        int[] arrNumbers = new int[N];

        for(int i=0; i<arrNumbers.length; i++){
            arrNumbers[i] = rawData.nextInt();
        }
        rawData.close();

        //printing array content in decremental order
        for(int i=arrNumbers.length; i>0; i--){
            System.out.print(arrNumbers[i-1]+" ");
        }
    }
}