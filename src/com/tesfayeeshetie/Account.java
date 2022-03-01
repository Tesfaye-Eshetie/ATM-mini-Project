package com.tesfayeeshetie;

public class Account {
    int amountOfMoney;

    public Account(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void show() {
        System.out.printf("You have %s dollars in your account.%n", amountOfMoney);
    }
    public int deposit(int amount) {
      amountOfMoney += amount;
      return amountOfMoney;
    }
    public int withdraw(int amountWithdraw) {
        amountOfMoney -= amountWithdraw;
        return amountOfMoney;
    }

}
