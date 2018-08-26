package com.pratik.pokerhandsorter.card;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for cardrank
 */
public class CardRankTest {

    @Test
    public void testCardRank() {
        assertEquals(CardRank.TWO, CardRank.findByName('2'));
        assertEquals(CardRank.THREE, CardRank.findByName('3'));
        assertEquals(CardRank.FOUR, CardRank.findByName('4'));
        assertEquals(CardRank.FIVE, CardRank.findByName('5'));
        assertEquals(CardRank.SIX, CardRank.findByName('6'));
        assertEquals(CardRank.SEVEN, CardRank.findByName('7'));
        assertEquals(CardRank.EIGHT, CardRank.findByName('8'));
        assertEquals(CardRank.NINE, CardRank.findByName('9'));
        assertEquals(CardRank.TEN, CardRank.findByName('T'));
        assertEquals(CardRank.JACK, CardRank.findByName('J'));
        assertEquals(CardRank.QUEEN, CardRank.findByName('Q'));
        assertEquals(CardRank.KING, CardRank.findByName('K'));
        assertEquals(CardRank.ACE, CardRank.findByName('A'));

        assertEquals(null, CardRank.findByName('O'));
    }

    @Test
    public void testLowerCaseName() {
        assertEquals(CardRank.JACK, CardRank.findByName('j'));
    }
}
