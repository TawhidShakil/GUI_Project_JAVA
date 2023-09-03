import java.util.*;
public class Card{

    // attributes
    private final String face;
    private final String suit;

    // constructor
    public Card (String face, String suit){
        this.face = face;
        this.suit = suit;
    }

    // setter methods
    // this block is not working coz my attributes are final that means
    // we can't change it
    // public void setFace(String face){
    //     this.face = face;
    // }

    // public void setSuit(String suit){
    //     this.suit = suit;
    // }

    // getter methods

    public String getFace(){
        return face;
    }

    public String getSuit(){
        return suit;
    }

    public String toString(){
        return face +" of "+ suit;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create an object
        // Card card = new Card("Ace", "Dimonds");
        System.out.print("Enter the face: ");
        String newFace = input.nextLine();
        System.out.print("Enter the Suit: ");
        String newSuit = input.nextLine();
        Card card = new Card(newFace, newSuit);
        System.out.println(card.toString());
        input.close();
    }
}