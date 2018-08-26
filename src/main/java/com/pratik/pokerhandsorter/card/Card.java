package com.pratik.pokerhandsorter.card;

/**
 * Represents a card
 * eg: 4H is four or hearts
 */
public class Card {

    private CardSuit cardSuit;
    private CardRank cardRank;

    public Card(String cardString) {
        this.cardRank = CardRank.findByName(cardString.charAt(0));
        this.cardSuit = CardSuit.findByName(cardString.charAt(1));
    }

    public CardRank getCardRank() {
        return this.cardRank;
    }

    public CardSuit getCardSuit() { return this.cardSuit; }

    @Override
    public String toString() {
        return String.valueOf(this.cardRank.getName()) + this.cardSuit.getName();
    }
}
