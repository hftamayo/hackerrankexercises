package sv.com.htamayo.java.challenge30daysept;

//no pasa los test de optimizacion de codigo

import java.util.Scanner;

public class Day09 {
    class Result {
    /*
    recursividad es un while loop
    imagino que es mas eficiente usar este enfoque en lugar de un loop
     */

        public static int factorial(int n) {
            // Write your code here
            // Recursive Case
            int fact = 0;
            int b = 0;
            fact = n;
            b = fact - 1;
            if (n > 1) {
                return fact + factorial(n - 1);
            }
            // Base Case n = 1
            else {
                return fact;
            }
        }

    }

    public class Solution {
        public static void main(String[] args){
            Scanner bufferedReader = new Scanner(System.in);

            int n = bufferedReader.nextInt();

            int result = Result.factorial(n);

            bufferedReader.close();
        }
    }
}