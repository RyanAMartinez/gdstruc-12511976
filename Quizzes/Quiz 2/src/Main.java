
public class Main {

    public static void main(String[] args) {

        player apple = new player(1, "Apple", 68 );
        player orange = new player(2, "Orange", 53 );
        player evilapple = new player(3, "EvilApple", 69 );

        //I made the error of having them as similar names.
        playerLinkedList PlayerLinkedList = new playerLinkedList();

        PlayerLinkedList.addToFront(apple);
        PlayerLinkedList.addToFront(orange);
        PlayerLinkedList.addToFront(evilapple);

        PlayerLinkedList.printList();
        System.out.println("Player count: " + PlayerLinkedList.getSize());

        System.out.println("\nIs there a player with Apple in their username? \n" + PlayerLinkedList.contains(apple));
        System.out.println("\nWhat position is Apple? \n" + PlayerLinkedList.indexOf(apple) + "nd Slot");

        System.out.println("\nRemoved: " + PlayerLinkedList.removeFront());
        PlayerLinkedList.printList();
        System.out.println("Size: " + PlayerLinkedList.getSize());
        System.out.println("\nWhat is the new position of player Apple? \n" + PlayerLinkedList.indexOf(apple) + "st Slot");


    }
}