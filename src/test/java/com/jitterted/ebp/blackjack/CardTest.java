package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.fusesource.jansi.Ansi.ansi;

class CardTest {
    private static final Suit DONT_CARE_SUIT = Suit.HEARTS;
    private static final String DONT_CARE_RANK = "10";

    // 1. Parameterize over all Suit possibilities
    // 2. Add a "don't care" to ... ??
    // 3. use NULL, but that would put Card into an invalid state
    // 4. Use a Test Double: DUMMY

    @Test
    public void withNumberCardHasNumericValueOfTheNumber() throws Exception {
        Card card = new Card(DONT_CARE_SUIT, "7");

        assertThat(card.rankValue())
                .isEqualTo(7);
    }

    @Test
    public void withValueOfQueenHasNumericValueOf10() throws Exception {
        Card card = new Card(DONT_CARE_SUIT, "Q");

        assertThat(card.rankValue())
                .isEqualTo(10);
    }

    @Test
    public void withAceHasNumericValueOf1() throws Exception {
        Card card = new Card(DONT_CARE_SUIT, "A");

        assertThat(card.rankValue())
                .isEqualTo(1);
    }

    @Test
    public void suitOfHeartsOrDiamondsIsDisplayedInRed() throws Exception {
        // given a card with Hearts or Diamonds
        Card heartsCard = new Card(Suit.HEARTS, DONT_CARE_RANK);
        Card diamondsCard = new Card(Suit.DIAMONDS, DONT_CARE_RANK);

        // when we ask for its display representation
        String ansiRedString = ansi().fgRed().toString();

        // then we expect a red color ansi sequence
        assertThat(heartsCard.display())
                .contains(ansiRedString);
        assertThat(diamondsCard.display())
                .contains(ansiRedString);
    }

    @Test
    public void cardDisplaysSuitAsSymbol() throws Exception {
        Card spadesCard = new Card(Suit.SPADES, DONT_CARE_RANK);

        assertThat(spadesCard.display())
                .contains("│    ♠    │");
    }


}