
/** represents a playing card that can draw itself. */
private enum Color {
    RED,
    BLACK
}

private enum Suit {
    HEARTS,
    DIAMONDS,
    SPADES,
    CLUBS
}
  
public class Card implements Drawable, Updateable{
  private Color color;
  private Suit suit;
  private int value;
  private boolean faceUp = false;
  private Image front;
  private static Image back;
  private int x;
  private int y;


  public Card(Color color, Suit suit, int value) {
    this.color = color;
    this.suit = suit;
    this.value = value;
  }

  public Color getColor() {
    return color;
  }

  public Suit getSuit() {
    return suit;
  }

  public int getValue() {
    return value;
  }

  public boolean isFaceUp() {
    return faceUp;
  }
  
  public get(Card c) {
    return c;
  }

  public draw(Graphics g) {

  }

  public int compareTo(Card c) {
    if (this.getValue()<c.getValue()) {
      return -1;
    } else if (this.getValue()>c.getValue()) {
      return 1;
    } else {
      return 0;
    }
  }

  public String toString() {
    String s = "";
    String val = "";
    if (value==0) {
      val = "Ace"; Jack, King, Queen
    } if (value ==)
    s += val + " of " + color + suit;
    return s;
  }

}
