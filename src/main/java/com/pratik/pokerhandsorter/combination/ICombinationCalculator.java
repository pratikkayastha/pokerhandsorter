package com.pratik.pokerhandsorter.combination;

import com.pratik.pokerhandsorter.PokerHand;

/**
 * Interface for card combination
 * This will be implemented by all combinations such as pair, two pair etc
 */
public interface ICombinationCalculator {

    /**
     * Calculates combination rank of poker hand
     * @param pokerHand poker hand to calculate combination
     * @return rank of combination; eg: 1: high card, 2: pair, 3: two pairs, etc
     * */
    int calculate(PokerHand firstHand, PokerHand secondHand);

}
