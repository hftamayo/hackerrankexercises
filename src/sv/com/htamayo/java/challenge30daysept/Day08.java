package sv.com.htamayo.java.challenge30daysept;

import java.util.*;
import java.io.*;

class Day08{
    public static void main(String []argh){
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        String[] arrNames = {};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arrNames = new String[n];
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
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
            System.out.println(set.getKey()+"="+set.getValue());

            /*
            for(int i=0; i<arrNames.length; i++){
                if(set.getKey() == arrNames[i]){
                    System.out.println(set.getKey()+"="+set.getValue());
                    break;
                }
                else{
                    System.out.println("Not found");
                    break;
                }
            }
            */
        }
    }
}
