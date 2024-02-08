import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;

public class ArtworkTest {

    Artwork monalisa;
    Artist davinci;
    Artist gogh;

    @BeforeEach
    public void setUp()
    {
        davinci = new Artist("daVinci");
        gogh = new Artist("gogh");
        monalisa = new Artwork("Mona Lisa", davinci, 150.97);
    }

    @Test
    public void getTitleTest()
    {
        assertThat(monalisa.getTitle()).isEqualTo("Mona Lisa");
    }

    @Test
    public void setTitleTest()
    {
        monalisa.setTitle("Starry Night");
        assertThat(monalisa.getTitle()).isEqualTo("Starry Night");
    }

    @Test
    public void getArtistTest()
    {
        assertThat(monalisa.getArtist()).isEqualTo(davinci);
    }

    @Test
    public void setArtistTest()
    {
        monalisa.setArtist(gogh);
        assertThat(monalisa.getArtist()).isEqualTo(gogh);

    }

    @Test
    public void getPriceTest()
    {
        assertThat(monalisa.getPrice()).isEqualTo(150.97);
    }

    @Test
    public void setPriceTest()
    {
        monalisa.setPrice(400.13);
        assertThat(monalisa.getPrice()).isEqualTo(400.13);
    }
}
