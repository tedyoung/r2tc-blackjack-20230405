package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SuitTest {

    @Test
    void heartsAreRed() throws Exception {
        assertThat(Suit.HEARTS.isRed())
                .isTrue();
    }

    @Test
    void spadesAreBlack() throws Exception {
        assertThat(Suit.SPADES.isRed())
                .isFalse();
    }

}