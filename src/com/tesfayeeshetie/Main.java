package com.tesfayeeshetie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Account someOne = new Account(250);
     Scanner input = new Scanner(System.in);

     String option;
        System.out.println("What do you like to do?");
        option= input.nextLine();

        if (option.equalsIgnoreCase("showMyAccount")){
            someOne.show();
        }
        else if (option.equalsIgnoreCase("withDraw")){
            int amount;
            System.out.println("Inter the amount?");
            amount=input.nextInt();
            int bills;
            System.out.println("Choose a type of bills?");
            bills = input.nextInt();
            System.out.printf("You going to have %s of %s %n", amount/bills, bills);
            someOne.withdraw(amount);
            someOne.show();
        }
        else if (option.equalsIgnoreCase("deposit")) {
            int amount;
            System.out.println("Insert amount?");
            amount = input.nextInt();
            someOne.deposit(amount);
            someOne.show();
        }
        else {
            System.out.println("Wrong input please re-inter your need?");
        }

    }
}
