package com.hftamayo.stage01;
/*
program Name: Invoiceva: write data on the fly in the txt file
input: productName, productQuantity, productRawPrice
output: productName, productQuantity, productRawPrice, productAmount, productVAT, productSummary
notes:
-programs ends when the user type 0 after type last requested data
-each time the program runs, all data is wiped out
author and last update: hftamayo 08/07/21, 20:00
 */

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;


public class Invoiceva {
    //protected: access modifier that hides prop for other clases of same package but enable them for subclasses
    private static DecimalFormat df = new DecimalFormat("0.00");
    protected Scanner rawData;
    protected String productName;
    protected int productQuantity;
    protected float productRawPrice;
    protected int moreProducts;
    protected double productVAT;


    public Invoiceva(){
        //2. init objects
        rawData = new Scanner(System.in);
        moreProducts = 1;
        productVAT = 0.13;
    }

    public void getWriteData() {
        try{
            System.out.println("Welcome to 7/11 Mini Market");
            /*2.creating the file to store data,
            in case it exists, the data is wiped out
             */
            FileWriter fileWriter = new FileWriter("invoice.txt");
            //3. entering data until the user wants.
            do{
                System.out.println("Please provide Product's name: ");
                productName = rawData.next();
                System.out.println("Please provide Product's quantity: ");
                productQuantity = rawData.nextInt();
                System.out.println("Please provide Product's Raw Price: ");
                productRawPrice = rawData.nextFloat();
                /* 4. writing data into the file
                intentionally, VAT and summary are calculated on the fly
                 */
                fileWriter.write(productName+"\t"+productQuantity+"\t"+df.format(productRawPrice)+"\t"
                        +(productQuantity*productRawPrice)+"\t"
                        +df.format((productQuantity*productRawPrice)*productVAT)+"\t"
                        +df.format((productQuantity*productRawPrice)+((productQuantity*productRawPrice)*productVAT))+"\n");
                //5. ask if the user wants to add more data
                System.out.println("To add more products type 1, otherwise type 0");
                moreProducts = rawData.nextInt();
            }while(moreProducts == 1);
            fileWriter.close();
            System.out.println("Data stored sucessfully. Exiting");
            //6. catching IOException
        }catch(IOException ioe){
            ioe.printStackTrace();
            System.out.println("An error ocurred during I/O operations");
        }
    }//end of getWriteData method
}