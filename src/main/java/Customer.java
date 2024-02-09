//Final class to make
public class Customer {

    private String name;
    private double wallet;

    public Customer(String inputName, double inputWallet)
    {
        this.name = inputName;
        this.wallet = inputWallet;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public double getWallet()
    {
        return this.wallet;
    }

    public void setWallet(double amount)
    {
        this.wallet = amount;
    }

    //Void as it is a type of setter as changing amount
    public void changeWallet(double amount)
    {
        this.wallet += amount;
    }



}
