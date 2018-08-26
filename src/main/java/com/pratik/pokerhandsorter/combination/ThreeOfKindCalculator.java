package com.pratik.pokerhandsorter.combination;

import com.pratik.pokerhandsorter.PokerHand;
import com.pratik.pokerhandsorter.card.CardRank;

/**
 * Created by pratikkayastha on 8/25/18.
 */
public class ThreeOfKindCalculator implements ICombinationCalculator {

    /*@Override
    public int calculate(PokerHand pokerHand) {
        if (pokerHand.getCardRankFrequency().containsValue(3)) {
            return 3;
        } else {
            return -1;
        }
    }*/

    @Override
    public int calculate(PokerHand firstHand, PokerHand secondHand) {
        return 0;
    }
}
