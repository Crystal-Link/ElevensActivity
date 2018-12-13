/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks1 = {"jack", "queen", "king"};
        String[] suits1 = {"blue", "red"};
        int[] pointValues1 = {11, 12, 13};
        Deck d1 = new Deck(ranks1, suits1, pointValues1);
        System.out.println(d1);

        String[] ranks2 = {"ace", "two", "three", "four"};
        String[] suits2 = {"blue", "red"};
        int[] pointValues2 = {1, 2, 3, 4};
        Deck d2 = new Deck(ranks2, suits2, pointValues2);
        System.out.println(d2);

        String[] ranks3 = {"ace", "two", "three", "four"};
        String[] suits3 = {"blue", "red", "green"};
        int[] pointValues3 = {1, 2, 3, 4};
        Deck d3 = new Deck(ranks3, suits3, pointValues3);
        System.out.println(d3);
    }
}
