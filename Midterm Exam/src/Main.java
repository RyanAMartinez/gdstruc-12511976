import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Random randomize = new Random();

        CardStack playerDeck = new CardStack();
        CardStack playerHand = new CardStack();
        CardStack discardPile = new CardStack();

        String[] cardNames = {"Spade", "Heart", "Club", "Diamond", "Square", "Circle", "Triangle"
        , "Rhombus", "Parallelogram", "Smiley Face", "Sad Face", "Jack", "Queen", "King", "Joker"};

        for (int i = 1; i <= 30; i++)
        {
            String randomName = cardNames[randomize.nextInt(cardNames.length)];
            playerDeck.push(new Card(i, randomName));
        }

        int round = 1;

        while (!playerDeck.isEmpty())
        {
            System.out.println("Round: " + round );

            //this is nicer than rand in c++
            int command = randomize.nextInt(3);
            int R = randomize.nextInt(5) + 1;

            //Switch case loop
            switch (command)
            {
                case 0: //Draws Cards
                    System.out.println("Action: Draw " + R + " card(s)");
                    for (int i = 0; i < R; i++)
                    {
                        Card drawn = playerDeck.pop();
                        if (drawn == null) {
                            System.out.println("( Zero Cards Held )");
                            break;
                        }
                        playerHand.push(drawn);
                    }
                    break;

                case 1: //Discards Cards
                    System.out.println("Action: Discard " + R + " card(s)");
                    for (int i = 0; i < R; i++)
                    {
                        Card discarded = playerHand.popRandom(randomize);
                        if (discarded == null) {
                            System.out.println("( Nothing to discard )");
                            break;
                        }
                        discardPile.push(discarded);
                    }
                    break;

                case 2: //Retrieve from discarded pile
                    System.out.println("Action: Get " + R + " card(s) from the discarded pile");
                    for (int i = 0; i < R; i++)
                    {
                        Card recovered = discardPile.pop();
                        if (recovered == null) {
                            System.out.println("( Discard pile is empty )");
                            break;
                        }
                        playerHand.push(recovered);
                    }
                    break;
            }

            //Display
            System.out.println("\nCard Types currently holding:");
            playerHand.printCards();
            System.out.println("Total cards left in deck:" + playerDeck.size());
            System.out.println("Total cards in discarded pile: " + discardPile.size());
            System.out.println();

            round++;
        }

        System.out.println("The Deck is empty, you are free!");
    }
}