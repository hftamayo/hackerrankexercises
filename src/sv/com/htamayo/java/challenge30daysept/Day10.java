package sv.com.htamayo.java.challenge30daysept;
/*
Day 10: Binary Numbers
link: https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=false
scores: 21.43 of 30
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



public class Day10 {

    public static int decimalToBin(int decNumber){
        List<Integer> lstOnesGroup = new ArrayList();
        int newGroupMember = 0;

        //1. using the function toBinaryString to convert to Bin
        String decTobin = Integer.toBinaryString(decNumber);

        //2. converting the result to an Array
        char[] chars = decTobin.toCharArray();

        //3. iterate the result and calculate how many consecutive 1s groups are
        for (char curChar: chars) {
            //single quotation defines a char, double ones defines a string
            if(Character.compare(curChar, '1') == 0 ){ //true
                newGroupMember++;
            } else {
                lstOnesGroup.add(newGroupMember);
                newGroupMember = 0;
            }
        }
        //4. finding highest value into the List
        return Collections.max(lstOnesGroup);


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int consecutiveOnes = decimalToBin(n);
        System.out.println(consecutiveOnes);

        bufferedReader.close();
    }
}
