package com.pratik.pokerhandsorter.calculator;

import com.pratik.pokerhandsorter.PokerHand;
import com.pratik.pokerhandsorter.combination.HighCardCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for HighCardCalculator
 */
public class HighCardCalculatorTest {

    @Test
    public void highCardTest() {
        PokerHand firstHand = new PokerHand("5D AC JS 2D 6H".split(" "));
        PokerHand secondHand = new PokerHand("6H 3C 5D 9S QH".split(" "));

        HighCardCalculator highCardCalculator = new HighCardCalculator();
        assertEquals(1, highCardCalculator.calculate(firstHand, secondHand));
    }

    @Test
    public void testSameHighestCard() {
        PokerHand firstHand = new PokerHand("5D AC JS 2D 4H".split(" "));
        PokerHand secondHand = new PokerHand("KH 3C 5D AS QH".split(" "));

        HighCardCalculator highCardCalculator = new HighCardCalculator();
        assertEquals(2, highCardCalculator.calculate(firstHand, secondHand));
    }
}
