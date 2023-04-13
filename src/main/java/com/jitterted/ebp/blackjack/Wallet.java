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
        requireGreaterThanZero(depositAmount);
        balance += depositAmount;
    }

    private void requireGreaterThanZero(int depositAmount) {
        if (depositAmount <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public int balance() {
        return balance;
    }

    public void bet(int betAmount) {
        if (betAmount > balance) {
            throw new RuntimeException();
        }
        balance -= betAmount;
    }
}
