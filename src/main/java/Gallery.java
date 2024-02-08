import java.util.ArrayList;

public class Gallery {
    private String name;
    private Double till;
    private ArrayList <Artwork> stock;

    public Gallery (String inputName)
    {
        this.name = inputName;
        this.till = 0.0;
        this.stock = new ArrayList<>();
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public double getTillCount()
    {
        return this.till;
    }

    public void setTillCount(double amount)
    {
        this.till = amount;
    }

    public ArrayList<Artwork>getArtwork()
    {
        return this.stock;
    }

    public void setStock(ArrayList<Artwork> stock) {
        this.stock = stock;
    }
}
