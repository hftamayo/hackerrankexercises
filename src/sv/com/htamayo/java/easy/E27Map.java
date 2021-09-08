package sv.com.htamayo.java.easy;


import java.util.*;
import java.io.*;

class E27Map {
    /*
    Esta es mi solucion es bien parecida
    unicamente que los resultados (output) no se muestran en el orden solicitado

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
    */

    //esta es una solucion que encontre
public static void main(String []argh) {
    Scanner scan = new Scanner(System.in);
    int contacts = scan.nextInt();
    scan.nextLine();
    Map<String, Integer> map = new HashMap<>(contacts);
    for(int i=0; i < contacts; i++)
    {
        String name = scan.nextLine().trim();
        int phone = scan.nextInt();
        scan.nextLine();
        map.put(name, phone);
    }

while(scan.hasNext())
    {
        String query = scan.nextLine().trim();
        if(map.containsKey(query))
        {
            System.out.println(query + "=" + map.get(query));
        }
        else
        {
            System.out.println("Not found");
        }
    }
    scan.close();
}
}
