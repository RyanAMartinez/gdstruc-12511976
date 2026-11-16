import java.util.LinkedList;
import java.util.Random;

public class CardStack {
    private LinkedList<Card> stack;

    public CardStack()
    {
        this.stack = new LinkedList<>();
    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public Card pop()
    {
        if (stack.isEmpty())
        {
            return null;
        }
        return stack.pop();
    }

    public int size()
    {
        return stack.size();
    }

    public Card popRandom(Random randomize)
    {
        if (stack.isEmpty())
        {
            return null;
        }
        int index = randomize.nextInt(stack.size());
        return stack.remove(index);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public void printCards()
    {
        if (stack.isEmpty())
        {
            System.out.println("( 0 Cards Held )");
            return;
        }
        for (Card card : stack)
        {
            System.out.println(" -" + card);
        }
    }
}
