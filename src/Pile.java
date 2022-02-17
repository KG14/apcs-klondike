
/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public abstract class Pile implements Drawable, Updateable {
    // instance variables
    private Arraylist <Card> list;
    private int locationX;
    private int locationY;
    
    // methods:
    // Pile constructor 
    public Pile (Arraylist <Card> setList, int X, int Y) {
        this.list = setList;
        this.locationX = X;
        this.locationY = Y;
    }

    // draw

    // adds singular card
    public void addCard (Card c) {
        list.add(c);
    }

    // adds list of cards
    public void addCardList (Arraylist <Card> cardList) {
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
    public Arraylist <Card> getListCards (int index) {
        Arraylist <Card> ans = new Arraylist <Card> ();
        for (int i = index; i < list.size(); i++) {
            ans.add(list.get(i));
            list.remove(i);
            i--;
        }
        return ans;
    }
    
    public abstract boolean canAddCard(Card c);
}
