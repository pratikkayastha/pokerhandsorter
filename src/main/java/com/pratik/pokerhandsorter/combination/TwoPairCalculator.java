package com.pratik.pokerhandsorter.combination;

import com.pratik.pokerhandsorter.PokerHand;
import com.pratik.pokerhandsorter.card.CardRank;

/**
 * Created by pratikkayastha on 8/25/18.
 */
public class TwoPairCalculator implements ICombinationCalculator {

    /*@Override
    public int calculate(PokerHand pokerHand) {
        int twoOfKind = 0;
        for (CardRank cardRank : pokerHand.getCardRankFrequency().keySet()) {
            if (pokerHand.getCardRankFrequency().get(cardRank)==2) {
                twoOfKind++;
            }
        }

        return twoOfKind==2 ? 2 : -1;
    }*/

    @Override
    public int calculate(PokerHand firstHand, PokerHand secondHand) {
        return 0;
    }
}
