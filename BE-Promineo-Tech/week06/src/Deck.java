import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card> cards = new ArrayList<Card>();

    Deck() {
        String suit_name = "";
        String card_number = "";
        for (int suit = 0; suit < 4; suit ++) {
            for (int num = 2; num < 15; num ++) {
                switch (suit) {
                    case 0:
                        suit_name = "Diamonds";
                        break;
                    case 1:
                        suit_name = "Hearts";
                        break;
                    case 2:
                        suit_name = "Clovers";
                        break;
                    case 3:
                        suit_name = "Spades";
                        break;
                }
            
                switch (num) {
                    case 2:
                        card_number = "Two";
                        break;
                    case 3:
                        card_number = "Three";
                        break;
                    case 4:
                        card_number = "Four";
                        break;
                    case 5:
                        card_number = "Five";
                        break;
                    case 6:
                        card_number = "Six";
                        break;
                    case 7:
                        card_number = "Seven";
                        break;
                    case 8:
                        card_number = "Eight";
                        break;
                    case 9:
                        card_number = "Nine";
                        break;
                    case 10:
                        card_number = "Ten";
                        break;
                    case 11:
                        card_number = "Jack";
                        break;
                    case 12:
                        card_number = "Queen";
                        break;
                    case 13:
                        card_number = "King";
                        break;
                    case 14:
                        card_number = "Ace";
                        break;
                }
            
                Card card = new Card();

                card.setName(card_number + " of " + suit_name);
                card.setValue(num);

                cards.add(card);
            }
        }
    }

    // populate card deck here

    // {
    //     for (int suit = 0; suit < 4; suit ++) {
    //         for (int num = 2; num < 15; num ++) {
    //             Card card = new Card();
                
    //             String suit_name = "";
    //             switch (suit) {
    //                 case 0:
    //                     suit_name = "Diamonds";
    //                     break;
    //                 case 1:
    //                     suit_name = "Hearts";
    //                     break;
    //                 case 2:
    //                     suit_name = "Clovers";
    //                     break;
    //                 case 3:
    //                     suit_name = "Spades";
    //                     break;
    //             }
    
    //             String card_number = "";
    //             switch (num) {
    //                 case 2:
    //                     card_number = "Two";
    //                     break;
    //                 case 3:
    //                     card_number = "Three";
    //                     break;
    //                 case 4:
    //                     card_number = "Four";
    //                     break;
    //                 case 5:
    //                     card_number = "Five";
    //                     break;
    //                 case 6:
    //                     card_number = "Six";
    //                     break;
    //                 case 7:
    //                     card_number = "Seven";
    //                     break;
    //                 case 8:
    //                     card_number = "Eight";
    //                     break;
    //                 case 9:
    //                     card_number = "Nine";
    //                     break;
    //                 case 10:
    //                     card_number = "Ten";
    //                     break;
    //                 case 11:
    //                     card_number = "Jack";
    //                     break;
    //                 case 12:
    //                     card_number = "Queen";
    //                     break;
    //                 case 13:
    //                     card_number = "King";
    //                     break;
    //                 case 14:
    //                     card_number = "Ace";
    //                     break;
    //             }
    
    //             card.setName(card_number + " of " + suit_name);
    //             card.setValue(num);

    //             cards.add(card);
    //         }
    //     }
    // }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        Card top_card = cards.get(0);
        cards.remove(0);
        return top_card;
    }
    
}
