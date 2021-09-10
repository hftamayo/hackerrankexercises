package sv.com.htamayo.java.challenge30daysept;
/*
excelente ejercicio sobre como capturar Strings despues de numeros
si usamos next() siempre se captura el segundo juego de caracteres hasta encontrar un espacio
por eso hay que usar nextLine
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day01 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int x = scan.nextInt();
        double y = scan.nextDouble();
        scan.nextLine();
        String z = scan.nextLine();

        System.out.println(i + x);

        System.out.println(d + y);

        System.out.println(s + z);

        scan.close();
    }
}