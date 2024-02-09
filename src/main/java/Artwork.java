//Artist class has been made so can create this class second
public class Artwork {
    //All instance variables will be dynamic so needs to be in param of constructor
    private String title;
    private Artist artist;
    private double price;

    public Artwork(String inputTitle, Artist inputArtist, double inputPrice) {
        this.title = inputTitle;
        this.artist = inputArtist;
        this.price = inputPrice;

    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }

    public Artist getArtist()
    {
        return this.artist;
    }

    public void setArtist(Artist newArtist)
    {
        this.artist = newArtist;
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }



}
