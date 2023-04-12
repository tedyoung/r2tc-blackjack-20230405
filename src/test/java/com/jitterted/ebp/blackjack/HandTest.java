package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class HandTest {

    @Test
    void handWithValueOf22IsBusted() {
        Hand hand = Hand.createHand(List.of(new Card(Suit.CLUBS, "Q"),
                                            new Card(Suit.CLUBS, "K"),
                                            new Card(Suit.CLUBS, "2")));

        assertThat(hand.isBusted())
                .isTrue();
    }

    @Test
    void handWithValueOf21IsNotBusted() {
        Hand hand = Hand.createHand(List.of(new Card(Suit.CLUBS, "Q"),
                                            new Card(Suit.CLUBS, "9"),
                                            new Card(Suit.CLUBS, "2")));

        assertThat(hand.isBusted())
                .isFalse();
    }
}