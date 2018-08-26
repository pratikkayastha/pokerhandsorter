package com.pratik.pokerhandsorter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for poker hand
 */
public class PokerHandTest {

    @Test
    public void testPokerHand() {
        PokerHand handOne = new PokerHand("4H 4C 6S 7S KD".split(" "));
        assertEquals("4H 4C 6S 7S KD", handOne.toString());

        PokerHand handTwo = new PokerHand("10C AS JS 2C KD".split(" "));
        assertEquals("10C AS JS 2C KD", handTwo.toString());
    }
}
