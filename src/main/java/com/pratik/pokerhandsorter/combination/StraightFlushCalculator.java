package com.pratik.pokerhandsorter.combination;

import com.pratik.pokerhandsorter.PokerHand;

/**
 * Created by pratikkayastha on 8/25/18.
 */
public class StraightFlushCalculator implements ICombinationCalculator {

    /*@Override
    public int calculate(PokerHand pokerHand) {
        StraightCalculator straightCalculator = new StraightCalculator();
        FlushCalculator flushCalculator = new FlushCalculator();

        return (straightCalculator.calculate(pokerHand)>-1
                && flushCalculator.calculate(pokerHand)>-1) ? 8 : -1;
    }*/

    @Override
    public int calculate(PokerHand firstHand, PokerHand secondHand) {
        return 0;
    }
}
