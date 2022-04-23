package sv.com.htamayo.java.challenge30daysept;
/*
https://www.hackerrank.com/challenges/30-regex-patterns/problem?isFullScreen=false
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

public class Day28RegEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String Regrex=".+@gmail\\.com$";
        List<String> list= new ArrayList();
        Pattern pattern=Pattern.compile(Regrex);
        for(int i=0;i<n;i++){
            String name=scanner.next();
            String email=scanner.next();
            Matcher matcher=pattern.matcher(email);
            if(matcher.find()){
                list.add(name);
            }
        }
        Collections.sort(list);
        for(String names:list){
            System.out.println(names);
        }
        scanner.close();
    }
}
