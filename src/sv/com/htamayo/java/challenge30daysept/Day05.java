package sv.com.htamayo.java.challenge30daysept;

import java.util.Scanner;

public class Day05 {
    public static void main(String[] args)  {
        Scanner bufferedReader = new Scanner(System.in);

        int n = bufferedReader.nextInt();

        bufferedReader.close();

        for(int i = 1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
