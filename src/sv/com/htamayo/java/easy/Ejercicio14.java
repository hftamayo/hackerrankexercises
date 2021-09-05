package sv.com.htamayo.java.easy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ejercicio14 {
    public static void main(String[] args){
        ArrayList dataList = new ArrayList();
        int lineQuantity = 0;
        int itemNumbers = 0;
        int itemValue = 0;
        int x = 0;
        int y = 0;

        Scanner rawData = new Scanner(System.in);
        lineQuantity = rawData.nextInt();
        //data fill
        for(int i=0; i<lineQuantity; i++){
            itemNumbers = rawData.nextInt();
            dataList.add(itemNumbers);
            for(int j=0; j<itemNumbers; j++){
                itemValue = rawData.nextInt();
                dataList.add(itemValue);
            }
        }//fin del for

        lineQuantity = rawData.nextInt();
        x = rawData.nextInt();
        y = rawData.nextInt();

        //iterate datalist content
        for(int i = 0; i<dataList.size(); i++){
            System.out.println(dataList.get(i));

        }
    }
}
