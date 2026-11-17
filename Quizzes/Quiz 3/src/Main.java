import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        ArrayQueue queue = new ArrayQueue(10);
        Random random = new Random();
        //Another reason why I prefer java over c++
        Scanner scanner = new Scanner(System.in);

        int gamesCreated = 0;
        int playerIdCounter = 1;
        int turn = 1;

        while (gamesCreated < 10)
        {
            System.out.println("==============\nOngoing Matches: " + gamesCreated + "\n");

            int playerQueue = random.nextInt(7) + 1;
            System.out.println(playerQueue + " player(s) entered queue...\n");

            for (int i = 0; i < playerQueue; i++)
            {
                String playerName = "Player" + playerIdCounter;
                int levelRNG = (random.nextInt(10) + 1) * 20;
                queue.add(new Player(playerIdCounter, playerName, levelRNG));
                playerIdCounter++;
            }

            System.out.println("Current player(s) looking for match...");
            queue.printQueue();

            //Starts when 5 players are in queue
            if (queue.size() >= 5) {
                gamesCreated++;
                System.out.println("\nMatch Found! Creating Match #" + gamesCreated + "\n");
                System.out.println("Players in this match:");

                //Pop the first 5 players from the queue
                for (int i = 0; i < 5; i++) {
                    Player matchedPlayer = queue.remove();
                    System.out.println(" - " + matchedPlayer);
                }

                System.out.println("\nPlayers remaining in queue: " + queue.size() + " player(s):");
                queue.printQueue();
            }

            if (gamesCreated < 10) {
                System.out.println("\nPress Enter to requeue...");
                scanner.nextLine();
                turn++;
            }
        }

        System.out.println("\nGame servers full!");
        scanner.close();
    }
}
