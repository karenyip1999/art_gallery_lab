import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Emily",500.50);
    }

    @Test
    public void getNameTest()
    {
        assertThat(customer.getName()).isEqualTo("Emily");
    }

    @Test
    public void setNameTest()
    {
        customer.setName("John");
        assertThat(customer.getName()).isEqualTo("John");
    }

    @Test
    public void getWalletTest()
    {
        assertThat(customer.getWallet()).isEqualTo(500.50);
    }

    @Test
    public void setWalletTest()
    {
        customer.setWallet(600.50);
        assertThat(customer.getWallet()).isEqualTo(600.50);
    }


}
