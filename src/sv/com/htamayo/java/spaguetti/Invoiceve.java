package com.hftamayo.stage01;

/*
program Name: Invoiceve
purpose: use a Map as an intermediate datastructure and then save it to a file
input: productName, productQuantity, productRawPrice
output: mapData, VAT and totalAmount are calculated on the fly
notes:
-Unlimited amount of data
author and last update: hftamayo 08/12/21, 15:40
 */

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Invoiceve {
    //protected: access modifier that hides prop for other clases of same package but enable them for subclasses
    private static DecimalFormat df = new DecimalFormat("0.00");
    protected Scanner rawData;

    //data vars
    protected String productName;
    protected int productQuantity;
    protected float productRawPrice;

    //flag vars
    protected HashMap<Integer, String> mapData;
    protected String dataLine;
    protected int moreProducts;
    protected int attempts;
    protected final float productVAT;

    public Invoiceve(){
        //2. init objects
        rawData = new Scanner(System.in);
        moreProducts = 1;
        attempts = 1;
        productVAT = (float) 0.13;
        mapData = new HashMap<Integer, String>();
        dataLine="";
        df = new DecimalFormat("0.00");
    }

    public void getWriteData() {
        try{
            System.out.println("Welcome to 7/11 Mini Market");
            /*3.creating the file to store data,
            in case it exists, the data is wiped out
             */
            FileWriter fileWriter = new FileWriter("invoice.txt");
            //3. entering data until the user wants.
            do{
                System.out.println("Please type Product's name: ");
                productName = rawData.next();
                System.out.println("Please type Product's quantity: ");
                productQuantity = rawData.nextInt();
                System.out.println("Please type Product's Raw Price: ");
                productRawPrice = rawData.nextFloat();
                //calculations
                dataLine = productName +"\t"+productQuantity+"\t"+df.format(productRawPrice)+"\t"+
                        df.format(((productQuantity*productRawPrice)*productVAT))+"\t"+
                        df.format((((productQuantity*productRawPrice)*productVAT)+(productQuantity*productRawPrice)))+"\n";
                //System.out.println(dataLine);
                //store the data into the array
                mapData.put(attempts, dataLine);

                //4. ask if the user wants to add more data
                System.out.println("To add more products type 1, otherwise type 0");
                moreProducts = rawData.nextInt();
                if(moreProducts == 1){
                    attempts++;
                }
            }while(moreProducts == 1);

            //5. writing data, close file object and end program
            //lamba iterator is jdk 1.8 and above
                mapData.forEach((k, v) -> {
                            try {
                                fileWriter.write(v);
                            } catch (IOException ioe) {
                                ioe.printStackTrace();
                            }
                        });
            fileWriter.close();
            System.out.println("Data stored sucessfully. Exiting");
            //6. catching Exception
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("An error ocurred during I/O operations");
        }
    }//end of getWriteData method
}
