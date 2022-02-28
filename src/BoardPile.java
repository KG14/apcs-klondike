import java.awt.Graphics;
import java.awt.event.*;
import java.sql.ResultSet;

public class BoardPile extends Pile {
    // need to do: mouseEvent click, records click and knows card is selected
    //             ensure click is in bounds of faceUp card 
    //             make sure last card is faceUp and everything else is faceDown
    //             add constant int of 71 x 96 dimensions of cards like X_WIDTH or something

    public BoardPile() {
        super();
    }

    public startGame() {
        // for (int x = 0; x<7; x++) {
        //     int i = 7;
        //     i -= x; // to build a descending number of cards (7,6,5, etc)
        //     for (int y = 0; y<i; y++) {
        //         Card c = deal();
        //         int a = 20*y;
        //         int b = 20*x;
        //         if (y == i-1) {
        //             g.drawImage(c, 200-b, 100+a, null); //40 and 100 are random points
        //         } else {
        //             g.drawImage(b1pt.png, 200-b, 100+a, null); // b1pt.png is backside of card
        //         }
        //     }
        // }
    }

    public void draw (Graphics g) {
        for (int x = 0; x<7; x++) {
            int i = 7;
            i -= x; // to build a descending number of cards (7,6,5, etc)
            for (int y = 0; y<i; y++) {
                Card c = deal();
                int a = 20*y;
                int b = 20*x;
                if (y == i-1) {
                    g.drawImage(c, 200-b, 100+a, null); //40 and 100 are random points
                } else {
                    g.drawImage(b1pt.png, 200-b, 100+a, null); // b1pt.png is backside of card
                }
            }
        }
    }

    public void update (ActionEvent a) {

    }

}