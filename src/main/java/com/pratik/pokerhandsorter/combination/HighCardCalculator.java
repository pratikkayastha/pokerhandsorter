package com.pratik.pokerhandsorter.combination;

import com.pratik.pokerhandsorter.PokerHand;
import com.pratik.pokerhandsorter.card.Card;

import java.util.Iterator;

/**
 * High Card combination
 */
public class HighCardCalculator implements ICombinationCalculator {

    @Override
    public int calculate(PokerHand firstHand, PokerHand secondHand) {
        int winner = 0;

        Iterator<Card> firstHandCards = firstHand.getCards().iterator();
        Iterator<Card> secondHandCards = secondHand.getCards().iterator();

        while (firstHandCards.hasNext() && winner==0) {
            if (firstHandCards.next().getCardRank().getRank()>secondHandCards.next().getCardRank().getRank()) {
                winner = 1;
            } else if (secondHandCards.next().getCardRank().getRank()>firstHandCards.next().getCardRank().getRank()) {
                winner = 2;
            }
        }

        return winner;
    }
}
