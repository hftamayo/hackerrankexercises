package sv.com.htamayo.java.challenge30daysept;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int dayExpected = sc.nextInt();
        int monthExpected = sc.nextInt();
        int yearExpected = sc.nextInt();
        int fine = 0;
        
        /*
        el siguiente codigo paso 8/10 casos
        
        if((yearExpected - year) < 0){
            fine = 10000;
        } else if((monthExpected - month) < 0) {
            fine = 500 * (month - monthExpected);
        } else if((dayExpected - day) < 0){
            fine = 15 * (day - dayExpected);
        }
        
        System.out.println(fine);
        
        */
        
        /*
        el siguiente codigo paso todos los tests, la diferencia es que no evalue explicitamente 
        si el mes o año recibida fue exactamente igual al esperado 
        */
        
        if(year > yearExpected){
            fine = 10000;
        }else if(year == yearExpected && month > monthExpected){
            fine = (month - monthExpected) * 500;
        }else if(year == yearExpected && month == monthExpected && day > dayExpected){
            fine = (day - dayExpected) * 15;
        }
        
        System.out.println(fine);                
        
    }
}

