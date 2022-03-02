package com.tesfayeeshetie;

class Account {
    private int amountOfMoney;

    public Account(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void showBalance() {
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
