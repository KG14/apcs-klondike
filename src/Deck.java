public class Deck extends Pile {

    public Deck(){
		initDeck();
	}

	private void initDeck() {
        for (int i = 0; i <= 13; i++) {
            this.add(new Card(RED, HEARTS, i));
            this.add(new Card(RED, DIAMONDS, i));
            this.add(new Card(BLACK, CLUBS, i));
            this.add(new Card(BLACK, SPADES, i));
        }
	}

}