package com.kibru;

import java.util.*;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\n");
        try {
            System.out.println("***********WELCOME TO CHEMICAL STORE SYSTEM**********");
            System.out.println("\n");
            System.out.println("1.Admin");
            System.out.println("2.Guest");
            System.out.println("3.Exit");
            System.out.println("\n");
            System.out.println("Enter Your Choose");
            int choose = input.nextInt();

                switch (choose) {
                    case 1:
                        Admin obj = new Admin();
                        obj.admin();
                        break;
                    case 2:
                        Guest obj1 = new Guest();
                        obj1.showDataOfAll();
                    case 3:
                        System.out.println("Good By");
                        break;

                    default:
                        System.out.println("You Entered Wrong Choose");


            }


            }
        catch(Exception e){

                System.out.println("TRY AGAIN");
                //  System.out.println(e.getMessage());
            }

        }
    }

