package com.kibru;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Salt implements StoreInformation {
    Scanner input = new Scanner(System.in);
    public String nameOfChemical(){
        System.out.println("ENTER NAME OF SALT: ");

        String nameofSalt=input.nextLine();
        return ""+nameofSalt;

    }

    public double phOfChemical(){
        System.out.println("ENTER PH OF SALT: ");

        double phofSalt=input.nextDouble();
        return phofSalt;
    }

    public double amountOfChemical(){
        System.out.println("AMOUNT IN  MIL- LETTER: ");
        Double amount=input.nextDouble();
        return amount;
    }
    public void salt(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("******WELCOME TO DATA ENTER PAGE******** ");
        System.out.println("\n");
        String nameOfSalt= nameOfChemical();
        double phOfSalt = phOfChemical();
        double amountOfSalt= amountOfChemical();

       /* try {
            File myObj = new File("Salt.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        */
        try {
            //Writing file to Acid.txt
            FileWriter myWriter = new FileWriter("Salt.txt",true);
            myWriter.write("NAME  : "+nameOfSalt+", "+"PH  : "+phOfSalt+" ,"+"AMOUNT : "+amountOfSalt+",\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    }


