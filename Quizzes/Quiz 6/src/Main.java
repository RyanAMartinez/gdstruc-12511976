
public class Main
{
    public static void main(String[] args)
    {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(22);
        tree.insert(12);
        tree.insert(34);
        tree.insert(4);
        tree.insert(17);
        tree.insert(28);
        tree.insert(27);

        System.out.println("Data In Ascending Order");
        tree.traverseInOrder();
        System.out.println("\nData In Descending Order");
        tree.traverseInOrderDesc();
        System.out.println("\nWhat is the root?");
        System.out.println(tree.get(25));
        System.out.println("\nWhat is the lowest number in the dataset?");
        System.out.println(tree.getMin());
        System.out.println("\nWhat about the Max?");
        System.out.println(tree.getMax());
    }
}
