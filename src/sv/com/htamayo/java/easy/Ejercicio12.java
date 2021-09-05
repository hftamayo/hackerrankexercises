package sv.com.htamayo.java.easy;


import java.util.*;
import java.io.*;

class Ejercicio12{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phonebook = new HashMap<>();
        List<String> lstAlias = new ArrayList<>();
        int n=in.nextInt();
        in.nextLine();
        int notFound = 0;
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phonebook.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            lstAlias.add(s);
        }

        for (Map.Entry<String, Integer> entry : phonebook.entrySet()) {
            for(String alias : lstAlias){
                if(entry.getKey().equals(alias)){
                    System.out.println(entry.getKey() + "=" + entry.getValue());
                }
                else{
                    notFound++;
                }
            }
        }
        if(notFound > 0){
            System.out.println("Not found");
            notFound = 0;
        }
    }
}

