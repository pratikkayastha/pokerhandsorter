package com.pratik.pokerhandsorter.combination;

import com.pratik.pokerhandsorter.PokerHand;
import com.pratik.pokerhandsorter.card.Card;
import com.pratik.pokerhandsorter.card.CardRank;

import java.util.Iterator;
import java.util.Map;

/**
 * Pair combination
 */
public class PairCalculator implements ICombinationCalculator {

    @Override
    public int calculate(PokerHand firstHand, PokerHand secondHand) {
        if (firstHand.getCardRankFrequency().containsValue(2)
                && !secondHand.getCardRankFrequency().containsValue(2)) {
            return 1;
        } else if (secondHand.getCardRankFrequency().containsValue(2)
                && !firstHand.getCardRankFrequency().containsValue(2)) {
            return 2;
        } else if (firstHand.getCardRankFrequency().containsValue(2)
                && secondHand.getCardRankFrequency().containsValue(2)) {
            return resolveDraw(firstHand, secondHand);
        } else {
            return 0;
        }
    }

    /**
     * 4H 4S 6H 9D 10D
     * 5H 5S TS JD KH
     *
     * */


    private int resolveDraw(PokerHand firstHand, PokerHand secondHand) {
        int firstPairRank = CardRank.TWO.getRank();
        int secondPairRank = CardRank.TWO.getRank();

        for (CardRank cardRank : firstHand.getCardRankFrequency().keySet()) {
            if (firstHand.getCardRankFrequency().get(cardRank)==2) {
                firstPairRank = Math.max(firstPairRank, cardRank.getRank());
            }
        }
        for (CardRank cardRank : secondHand.getCardRankFrequency().keySet()) {
            if (secondHand.getCardRankFrequency().get(cardRank)==2) {
                secondPairRank = Math.max(secondPairRank, cardRank.getRank());
            }
        }

        if (firstPairRank>secondPairRank) {
            return 1;
        } else if (secondPairRank>firstPairRank) {
            return 2;
        }

    }
}
