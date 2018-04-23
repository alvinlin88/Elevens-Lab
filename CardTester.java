/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        Card card1 = new Card("ace", "clubs", 1);
        Card card2 = new Card("ace", "clubs", 1);
        Card card3 = new Card("6", "hearts", 6);

        card1.toString();
        card2.toString();
        card3.toString();
    }
}