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
        System.out.println();

        String[] ranks2 = {"ace", "two", "three", "four"};
        String[] suits2 = {"blue", "red"};
        int[] pointValues2 = {1, 2, 3, 4};
        Deck d2 = new Deck(ranks2, suits2, pointValues2);
        System.out.println(d2);
        System.out.println();

        String[] ranks3 = {"ace", "two", "three", "four"};
        String[] suits3 = {"blue", "red", "green"};
        int[] pointValues3 = {1, 2, 3, 4};
        Deck d3 = new Deck(ranks3, suits3, pointValues3);
        System.out.println(d3);
        System.out.println();

        String[] ranks = {"ace","two","three","four","five","six","seven","eight","nine","ten","jack", "queen", "king"};
        String[] suits = {"diamonds", "clubs","hearts","spades"};
        int[] pointValues = {1,2,3,4,5,6,7,8,9,10,11, 12, 13};
        Deck d = new Deck(ranks, suits, pointValues);
        System.out.println(d);
        System.out.println();

        System.out.println("**** Original Deck Methods ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After 1 Card Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal Remaining 5 Cards ****");
        for (int i = 0; i < 5; i++) {
            System.out.println("  deal: " + d.deal());
        }
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After All Cards Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card From Empty Deck ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();
    }
}
