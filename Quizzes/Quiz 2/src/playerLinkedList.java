public class playerLinkedList {
    private playerNode head;
    private int size;

    public void addToFront(player player)
    {
        playerNode playerNode = new playerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;
    }

    //Checks if the list is empty, if not
    public playerNode removeFront()
    {
        if (head == null)
        {
            return null;
        }

        playerNode removedNode = head;
        head = head.getNextPlayer();
        removedNode.setNextPlayer(null);
        size--;
        return removedNode;
    }

    //Sends the total list size
    public int getSize() {
        return size;
    }

    public int indexOf(player player)
    {
        playerNode current = head;
        int index = 0;

        while (current != null)
        {
            if (current.getPlayer().equals(player))
            {
                return index;
            }
            current = current.getNextPlayer();
            index++;
        }

        return -1;
    }

    //Checks for a player
    public boolean contains(player player)
    {
        return indexOf(player) != -1;
    }

    public void printList()
    {
        playerNode current = head;
        System.out.print("Head -> ");
        while (current != null)
        {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

}
