package App.domain.value_objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpisodeTitleTest {

    /**
     * Test the constructor of the class EpisodeTitle.
     */
    @Test
    void shouldCreateEpisodeTitle_whenEpisodeTitleIsValid() {

        //Arrange
        String episodeTitle = "Episode 1";

        //Act
        EpisodeTitle episodeTitle2 = new EpisodeTitle(episodeTitle);

        //Assert
        assertNotNull(episodeTitle2);
    }

    /**
     * Test the constructor of the class EpisodeTitle when the episode title is null.
     */
    @Test
    void shouldThrowIllegalArgumentException_whenEpisodeTitleIsNull() {

        //Arrange
        String episodeTitle = null;

        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> new EpisodeTitle(episodeTitle), "The value of 'episodeTitle' should not be null.");
    }

    /**
     * Test the getter of the class EpisodeTitle.
     */
    @Test
    void shouldReturnTitle_whenGetTitleIsCalled() {

        //Arrange
        String episodeTitle = "Episode 1";

        //Act
        EpisodeTitle episodeTitle2 = new EpisodeTitle(episodeTitle);

        String result = episodeTitle2.getEpisodeTittle();

        //Assert
        assertEquals(episodeTitle, result);

    }

    /**
     * Test the equals method of the class EpisodeTitle when the objects are the same.
     */
    @Test
    void shouldReturnTrue_whenObjectsAreTheSame() {

        //Arrange
        String episodeTitle = "Episode 1";

        //Act
        EpisodeTitle episodeTitle2 = new EpisodeTitle(episodeTitle);

        //Assert
        assertTrue(episodeTitle2.equals(episodeTitle2));
    }

    /**
     * Test the equals method of the class EpisodeTitle when the objects are different.
     */
    @Test
    void shouldReturnFalse_whenObjectsAreDifferent() {

        //Arrange
        String episodeTitle = "Episode 1";
        String episodeTitle2 = "Episode 2";

        //Act
        EpisodeTitle episodeTitle3 = new EpisodeTitle(episodeTitle);
        EpisodeTitle episodeTitle4 = new EpisodeTitle(episodeTitle2);

        //Assert
        assertFalse(episodeTitle3.equals(episodeTitle4));
    }

    /**
     * Test the equals method of the class EpisodeTitle when compraring with a new object.
     */
    @Test
    void shouldReturnFalse_whenComparingWithNewObject() {

        //Arrange
        String episodeTitle = "Episode 1";

        //Act
        EpisodeTitle episodeTitle2 = new EpisodeTitle(episodeTitle);

        boolean result = episodeTitle2.equals(new Object());

        //Assert
        assertFalse(result);
    }

    /**
     * Test the equals method of the class EpisodeTitle when the objects are the same.
     */
    @Test
    void shouldReturnTrue_whenComparingTwoEqualEpisodeTitle() {
        //Arrange
        String title = "Episode 1";
        EpisodeTitle episodeTitle1 = new EpisodeTitle(title);
        EpisodeTitle episodeTitle2 = new EpisodeTitle(title);

        //Act
        boolean result = episodeTitle1.equals(episodeTitle2);

        //Assert
        assertTrue(result);
    }

    /**
     * Test the hashcode method
     */
    @Test
    void shouldReturnHashCode_whenHashCodeIsCalled() {
        //Arrange
        String title = "Episode 1";
        EpisodeTitle episodeTitle = new EpisodeTitle(title);

        int expected = episodeTitle.hashCode();

        //Act
        int result = episodeTitle.hashCode();

        //Assert
        assertEquals(expected, result);
    }
}
