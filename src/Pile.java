
import java.util.ArrayList;
/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public abstract class Pile implements Drawable, Updateable {
    // instance variables
    protected ArrayList<Card> list;
    private int locationX;
    private int locationY;
    
    // methods:
    // Pile constructor 
    public Pile(int X, int Y) {
        this.locationX = X;
        this.locationY = Y;

        this.list = new ArrayList<>();
    }

    public Pile() {
        this(0, 0);
    }

    // draw pile

    // adds singular card
    public void addCard (Card c) {
        list.add(c);
    }

    // adds list of cards
    public void addCardList (ArrayList <Card> cardList) {
        for (int i = 0; i < cardList.size(); i++) {
            list.add(cardList.get(i));
        }
    }

    // returns the top card in a pile, removes it from the pile
    public Card getTopCard() {
        list.remove(list.size()-1);
        return list.get(list.size()-1);
    }

    // returns specified index card and all cards after, removes all of them from the pile
    public ArrayList <Card> getCards(int index) {
        ArrayList <Card> ans = new ArrayList <>();
        for (int i = index; i < list.size(); i++) {
            ans.add(list.remove(i));
            i--;
        }
        return ans;
    }

    public Card deal(Pile other, int ind) {
        if (list.size() == 0) {
			return null;
		}
		Card c = list.remove(0);
    	return c;
    }

    public void shuffle() {

    }
    
    public abstract boolean canAddCard(Card c);
}
