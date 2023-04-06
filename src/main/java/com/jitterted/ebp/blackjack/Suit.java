package com.jitterted.ebp.blackjack;

import java.util.List;

public enum Suit {
    SPADES("♠"),
    DIAMONDS("♦"),
    HEARTS("♥"),
    CLUBS("♣");

    @Deprecated
    static final List<String> SUITS = List.of(SPADES.symbol,
                                              DIAMONDS.symbol,
                                              HEARTS.symbol,
                                              CLUBS.symbol);
    private final String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    // SCAFFOLDING: temporary until we're done
    @Deprecated
    public static Suit from(String symbol) {
        for (Suit suit : values()) {
            if (symbol.equals(suit.symbol)) {
                return suit;
            }
        }
        return null;
    }

    public String symbol() {
        return symbol;
    }
}
