package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HandTest {

    @Test
    void handWithValueOf22IsBusted() {
        Hand hand = HandFactory.createHandWithRanksOf("Q", "K", "2");

        assertThat(hand.isBusted())
                .isTrue();
    }

    @Test
    void handWithValueOf21IsNotBusted() {
        Hand hand = HandFactory.createHandWithRanksOf("Q", "9", "2");

        assertThat(hand.isBusted())
                .isFalse();
    }
}