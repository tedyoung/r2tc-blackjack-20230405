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
        requireNonNegativeDepositAmount(depositAmount);
        balance += depositAmount;
    }

    public int balance() {
        return balance;
    }

    private void requireNonNegativeDepositAmount(int depositAmount) {
        if (depositAmount <= -1) {
            throw new IllegalArgumentException();
        }
    }
}
