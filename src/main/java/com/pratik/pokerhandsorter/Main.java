package com.pratik.pokerhandsorter;

/**
 * Created by pratikkayastha on 8/25/18.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Running sorting...");

        //PokerGame game = new PokerGame("4H 4C 6S 7S KD 2C 3S 9S 9D TD");
        //PokerGame game = new PokerGame("5D 8C 9S JS AC 2C 5C 7D 8S QH");
        //PokerGame game = new PokerGame("2D 9C AS AH AC 3D 6D 7D TD QD");
        //PokerGame game = new PokerGame("4D 6S 9H QH QC 3D 6D 7H QD QS");
        PokerGame game = new PokerGame("2H 2D 4C 4D 4S 3C 3D 3S 9S 9D");

        System.out.println(game.findWinner());

    }

}
