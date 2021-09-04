package sv.com.htamayo.java.easy;


/*
codigo que funciono:
-cuando es una clase generica java.lang.Exception no se requiere un try catch
-las excepciones son lanzadas por el método
-si una excepcion es lanzada se cancela el flujo del metodo
*/

import java.util.Scanner;
import java.lang.Math;
class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
    long power(int x, int y) throws Exception{
        long result = 0;
        if(x < 0 || y < 0){
            throw new Exception("n or p should not be negative.");
        }
        else if(x == 0 && y == 0){
            throw new Exception("n and p should not be zero.");
        }
        else {
            result = (long)Math.pow(x, y);
        }
        return result;
    }
}

public class Ejercicio11 {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
