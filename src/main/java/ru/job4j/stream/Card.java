package ru.job4j.stream;

import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    @Override
    public String toString() {
        return "Card:" + suit + " " + value;
    }

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(values -> Stream.of(Value.values())
                        .map(suit -> new Card(values, suit)))
                .forEach(System.out::println);
    }
}