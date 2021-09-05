package sv.com.htamayo.java.easy;


/*
codigo que funciono:
-cuando es una clase generica java.lang.Exception no se requiere un try catch
-las excepciones son lanzadas por el método
-si una excepcion es lanzada se cancela el flujo del metodo
*/

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio11 {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                //System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
