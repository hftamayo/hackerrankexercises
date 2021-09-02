package sv.com.htamayo.java.leveleasy;

import java.util.Scanner;

public class VarsStatic2 {
    static int B = 0;
    static int H = 0;
    static boolean flag = false;

    static{
        Scanner in = new Scanner(System.in);
        try{
            B = in.nextInt();
            H = in.nextInt();
            if(B < 0 || H < 0){
                throw new IllegalArgumentException("java.lang.Exception: Breadth and height must be positive");
            } else{
                flag = true;
            }

        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
