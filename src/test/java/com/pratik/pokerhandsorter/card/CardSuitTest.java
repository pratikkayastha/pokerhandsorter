package com.pratik.pokerhandsorter.card;

import com.pratik.pokerhandsorter.card.CardSuit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for CardSuit enum
 */
public class CardSuitTest {

    @Test
    public void testCardSuit() {
        assertEquals(CardSuit.DIAMONDS, CardSuit.findByName('D'));
        assertEquals(CardSuit.HEARTS, CardSuit.findByName('H'));
        assertEquals(CardSuit.CLUBS, CardSuit.findByName('C'));
        assertEquals(CardSuit.SPADES, CardSuit.findByName('S'));

        assertEquals(null, CardSuit.findByName('O'));
    }
}
