package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletTest {

    @Test
    void newWalletIsEmpty() {
        Wallet wallet = new Wallet();

        assertThat(wallet.isEmpty())
                .isTrue();
    }

    @Test
    void newWalletAddMoneyIsNotEmpty() throws Exception {
        Wallet wallet = new Wallet();

        wallet.addMoney(1);

        assertThat(wallet.isEmpty())
                .isFalse();
    }

    @Test
    void newWalletBalanceIsZero() {
        Wallet wallet = new Wallet();

        assertThat(wallet.balance())
                .isZero();
    }

    @Test
    void newWalletAdd11BalanceIs11() {
        Wallet wallet = new Wallet();

        wallet.addMoney(11);

        assertThat(wallet.balance())
                .isEqualTo(11);
    }

    @Test
    void newWalletAdd7And8BalanceIs15() {
        Wallet wallet = new Wallet();

        wallet.addMoney(7);
        wallet.addMoney(8);

        assertThat(wallet.balance())
                .isEqualTo(7 + 8);
    }

    @Test
    void addNegativeMoneyThrowsException() throws Exception {
        Wallet wallet = new Wallet();

        assertThatThrownBy(() -> wallet.addMoney(-1))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void addZeroMoneyThrowsException() throws Exception {
        Wallet wallet = new Wallet();

        assertThatThrownBy(() -> wallet.addMoney(0))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }

}



