import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;

public class ArtistTest {

    Artist artist;

    @BeforeEach
    public void setUp()
    {
        artist = new Artist("daVinci");
    }

    @Test
    public void getNameTest()
    {
        assertThat(artist.getName()).isEqualTo("daVinci");
    }

    @Test
    public void setNameTest()
    {
        artist.setName("picasso");
        assertThat(artist.getName()).isEqualTo("picasso");
    }



}
