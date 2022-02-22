import java.awt.Graphics;
import java.awt.event.*;
import java.sql.ResultSet;

public class Deck extends Pile {

    public Deck(){
        super();
		initDeck();
	}

	private void initDeck() {
        for (int i = 1; i <= 14; i++) {
            list.add(new Card(Card.Color.RED, Card.Suit.HEARTS, i));
            list.add(new Card(Card.Color.RED, Card.Suit.DIAMONDS, i));
            list.add(new Card(Card.Color.BLACK, Card.Suit.CLUBS, i));
            list.add(new Card(Card.Color.BLACK, Card.Suit.SPADES, i));
        }
	}

    public void draw(Graphics g) {

    }

    public void update(ActionEvent a) {

    }

    public boolean canAddCard(Card c) {
        return false;
    }

}