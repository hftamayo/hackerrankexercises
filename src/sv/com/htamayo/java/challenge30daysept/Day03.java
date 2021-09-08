package sv.com.htamayo.java.challenge30daysept;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//esta solucion paso 5 de 7 tests y obtuvo una puntuacion de 20 puntos
/*
public class Day03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N % 2 != 0){
            System.out.println("Weird");
        } else if(N >= 2 || N <= 5){
            System.out.println("Not weird");
        } else if(N >= 6 || N <= 20){
            System.out.println("Weird");
        } else{
            System.out.println("Not weird");
        }


        bufferedReader.close();
    }
}
*/
//esta solucion alcanzó los 30 puntos
public class Day03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N % 2 != 0){
            System.out.println("Weird");
        } else if( N < 5){
            System.out.println("Not Weird");
        } else if(N <= 20){
            System.out.println("Weird");
        } else{
            System.out.println("Not Weird");
        }


        bufferedReader.close();
    }
}