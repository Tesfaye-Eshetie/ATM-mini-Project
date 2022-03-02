package com.tesfayeeshetie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account userAccount = new Account(250);
        Scanner input = new Scanner(System.in);

        //declare and initialize withdraw, and deposit
        int withdraw, deposit;

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            //get choice from user
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    //get the withdrawn money from user
                    withdraw = input.nextInt();

                    //check whether the balance is greater than or equal to the withdrawal amount
                    if (userAccount.getAmountOfMoney() >= withdraw) {
                        //remove the withdrawn amount from the total balance
                        userAccount.withdraw(withdraw);
                        System.out.println("Please collect your money");
                    } else {
                        //show custom error message
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    //get deposit amount from te user
                    deposit = input.nextInt();

                    //add the deposit amount to the total balance
                    userAccount.deposit(deposit);
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    //displaying the total balance of the user
                    userAccount.showBalance();
                    System.out.println("");
                    break;

                case 4:
                    //exit from the menu
                    System.exit(0);
            }
        }
    }
}


