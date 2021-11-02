package com.hftamayo.stage01;

/*
program Name: Invoicevc
purpose: use an Array as an intermediate datastructure and then save it to a file
input: productName, productQuantity, productRawPrice
output: arrData, VAT and totalAmount are calculated on the fly
notes:
-Limited to 5 products, next version will use Dynamic Array
author and last update: hftamayo 08/12/21, 11:00
 */

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Invoicevc {
    //protected: access modifier that hides prop for other clases of same package but enable them for subclasses
    private static DecimalFormat df = new DecimalFormat("0.00");
    protected Scanner rawData;

    //data vars
    protected String productName;
    protected int productQuantity;
    protected float productRawPrice;

    //flag vars
    protected String arrData[];
    protected String dataLine;
    protected int moreProducts;
    protected int attempts;
    protected final float productVAT;

    public Invoicevc(){
        //2. init objects
        rawData = new Scanner(System.in);
        moreProducts = 1;
        attempts = 1;
        productVAT = (float) 0.13;
        arrData = new String[5];
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
                arrData[attempts - 1] = dataLine;

                //4. ask if the user wants to add more data
                System.out.println("To add more products type 1, otherwise type 0");
                moreProducts = rawData.nextInt();
                if(moreProducts == 1){
                    attempts++;
                }
                else{
                    attempts = 6;
                }
            }while(attempts <= 5);
            //optional procedure to check array's content
            /*
            System.out.println("outputting data");
            for(attempts=0; attempts<arrData.length; attempts++){
                System.out.println(arrData[attempts]);
            }
             */

            //5. writing data, close file object and end program
            // I'm using the same var for Garbage collector optimization
            for(attempts=0; attempts<arrData.length; attempts++){
                /*
                null values can't be manage by FileWriter, in case the user decides not to fill
                the 5 products we'll need to cleanup arrData
                 */
                if(arrData[attempts] != null){
                    fileWriter.write(arrData[attempts]);
                }
            }
             fileWriter.close();
            System.out.println("Data stored sucessfully. Exiting");
            //6. catching IOException
        }catch(IOException ioe){
            ioe.printStackTrace();
            System.out.println("An error ocurred during I/O operations");
        }
    }//end of getWriteData method
}
