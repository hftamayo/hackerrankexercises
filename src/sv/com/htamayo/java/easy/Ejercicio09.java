package sv.com.htamayo.java.easy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ejercicio09{
    static int B = 0;
    static int H = 0;
    static boolean flag = false;

static{
        Scanner in = new Scanner(System.in);
        try{
        B = in.nextInt();
        H = in.nextInt();
        if(B < 0 || H < 0){
        throw new Exception("java.lang.Exception: Breadth and height must be positive");
        } else{
        flag = true;
        }

        }catch(IllegalArgumentException iae){
        System.out.println(iae.getMessage());
        }catch(Exception e){
        System.out.println(e.getMessage());
        }
        }//Write your code here
public static void main(String[] args){
        if(flag){
        int area=B*H;
        System.out.print(area);
        }

        }//end of main

        }//end of class