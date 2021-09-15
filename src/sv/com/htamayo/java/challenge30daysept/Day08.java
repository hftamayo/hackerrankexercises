package sv.com.htamayo.java.challenge30daysept;

//este codigo fallo en 4 test cases

import java.util.*;
import java.io.*;

class Day08{
    public static void main(String []argh){
        //Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        //In a HashMap the last element is stored at first place
        //that's why we are using LinkedHashMap
        Map<String,Integer> phoneBook = new LinkedHashMap<String,Integer>();
        String[] arrNames = {};
        int matchNames = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arrNames = new String[n];
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            //In a HashMap the last element is stored at first place
            //that's why we are using LinkedHashMap
            phoneBook.put(name,phone);
        }
        n = 0;
        while(in.hasNext()){
            String s = in.next();
            arrNames[n] = s;
            n++;
        }
        in.close();

        //look for results
        for(Map.Entry<String, Integer> set: phoneBook.entrySet()){
            for(int i=0; i<arrNames.length; i++){
                //use equals to compare 2 strings
                if(arrNames[i].equalsIgnoreCase(set.getKey())){
                    matchNames++;
                    break;
                }
            }
            //after ends each iteration, check the results
            if(matchNames > 0){
                System.out.println(set.getKey()+"="+set.getValue());
            }
            else{
                System.out.println("Not found");
            }
            matchNames = 0;
        }
    }
}
