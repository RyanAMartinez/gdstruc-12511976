
public class Main {

    public static void main(String[] args)
    {

        Player apple = new Player(1, "Apple", 100);
        Player grape = new Player(2, "Grape", 150);
        Player pineapple = new Player(3, "Pineapple", 70);
        Player melon = new Player(4, "Melon", 140);
        Player grapefruit = new Player(5, "Grapefruit", 200);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(apple.getName(), apple);
        hashtable.put(grape.getName(), grape);
        hashtable.put(pineapple.getName(), pineapple);
        hashtable.put(melon.getName(), melon);
        hashtable.put(grapefruit.getName(), grapefruit);


        hashtable.printHashtable();
        System.out.println("\n" + hashtable.get("Apple"));
        hashtable.remove(apple.getName());
        hashtable.printHashtable();
    }

}