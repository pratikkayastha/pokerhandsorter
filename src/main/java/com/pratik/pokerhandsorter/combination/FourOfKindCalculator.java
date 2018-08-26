package com.pratik.pokerhandsorter.combination;

import com.pratik.pokerhandsorter.PokerHand;

/**
 * Created by pratikkayastha on 8/25/18.
 */
public class FourOfKindCalculator implements ICombinationCalculator {

    /*@Override
    public int calculate(PokerHand pokerHand) {
        return pokerHand.getCardRankFrequency().containsValue(4) ? 7 : -1;
    }*/

    @Override
    public int calculate(PokerHand firstHand, PokerHand secondHand) {
        return 0;
    }
}
