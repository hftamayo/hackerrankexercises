package sv.com.htamayo.java.challenge30daysept;
//refactorar porque no pasa el test de optimizacion

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
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int d = 0;
        int r = 0;
        List<Integer> lstDecToBin = new ArrayList<>();

        bufferedReader.close();

        while(n >= 0){
            d = n/2;
            r = n%2;
            lstDecToBin.add(r);
            n = d;
        }

        for(Integer i: lstDecToBin){
            System.out.print(i + "-");
        }

    }
}

