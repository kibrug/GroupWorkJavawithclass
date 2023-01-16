package com.kibru;

import java.sql.SQLOutput;
import java.util.Scanner;
//Admin class and extends guest class
public class Admin extends Guest{
    public void groupInfo(){
        System.out.println("Title:  Store Information System");
        System.out.println("Group:D");
        System.out.println("Name:                                            ID:     ");
        System.out.println("Hailu Gudata                                     Ru 5717/11 ");
        System.out.println("Samuel Mokonnon                                  Ru 1417/12 ");
        System.out.println("Kibru Geburamedihin                              Ru 1913/12");
        System.out.println("Meratu Jaleta                                    Ru 1414/12 ");
        System.out.println("Hawi Guta                                        RU 5092/12");
    }

//method of Admin
    public void admin() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Welcome Admin");
//Exception Handle in Admin method
try {
    String password="1234";
    String username="user";
    System.out.println("Enter user name");
    username = input.next();
    System.out.println("Enter password");
    password = input.next();

if(username.contains("user")&& password.contains("1234")){

        System.out.println("****  Welcome Admin **** \n");
        adminSideWorks();

}

else {

    System.out.println("Enter user name");
    username = input.next();
    System.out.println("Enter password");
    password = input.next();

}


}
catch(Exception e){
    System.out.println(e.getMessage());
}

        }
//Add Data To Acid Method
        public void dataAddAcid() {
//creating object for Acid class
            Acids obj = new Acids();
            obj.acids();
        }
//Add data To Base method
    public void dataAddBase(){
//creating object for Base class
        Base obj = new Base();
        obj.base();
    }
    public void dataAddSalt(){
        Salt sal=new Salt();
        sal.salt();

    }

    public void adminSideWorks(){
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome admin");
            System.out.println("What you want to do");
            System.out.println("1.Group Information");
            System.out.println("2.Enter Data");
            System.out.println("3.view Data");
            System.out.println("4.Exit");
            int choos = input.nextInt();
            if(choos==4){
                System.out.println("Good By");
                break;
            }
            else {
                switch (choos) {

                    case 1:
                        // called input method
                        groupInfo();
                        break;
                    case 2:

                        inputDataChoos();

                        break;
                    case 3:
                        //This method extends from Guest class and Called
                        showDataOfAll();
                        break;

                    case 4:
                        if(choos==4) {
                            System.out.println("Good By");
                            break;
                        }

                    default:
                        System.out.println("");


                }
            }
        }

    }
//Data Enter Choose methods
    public void inputDataChoos(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your choose");
        System.out.println("Enter data");
        System.out.println("1.Acid");
        System.out.println("2.Base");
        System.out.println("3.Salt");
        System.out.println("4.Exit");
        System.out.println("Enter Your Choose");
        int chose = input.nextInt();
        switch(chose){
            case 1:
                // called Add data Acid method
                dataAddAcid();
                break;
            case 2:
                 // called Add data Base method
                dataAddBase();
                break;
            case 3:
                dataAddSalt();
                break;
            case 4:
                System.out.println("Good BY");
                break;
            default:
                System.out.println("You Entered Wrong Choose");
        }


    }




    }



