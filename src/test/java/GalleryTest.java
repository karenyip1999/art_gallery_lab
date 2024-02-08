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
        gallery = new Gallery("Kaya");
        //monaLisa = new Artwork("Mona Lisa", "daVinci", 150.97);
        //sunflower = new Artwork("Sunflower","Gogh", 220.53 );
        //starryNight = new Artwork("Starry Night", "Picasso",435.22);
    }

    @Test
    public void GetNameTest()
    {
        assertThat(gallery.getName()).isEqualTo("Kaya");
    }




}
