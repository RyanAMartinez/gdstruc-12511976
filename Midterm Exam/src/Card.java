import java.util.Objects;

public class Card {
    private String name;
    private int id;

    public Card(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Card {" +
                "CardType = '" + name + "', " +
                "CardId = " + id + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return id == card.id && Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
