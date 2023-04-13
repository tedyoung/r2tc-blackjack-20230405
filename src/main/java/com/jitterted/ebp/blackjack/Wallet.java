package com.jitterted.ebp.blackjack;

public class Wallet {

    private int balance;

    public Wallet() {
        balance = 0;
    }

    public boolean isEmpty() {
        return balance == 0;
    }

    public void addMoney(int depositAmount) {
        if (depositAmount <= -1) {
            throw new RuntimeException();
        }
        balance += depositAmount;
    }

    public int balance() {
        return balance;
    }
}
