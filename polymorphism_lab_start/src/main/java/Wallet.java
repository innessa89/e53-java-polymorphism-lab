import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> contents;

    public Wallet(String name) {
        this.name = name;
        this.contents = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.contents.size();
    }

    public void addItem(IScan item) {
        this.contents.add(item);
    }
}
