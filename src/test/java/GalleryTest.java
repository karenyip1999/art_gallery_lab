import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;

public class GalleryTest {
    Gallery gallery;
    Artwork monaLisa;
    Artwork sunflower;
    Artwork starryNight;

    @BeforeEach
    public void setUp()
    {
        //Gallery object
        gallery = new Gallery("Kaya", 259.20);
        //Artist objects
        Artist davinci = new Artist ("daVinci");
        Artist gogh = new Artist ("Gogh");
        Artist picasso = new Artist ("Picasso");
        //Artwork objects
        monaLisa = new Artwork("Mona Lisa", davinci, 150.97);
        sunflower = new Artwork("Sunflower",gogh, 220.53 );
        starryNight = new Artwork("Starry Night", picasso,435.22);
    }

    @Test
    public void getNameTest()
    {
        assertThat(gallery.getName()).isEqualTo("Kaya");
    }

    @Test
    public void setNameTest()
    {
        gallery.setName("Maren");
        assertThat(gallery.getName()).isEqualTo("Maren");
    }

}
