package sv.com.htamayo.java.easy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ejercicio14 {
    public static void main(String[] args){
        List<Integer> lstValues = new ArrayList<>();
        Map<Integer, List<Integer> > dataMap = new HashMap<>();
        Map<Integer, Integer> coordsMap = new HashMap<Integer, Integer>();
        int lineQuantity = 0;
        int itemNumbers = 0;
        int itemValue = 0;
        int x = 0;
        int y = 0;

        Scanner rawData = new Scanner(System.in);
        System.out.println("limit of lines:");
        lineQuantity = rawData.nextInt();
        //data fill
        for(int i=1; i<=lineQuantity; i++){
            System.out.println("limit of elements for line:" + i);
            itemNumbers = rawData.nextInt();
            for(int j=1; j<=itemNumbers; j++){
                System.out.println("element of line: "+j);
                itemValue = rawData.nextInt();
                lstValues.add(itemValue);
            }
            dataMap.put(i, lstValues);
            //lstValues.clear();
        }//fin del for loop

        System.out.println("How many coords line:");
        lineQuantity = rawData.nextInt();
        for(int i=1; i<=lineQuantity; i++){
            System.out.println("enter X, Y coords: ");
            x = rawData.nextInt();
            y = rawData.nextInt();
            coordsMap.put(x, y);
        }

        //iterate datalist content
        System.out.println("arraylist content:");
        for(Map.Entry<Integer, List<Integer>> data: dataMap.entrySet()){
            System.out.println("key="+data.getKey()+ ", value="+data.getValue());
        }

        /*

        for(int i = 0; i<dataList.size(); i++){
            System.out.println(dataList.get(i));
        }

         */

        System.out.println("coords needed");
        for(Map.Entry<Integer, Integer> coords: coordsMap.entrySet()){
            System.out.println("key="+coords.getKey()+ ", value="+coords.getValue());
        }
    }
}
