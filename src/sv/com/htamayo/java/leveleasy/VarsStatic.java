package sv.com.htamayo.java.leveleasy;

import java.util.*;

public class VarsStatic {
    static int breadth = 0;
    static int height = 0;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            breadth = in.nextInt();
            height = in.nextInt();
            if(breadth < 0 || height < 0){
                throw new IllegalArgumentException("java.lang.Exception: Breadth and height must be positive");
            } else{
                System.out.println(breadth * height);
            }

        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
