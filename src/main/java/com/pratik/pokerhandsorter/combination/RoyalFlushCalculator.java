package com.pratik.pokerhandsorter.combination;

import com.pratik.pokerhandsorter.PokerHand;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by pratikkayastha on 8/25/18.
 */
public class RoyalFlushCalculator implements ICombinationCalculator {

    /*@Override
    public int calculate(PokerHand pokerHand) {
        FlushCalculator flushCalculator = new FlushCalculator();
        StraightCalculator straightCalculator = new StraightCalculator();

        if (flushCalculator.calculate(pokerHand)<0
                || straightCalculator.calculate(pokerHand)<0) {
            return -1;
        }

        List<Integer> cardRanks = pokerHand.getCards()
                                    .stream()
                                    .mapToInt(c->c.getCardRank().getRank())
                                    .boxed()
                                    .collect(Collectors.toList());
        Collections.sort(cardRanks);

        if (cardRanks.get(0)==10 && cardRanks.get(4)==14) {
            return 9;
        } else {
            return -1;
        }
    }*/

    @Override
    public int calculate(PokerHand firstHand, PokerHand secondHand) {
        return 0;
    }
}
