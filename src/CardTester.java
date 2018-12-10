/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args)
    {
        Card card1 = new Card ("five", "diamond", 5);
        Card card2 = new Card ("jack", "heart", 11);
        Card card3 = new Card ("king", "club", 13);
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }
}
