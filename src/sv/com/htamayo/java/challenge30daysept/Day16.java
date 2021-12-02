package sv.com.htamayo.java.challenge30daysept;
/*
url:
score: 30 of 30
 */
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

public class Day16 {
    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String S = bufferedReader.readLine();

            bufferedReader.close();

            try{
                int number = Integer.parseInt(S);
                System.out.println(number);
            }catch(NumberFormatException nfe){
                System.out.println("Bad String");

            }
        }
    }
}
