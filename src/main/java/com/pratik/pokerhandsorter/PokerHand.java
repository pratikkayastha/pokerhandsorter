package com.pratik.pokerhandsorter;

import com.pratik.pokerhandsorter.card.Card;
import com.pratik.pokerhandsorter.card.CardComparator;
import com.pratik.pokerhandsorter.card.CardRank;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Represents a poker hand
 * Will contain five cards
 */
public class PokerHand {

    private Set<Card> cards;

    // counts number of same cards
    private Map<CardRank, Integer> cardRankFrequency;
    // maps frequency to cards
    private Map<Integer, CardRank> frequencyCardRank;

    private int combinationRank;

    public PokerHand(String[] handDetail) {
        this.cards = new TreeSet<>(new CardComparator());
        this.cardRankFrequency = new HashMap<>();
        this.frequencyCardRank = new HashMap<>();

        for (String cardDetail : handDetail) {
            Card card = new Card(cardDetail);
            this.cards.add(card);
            this.cardRankFrequency.put(card.getCardRank(),
                    this.cardRankFrequency.containsKey(card.getCardRank()) ? this.cardRankFrequency.get(card.getCardRank())+1 : 1);
        }

        for (CardRank cardRank : this.cardRankFrequency.keySet()) {
            this.frequencyCardRank.put(this.cardRankFrequency.get(cardRank), cardRank);
        }
    }

    public int getTotalCardRank() {
        return this.cards.stream().mapToInt(c -> c.getCardRank().getRank()).sum();
    }

    public Set<Card> getCards() {
        return this.cards;
    }

    public Map<CardRank, Integer> getCardRankFrequency() {
        return this.cardRankFrequency;
    }

    public Map<Integer, CardRank> getFrequencyCardRank() { return this.frequencyCardRank; }

    public int getCombinationRank() {
        return this.combinationRank;
    }

    public void setCombinationRank(int combinationRank) {
        this.combinationRank = combinationRank;
    }

    @Override
    public String toString() {
        return this.cards.stream().map(c -> c.toString()).collect(Collectors.joining(" "));
    }
}
