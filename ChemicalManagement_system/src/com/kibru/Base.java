package com.kibru;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Base implements StoreInformation {
    Scanner input = new Scanner(System.in);
    public String nameOfChemical(){
        System.out.println("ENTER NAME OF BASE: ");

        String nameofBase=input.nextLine();
        return ""+nameofBase;

    }

    public double phOfChemical(){

    //double phofBase;
        System.out.println("ENTER PH OF BASE: ");
       //if(( phofBase>=7)&&( phofBase<=14)) {
 double phofBase = input.nextDouble();
       // if(( phofBase>=7)&&( phofBase<=14)){

//return phofBase;
       // }

        return phofBase;
    }

    public double amountOfChemical(){
        System.out.println("AMOUNT IN  MILi- LITER: ");
        Double amountOfBase=input.nextDouble();
        return amountOfBase;
    }

    public void base() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("*******WELCOME DAtA ENTER PAGE******");
        System.out.println("\n");
        String nameOfBase= nameOfChemical();
        double phOfBase = phOfChemical();
        double amountOfBase= amountOfChemical();

       /* System.out.println("ENTER NAME OF BASE");
        String nameOfBase = input.nextLine();
        System.out.println("ENTER PH OF BASE");
        double ph=input.nextDouble();
        System.out.println("AMOUNT OF MIL-LETTER");
        Double amount = input.nextDouble();


        */
//file write line
        try {
            //Writing file Base.txt
            FileWriter myWriter = new FileWriter("Base.txt",true);
            myWriter.write("NAME:   " + nameOfBase+", "+"PH  : "+" "+phOfBase + " ," +"AMOUNT : "+ amountOfBase+",\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
                              }


        //end of file write line


                      }

                 }
