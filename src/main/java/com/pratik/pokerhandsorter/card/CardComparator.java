package com.pratik.pokerhandsorter.card;

import java.util.Comparator;

/**
 * Comparator for card
 */
public class CardComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        return o2.getCardRank().getRank() - o1.getCardRank().getRank();
    }
}
