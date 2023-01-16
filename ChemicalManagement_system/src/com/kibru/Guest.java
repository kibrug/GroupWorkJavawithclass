package com.kibru;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
//Guest class
public class Guest{
    int i;
//Show all Data  method
          public void showDataOfAll(){
               Scanner input=new Scanner(System.in);


    for(int i=0;i<4;i++) {


        System.out.println("1.Acid");
        System.out.println("2.Base");
        System.out.println("3.Salt");


        System.out.println("4.Exit");
        System.out.println("Enter What  you Want to See:");


        int chose = input.nextInt();
        switch (chose) {
            case 1:
                // Show data Acid method called
                showDataOfAcid();

                break;

            case 2:
                // Show data Base method called
                showDataOfBase();
                break;
            case 3:
                showDataOfSalt();
                break;
            case 4:
                System.out.println("Good By");

                break;

            default:
                System.out.println("");


        }



}


                    }
     //Show Data Acid Method
    public void showDataOfAcid(){
        try {
            //Reading from file Acid.txt
                 File myObj = new File("Acid.txt");
                 Scanner myReader = new Scanner(myObj);
                 while (myReader.hasNextLine()) {
                         String data = myReader.nextLine();
                           System.out.println(data);
                                                 }
                 myReader.close();
            }
        catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
                                        }
                                    }
    //Show Data Base Method
    public void showDataOfBase(){
        try {
            //Reading From file  Base.txt
            File myObj = new File("Base.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                  String data = myReader.nextLine();
                  System.out.println(data);
                                            }
            myReader.close();
            }
        catch (FileNotFoundException e) {
               System.out.println("An error occurred.");
               e.printStackTrace();
                                        }
                                  }
    //Reading From file  Salt.txt
    public void showDataOfSalt(){
    try{
    File myObj = new File("Salt.txt");
    Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
    }
            myReader.close();
}
        catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
                }
                }


                     }
