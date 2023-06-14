import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Deck {
    private List<String> cards;
    private List<String> suits;
    private List<String> numbers;

    public Deck() {
        suits = Arrays.asList("Club", "Heart", "Diamond", "Spade");
        numbers = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
        reset();
    }

    public void reset() {
        cards = new ArrayList<>();
        for (String suit : suits) {
            for (String number : numbers) {
                cards.add(suit + number);
            }
        }
    }

    public List<String> draw(int numCards) {
        Random rand = new Random();
        List<String> drawnCards = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            int index = rand.nextInt(cards.size());
            drawnCards.add(cards.get(index));
            cards.remove(index);
        }
        return drawnCards;
    }

    public void returnCards(List<String> returnedCards) {
        cards.addAll(returnedCards);
    }
}

class Player extends Thread {
    private String name;
    private Deck deck;

    public Player(String name, Deck deck) {
        this.name = name;
        this.deck = deck;
    }

    @Override
    public void run() {
        int kingsCount = 0;
        while (kingsCount < 4) {
            List<String> drawnCards = deck.draw(4);
            System.out.println(name + " drew: " + drawnCards);
            for (String card : drawnCards) {
                if (card.contains("King")) {
                    kingsCount++;
                }
            }
            deck.returnCards(drawnCards);
        }
        System.out.println(name + " wins the game!");
    }
}

public class CardGameSimulation {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Player player1 = new Player("Player 1", deck);
        Player player2 = new Player("Player 2", deck);
        Player player3 = new Player("Player 3", deck);
        Player player4 = new Player("Player 4", deck);

        player1.start();
        player2.start();
        player3.start();
        player4.start();
    }
}
