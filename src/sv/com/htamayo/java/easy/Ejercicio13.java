package sv.com.htamayo.java.easy;

import java.util.Scanner;

public class Ejercicio13 {
    static boolean isAnagram(String a, String b) {

        // Complete the function
        if(a.length() != b.length()){
            return false;
        }
        else{
            /*
            -puedo hacer uso de una clase llamando a su paquete sin necesidades de importarlo
            -equals compara 2 arreglos y verificar si son iguales, el ciclo es:
            -convertirlo a intstream ->codePoints
            -ordenarlo
            -convertilo a array
            -esta linea no funciona porque la cadena debe transformarse a int y luego array:
             return java.util.Arrays.equals(a.toLowerCase(), b.toLowerCase());
             */


            return java.util.Arrays.equals(
                    a.toLowerCase().codePoints().sorted().toArray(),
                    b.toLowerCase().codePoints().sorted().toArray());
        }

    }

}
