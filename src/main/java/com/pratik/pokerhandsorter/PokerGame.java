package com.pratik.pokerhandsorter;

import com.pratik.pokerhandsorter.card.Card;
import com.pratik.pokerhandsorter.combination.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by pratikkayastha on 8/25/18.
 */
public class PokerGame {

    private PokerHand firstHand;
    private PokerHand secondHand;
    private int winner;

    private static final List<ICombinationCalculator> combinations;
    static {
        combinations = new ArrayList<>();

        combinations.add(new RoyalFlushCalculator());
        combinations.add(new StraightFlushCalculator());
        combinations.add(new FourOfKindCalculator());
        combinations.add(new FullHouseCalculator());
        combinations.add(new FlushCalculator());
        combinations.add(new StraightCalculator());
        combinations.add(new ThreeOfKindCalculator());
        combinations.add(new TwoPairCalculator());
        combinations.add(new PairCalculator());
        combinations.add(new HighCardCalculator());
    }


    public PokerGame(String gameDetails) {
        String[] game = gameDetails.split(" ");

        this.firstHand = new PokerHand(Arrays.copyOfRange(game, 0, game.length/2));
        this.secondHand = new PokerHand(Arrays.copyOfRange(game, game.length/2, game.length));
        this.winner = 0;
    }

    public int findWinner() {
        int combination = 0;
        while (combination<combinations.size() && this.winner==0) {
            int winner = combinations.get(combination).calculate(this.firstHand, this.secondHand);
            if (winner>0) {
                this.winner = winner;
            }
            combination++;
        }

        return this.winner;
    }

    /*public int calculateWinner() {
        this.firstHand.setCombinationRank(CombinationCalculator.calculate(this.firstHand));
        this.secondHand.setCombinationRank(CombinationCalculator.calculate(this.secondHand, this.firstHand.getCombinationRank()));

        System.out.println(this.firstHand.getCombinationRank());
        System.out.println(this.secondHand.getCombinationRank());

        if (this.firstHand.getCombinationRank()>this.secondHand.getCombinationRank()) {
            return 1;
        } else if (this.secondHand.getCombinationRank()>this.firstHand.getCombinationRank()) {
            return 2;
        } else {
            this.firstHand.sortCards();
            this.secondHand.sortCards();

            System.out.println("Sorted...");

            for (int i=0; i<5; i++) {
                Card firstHandCard = this.firstHand.getCards().get(i);
                Card secondHandCard = this.secondHand.getCards().get(i);

                if (firstHandCard.getCardRank().getRank()<secondHandCard.getCardRank().getRank()) {
                    return 2;
                } else if(secondHandCard.getCardRank().getRank()<firstHandCard.getCardRank().getRank()) {
                    return 1;
                }
            }

            return 1;
        }
    }*/
}
