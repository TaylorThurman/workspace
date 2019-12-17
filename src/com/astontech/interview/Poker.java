package com.astontech.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Poker {

    public static void main(String[] args) {
        System.out.println(generateDeck());
//        System.out.println(generateHands(5, 3));
    }
    private static List<String> generateDeck() {
        List<String> suits = Arrays.asList("Hearts", "Diamonds", "Spades", "Clubs");
        List<String> numberList = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        List<String> deck = new ArrayList<>();

        // generate 52 cards in the deck with the above arrays, suits and numberList, and then return the deck



        return deck;
    }
    private static List<List<String>> generateHands(int numberOfCardsPerHand, int numberOfHands) {
        List<String> deck = generateDeck();
        List<List<String>> hands = new ArrayList<>();

        // shuffle the deck
        Collections.shuffle(deck);

        // using the deck we previously created, generate hands from the deck using the numberOfCardsPerHand
        // variable to know how many cards each hand needs to have
        // use the numberOfHands variable to know how many individual hands we need to create
        // save them in the hands variable and return it
        // write code here


        return hands;
    }
}
