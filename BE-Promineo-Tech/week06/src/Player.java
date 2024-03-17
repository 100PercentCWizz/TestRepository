import java.util.ArrayList;
import java.util.List;

public class Player {

    List<Card> hand = new ArrayList<Card>();
    int score = 0;
    String name;

    public void describe() {
        System.out.println(name);
        for (int index = 0; index < 5; index ++) {
            System.out.println(name);
        }
    }

    public Card flip() {
        Card top_card = hand.get(0);
        hand.remove(0);
        return top_card;
    }

    public void draw(Deck in_deck) {
        hand.add(in_deck.draw());
    }

    public void incrementScore() {
        score ++;
    }

}
