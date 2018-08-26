package com.pratik.pokerhandsorter.card;

import com.pratik.pokerhandsorter.card.Card;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for card
 */
public class CardTest {

    @Test
    public void testCards() {
        Card fourOfHearts = new Card("4H");
        assertEquals("4H", fourOfHearts.toString());

        Card jackOfSpade = new Card("JS");
        assertEquals("JS", jackOfSpade.toString());

        Card aceOfDiamond = new Card("AD");
        assertEquals("AD", aceOfDiamond.toString());

        Card tenOfClub = new Card("10C");
        assertEquals("10C", tenOfClub.toString());
    }

    @Test
    public void testLowerCaseCard() {
        Card fourOfHearts = new Card("4h");
        assertEquals("4H", fourOfHearts.toString());

        Card aceOfSpade = new Card("as");
        assertEquals("AS", aceOfSpade.toString());
    }
}
