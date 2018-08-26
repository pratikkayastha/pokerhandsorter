package com.pratik.pokerhandsorter.combination;

import com.pratik.pokerhandsorter.PokerHand;

/**
 * Created by pratikkayastha on 8/25/18.
 */
public class FullHouseCalculator implements ICombinationCalculator {

    /*@Override
    public int calculate(PokerHand pokerHand) {
        if (pokerHand.getCardRankFrequency().containsValue(3)
                && pokerHand.getCardRankFrequency().containsValue(2)) {
            return 6;
        } else {
            return -1;
        }
    }*/

    @Override
    public int calculate(PokerHand firstHand, PokerHand secondHand) {
        return 0;
    }
}
