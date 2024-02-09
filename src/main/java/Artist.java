//Start with writing this class as it is not reliant on other classes
public class Artist {

    //Instance variable - It is dynamic across different instances
    private String name;

    public Artist(String inputName)
    {
        this.name = inputName;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String inputName)
    {
        this.name = inputName;
    }
}
