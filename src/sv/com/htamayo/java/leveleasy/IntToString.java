package sv.com.htamayo.java.leveleasy;

import java.util.*;

public class IntToString {
    public static void main(String []argh){
        int number = 0;
        String numberToString="";
        Scanner in = new Scanner(System.in);
        number=in.nextInt();
        in.close();
        numberToString = Integer.toString(number);
        System.out.println(numberToString.getClass().getSimpleName());
        if(numberToString.getClass().getSimpleName() == "String"){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }

    }
}