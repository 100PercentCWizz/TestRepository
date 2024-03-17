public class App {
    public static void main(String[] args) throws Exception {

        final String YELLOW = "\033[0;33m";  // YELLOW
        final String BLUE = "\033[0;34m";    // BLUE
        final String WHITE = "\033[0;37m";   // WHITE

        System.out.println();

        // a.      Instantiate a Deck and two Players, call the shuffle method on the deck.
        Deck deck = new Deck();

        Player p1 = new Player();
        p1.name = "Christian";

        Player p2 = new Player();
        p2.name = "Hannah";

        deck.shuffle();

        // b.     Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
        for (int num = 0; num < 52; num ++) {
            if (num % 2 == 0) {
                p1.draw(deck);
            } else {
                p2.draw(deck);
            }
        }

        // c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.
        // Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.  Print a message to say which player received a point.
        // Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
        for (int num = 0; num < 26; num ++) {
            Card p1_card = p1.flip();
            Card p2_card = p2.flip();
            if (p1_card.getValue() > p2_card.getValue()) {
                System.out.println(BLUE + "Player 1 WINS!!! " + p1_card.getName() + " TRUMPS " + p2_card.getName());
                p1.incrementScore();
            } else if (p1_card.getValue() < p2_card.getValue()) {
                System.out.println(YELLOW + "Player 2 WINS!!! " + p2_card.getName() + " TRUMPS " + p1_card.getName());
                p2.incrementScore();
            } else {
                System.out.println(WHITE + "TIE BETWEEN " + p1_card.getName() + " AND " + p2_card.getName());
                System.out.println(" - NO POINTS AWARDED - ");
            }
        }

        // d.      After the loop, compare the final score from each player.
        String winner = "";
        if (p1.score > p2.score) {
            winner = BLUE + "PLAYER 1 WINS!!!";
        } else if (p1.score < p2.score) {
            winner = YELLOW + "PLAYER 2 WINS!!!";
        } else {
            winner = WHITE + "IT'S A DRAW!!!";
        }

        // e.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
        System.out.println(WHITE + "\nSCORE:\nPlayer 1: " + p1.score + " | Player 2: " + p2.score);
        System.out.println(winner + "\n");

    }
}
