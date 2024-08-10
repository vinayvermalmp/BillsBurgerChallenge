package CollectionDemo.cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffel Deck", 4);

        Collections.reverse(deck);
        Card.printDeck(deck, "Reverse Deck of cards", 4);

        var sortingAlgo = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);

        Collections.sort(deck, sortingAlgo);
        Card.printDeck(deck, "Standard Deck sorted by rank, suit ", 13);


        List<Card> kings = new ArrayList<>(deck.subList(44, 48));
        Card.printDeck(kings, "Kinsg in deck", 1);

        List<Card> tens = new ArrayList<>(deck.subList(32, 36));
        Card.printDeck(tens, "tens in deck", 1);

    }
}
