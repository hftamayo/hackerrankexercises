package com.hftamayo.stage01;
/*
program Name: Invoicevb
purpose: use an Array as an intermediate datastructure and then save it to a file
input: productName, productQuantity, productRawPrice
output: arrData, VAT and TotalAmount requires a variable for each one
notes:
-example of spaguetti code and how difficult is to handle it
-also an example of write code skipping the planning phase
author and last update: hftamayo 08/11/21, 10:30
 */

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Invoicevb {
    //protected: access modifier that hides prop for other clases of same package but enable them for subclasses
    private static DecimalFormat df = new DecimalFormat("0.00");
    protected Scanner rawData;

    protected String productName;
    protected int productQuantity;
    protected float productRawPrice;
    protected float productVat;
    protected float productTotalAmount;

    protected String arrData[];
    protected String dataLine;
    protected int moreProducts;
    protected final float productVAT;
    protected int i, j;
    public Invoicevb(){
        //2. init objects
        rawData = new Scanner(System.in);
        moreProducts = 1;
        productVAT = (float) 0.13;
        i=0;
        j=0;
        arrData = new String[12];
        dataLine="";
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
                System.out.println("Please type Product's name: ");
                productName = rawData.next();
                System.out.println("Please type Product's quantity: ");
                productQuantity = rawData.nextInt();
                System.out.println("Please type Product's Raw Price: ");
                productRawPrice = rawData.nextFloat();
                //calculations
                productVat = (productQuantity * productRawPrice) * productVAT;
                productTotalAmount = (productQuantity * productRawPrice) + productVat;

                //store the data into the array
                arrData[i] = productName;
                i++;
                arrData[i] = Integer.toString(productQuantity);
                i++;
                arrData[i] = Float.toString(productRawPrice);
                i++;
                arrData[i] = Float.toString(productVat);
                i++;
                arrData[i] = Float.toString(productVat);
                i++;
                arrData[i] = Float.toString(productTotalAmount);
                i++;
                //4. ask if the user wants to add more data
                System.out.println("To add more products type 1, otherwise type 0");
                moreProducts = rawData.nextInt();
            }while(moreProducts == 1);
            /*
            outputting array
             */
            for(i=0; i<arrData.length; i++){
                //dataflow to control end of the line
                if(j <=5){
                    dataLine += arrData[i]+"\t";
                    j++;
                }
                else{
                    dataLine += arrData[i]+"\n";
                    j=0;
                }
                fileWriter.write(dataLine);
                dataLine="";
            }//end of array iteration

            fileWriter.close();
            System.out.println("Data stored sucessfully. Exiting");
            //6. catching IOException
        }catch(IOException ioe){
            ioe.printStackTrace();
            System.out.println("An error ocurred during I/O operations");
        }
    }//end of getWriteData method
}
