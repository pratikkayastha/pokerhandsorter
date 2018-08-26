package com.pratik.pokerhandsorter.card;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a card rank; 2,3,4 ... jack, queen, king and ace
 */
public enum CardRank {

    TWO(2, '2'),
    THREE(3, '3'),
    FOUR(4, '4'),
    FIVE(5, '5'),
    SIX(6, '6'),
    SEVEN(7, '7'),
    EIGHT(8, '8'),
    NINE(9, '9'),
    TEN(10, 'T'),
    JACK(11, 'J'),
    QUEEN(12, 'Q'),
    KING(13, 'K'),
    ACE(14, 'A');

    private int rank;
    private char name;

    private static final Map<Character, CardRank> cardRankLookupMap;
    static {
        cardRankLookupMap = new HashMap<Character, CardRank>();
        cardRankLookupMap.put('2', TWO);
        cardRankLookupMap.put('3', THREE);
        cardRankLookupMap.put('4', FOUR);
        cardRankLookupMap.put('5', FIVE);
        cardRankLookupMap.put('6', SIX);
        cardRankLookupMap.put('7', SEVEN);
        cardRankLookupMap.put('8', EIGHT);
        cardRankLookupMap.put('9', NINE);
        cardRankLookupMap.put('T', TEN);
        cardRankLookupMap.put('J', JACK);
        cardRankLookupMap.put('Q', QUEEN);
        cardRankLookupMap.put('K', KING);
        cardRankLookupMap.put('A', ACE);
    }

    CardRank(int rank, char name) {
        this.rank = rank;
        this.name = name;
    }

    public static CardRank findByName(char name) {
        return cardRankLookupMap.get(Character.toUpperCase(name));
    }

    public char getName() {
        return this.name;
    }

    public int getRank() {
        return this.rank;
    }
}
