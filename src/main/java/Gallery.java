//Can write this as the third class
import java.util.ArrayList;

public class Gallery {
    private String name;
    private Double till;
    private ArrayList <Artwork> stock;

    public Gallery (String inputName, double inputTill)
    {
        this.name = inputName;
        this.till = inputTill;
        //Creating new arrayList as stock is currently null as an instance variable
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

    //Changing property so needs to be void as it is a setter
    //
    public void changeTill(double amount)
    {
        this.till += amount;
    }

    /* The ability to sell artwork to customer
    -It is changing something as moving money from one place to another
    Does not need to return anything
    Needs a customer to sell to and an artwork to sell
    */
    public void sellArtwork(Customer customer, Artwork artwork)
    {
        //If the stock does not contain the artwork
        if (!this.stock.contains(artwork))
        {
            return; //Exit from if statement
        }

        //If customer has less money than price of artwork
        if (customer.getWallet() < artwork.getPrice())
        {
            return; //Exit from if statement
        }

        //At this point we know the artwork is in stock and customer has enough money, so we can sell
        //Remove artwork from stock
        this.stock.remove(artwork);
        //Remove the artwork price from wallet
        customer.changeWallet(-artwork.getPrice());
        //Changes till amount in gallery
        this.changeTill(artwork.getPrice());
    }

    //Takes in stock arraylist so nothing outside class is needed for parameters
    public double totalValue()
    {
        //Accumulator variable of the total amount
        double total = 0;
        //Uses stock arraylist and loops through it
        for (Artwork artwork : this.stock)
        {
            //Increments total by artwork price
            total += artwork.getPrice();
        }
        //Returns full total value of artworks in gallery
        return total;
    }
}
