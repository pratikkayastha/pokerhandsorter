package com.pratik.pokerhandsorter.card;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a card suit
 */
public enum CardSuit {

    DIAMONDS('D'), HEARTS('H'), SPADES('S'), CLUBS('C');

    private char name;
    private static final Map<Character, CardSuit> suitLookupMap;

    static {
        suitLookupMap = new HashMap<Character, CardSuit>();
        suitLookupMap.put('D', DIAMONDS);
        suitLookupMap.put('H', HEARTS);
        suitLookupMap.put('S', SPADES);
        suitLookupMap.put('C', CLUBS);
    }

    CardSuit(char name) {
        this.name = name;
    }

    public char getName() {
        return this.name;
    }

    public static CardSuit findByName(char name) {
        return suitLookupMap.get(Character.toUpperCase(name));
    }
}
