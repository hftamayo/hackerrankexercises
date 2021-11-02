package com.hftamayo.stage01;
/*
Stage 1: Main program
purpose: main menu
author and last update: hftamayo 08/12/21, 15:50
 */

import java.util.Scanner;

public class Stage01 {
    public static void main(String[] args){
        //1. declarating properties
        Scanner rawData = new Scanner(System.in);
        int menuOption=0;

        //2. sending explanation to the user
        System.out.println("J2SE - Kodigo: Stage 1 exercises");
        System.out.println("Available Exercises: "+"\n"+
                "1. Hello World: -> basic output"+"\n"+
                "2. Invoice VerA -> write data on the fly"+"\n"+
                "3. Invoice VerB->  use an Array to manage data"+"\n"+
                "4. Invoice VerC->  Improved VerB(no Spaguetti)"+"\n"+
                "5. Invoice VerD->  unlimited data"+"\n"+
                "6. Invoice VerE->  use Map to manage data"+"\n"+
                "7. Exit");

        //3. reading User's option
        try{
            System.out.println("Please type a number related to menu's option:");
            menuOption = rawData.nextInt();

            switch(menuOption){
                case 1:
                    HolaMundo hm = new HolaMundo();
                    hm.message();
                    break;
                case 2:
                    Invoiceva ia = new Invoiceva();
                    ia.getWriteData();
                    break;
                case 3:
                    Invoicevb ib = new Invoicevb();
                    ib.getWriteData();
                    break;
                case 4:
                    Invoicevc ic = new Invoicevc();
                    ic.getWriteData();
                    break;
                case 5:
                    Invoicevd id = new Invoicevd();
                    id.getWriteData();
                    break;
                case 6:
                    Invoiceve ie = new Invoiceve();
                    ie.getWriteData();
                    break;
                case 7:
                    break;
            }

        }catch(Exception e){
            System.out.println("An error ocurred");
            e.printStackTrace();
        }
    }
}
