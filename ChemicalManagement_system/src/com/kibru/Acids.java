package com.kibru;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.*;
//Acid class
public class Acids implements StoreInformation {

    Scanner input = new Scanner(System.in);
    public String nameOfChemical(){
        System.out.println("ENTER NAME OF ACID: ");

        String nameofacid=input.nextLine();
        return ""+nameofacid;

    }

    public double phOfChemical(){
        System.out.println("ENTER PH OF ACID: ");

        double phofAcid=input.nextDouble();
       // System.out.println(""+phofAcid);
        return phofAcid;
    }

    public double amountOfChemical(){
        System.out.println("AMOUNT IN  MIL- LETTER: ");
        Double amount=input.nextDouble();
        return amount;
    }

//Acid method
    public void acids() {
       // Scanner input = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("******WELCOME DATA ENTER PAGE******** ");
        System.out.println("\n");
        //interDataFiled();
   String name= nameOfChemical();
       double phof = phOfChemical();

    double amoun= amountOfChemical();
        //start of file crete
        //Exception handle
            try {
                //Writing file to Acid.txt
                FileWriter myWriter = new FileWriter("Acid.txt",true);
                myWriter.write("NAME  : "+name+", "+"PH  : "+phof+" ,"+"AMOUNT : "+amoun+",\n");
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
