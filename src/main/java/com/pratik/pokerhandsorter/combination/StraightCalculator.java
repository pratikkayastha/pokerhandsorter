package com.pratik.pokerhandsorter.combination;

import com.pratik.pokerhandsorter.PokerHand;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by pratikkayastha on 8/25/18.
 */
public class StraightCalculator implements ICombinationCalculator {

    /*@Override
    public int calculate(PokerHand pokerHand) {
        Set<Integer> cardRanks = pokerHand.getCards().stream().mapToInt(c->c.getCardRank().getRank()).boxed().collect(Collectors.toSet());
        if (cardRanks.size()<5) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer i : cardRanks) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        if ((max-min+1)==5) {
            return 4;
        } else {
            return -1;
        }
    }*/

    @Override
    public int calculate(PokerHand firstHand, PokerHand secondHand) {
        return 0;
    }
}
