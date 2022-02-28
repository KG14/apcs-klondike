import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.awt.*;

public class Card implements Drawable, Updateable{

    /** represents a playing card that can draw itself. */
    protected enum Color {
        RED,
        BLACK
    }

    protected enum Suit {
        HEARTS,
        DIAMONDS,
        SPADES,
        CLUBS
    }

    private Color color;
    private Suit suit;
    private int value; // 1 to 12
    private boolean faceUp = false;
    private Image front;
    private static Image back;
    private int x;
    private int y;

    public Card(Color color, Suit suit, int value) {
        this.color = color;
        this.suit = suit;
        this.value = value;

        if (back == null) {
            openBackImage();
        }

        openFrontImage();
    }

    private void openBackImage() {
        try {
            File f = new File("../images/b2fv.png");
            back = ImageIO.read(f);
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }

    private void openFrontImage() {
        String filename = "";

        // Add first letter of suit
        filename += suit.toString().substring(0, 1).toLowerCase();

        // Add first letter of value
        switch(value) {
            case 11:
                filename += "j";
                break;

            case 12:
                filename += "q";
                break;

            case 13:
                filename += "k";
                break;

            default:
                filename += value;
                break;
        }

        try {
            File f = new File("images/cards/" + filename + ".png");
            System.out.println(filename);
            System.out.println("hi");
            System.out.println("images/cards/" + filename + ".png");
            front = ImageIO.read(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    public void setX(int loc) {
        x = loc;
    }

    public void setY(int loc) {
        y = loc;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void draw(Graphics g) {
        g.drawImage(front, x, y, null);
    }

    public void update(ActionEvent a) {

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

    /**
    public String toString() {
        String s = "";
        String val = "";
        if (value==0) {
        val = "Ace"; Jack, King, Queen
        } if (value ==)
        s += val + " of " + color + suit;
        return s;
    } */

}
