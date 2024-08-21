package App.domain.value_objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EpisodeDescriptionTest {

    /**
     * Test for the constructor
     */
    @Test
    void shouldCreateEpisodeDescription_whenDescriptionIsValid() {

        //Arrange
        String description = "This is a description";

        //Act
        EpisodeDescription episodeDescription = new EpisodeDescription(description);

        //Assert
        assertNotNull(episodeDescription);
    }

    /**
     * Test for the constructor when the description is null
     */
    @Test
    void shouldThrowIllegalArgumentException_whenDescriptionIsNull() {

        //Arrange
        String description = null;

        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> new EpisodeDescription(description));
    }

    /**
     * Test for the constructor when the description is empty
     */
    @Test
    void shouldThrowIllegalArgumentException_whenDescriptionIsEmpty() {

        //Arrange
        String description = "";

        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> new EpisodeDescription(description));
    }

    /**
     * Test to get the description
     */
    @Test
    void shouldReturnDescription_whenGetDescriptionIsCalled() {

        //Arrange
        String description = "This is a description";
        EpisodeDescription episodeDescription = new EpisodeDescription(description);

        //Act
        String result = episodeDescription.getDescription();

        //Assert
        assertNotNull(result);
    }

    /**
     * Test for the equals method when the descriptions are equal
     */
    @Test
    void shouldReturnTrue_whenEpisodeDescriptionsAreEqual() {

        //Arrange
        String description = "This is a description";
        EpisodeDescription episodeDescription1 = new EpisodeDescription(description);
        EpisodeDescription episodeDescription2 = new EpisodeDescription(description);

        //Act
        boolean result = episodeDescription1.equals(episodeDescription2);

        //Assert
        assertNotNull(result);
    }

    /**
     * Test for the equals method when the descriptions are different
     */
    @Test
    void shouldReturnFalse_whenEpisodeDescriptionsAreDifferent() {

        //Arrange
        String description1 = "This is a description";
        String description2 = "This is another description";
        EpisodeDescription episodeDescription1 = new EpisodeDescription(description1);
        EpisodeDescription episodeDescription2 = new EpisodeDescription(description2);

        //Act
        boolean result = episodeDescription1.equals(episodeDescription2);

        //Assert
        assertNotNull(result);
    }

    /**
     * Test for the equals method when comparing to a new object
     */
    @Test
    void shouldReturnFalse_whenEpisodeDescriptionIsComparedToANewObject() {

        //Arrange
        String description = "This is a description";
        EpisodeDescription episodeDescription = new EpisodeDescription(description);

        //Act
        boolean result = episodeDescription.equals(new Object());

        //Assert
        assertNotNull(result);
    }

    /**
     * Test for the equals method when comparing to itself
     */
    @Test
    void shouldReturnTrue_whenEpisodeDescriptionIsComparedToItself() {

        //Arrange
        String description = "This is a description";
        EpisodeDescription episodeDescription = new EpisodeDescription(description);

        //Act
        boolean result = episodeDescription.equals(episodeDescription);

        //Assert
        assertNotNull(result);
    }


    /**
     * Test for the hashCode method
     */
    @Test
    void shouldReturnHashCode_whenHashCodeIsCalled() {

        //Arrange
        String description = "This is a description";
        EpisodeDescription episodeDescription = new EpisodeDescription(description);

        //Act
        int result = episodeDescription.hashCode();

        //Assert
        assertNotNull(result);
    }

    /**
     * Test for the toString method
     */
    @Test
    void shouldReturnString_whenToStringIsCalled() {

        //Arrange
        String description = "This is a description";
        EpisodeDescription episodeDescription = new EpisodeDescription(description);

        //Act
        String result = episodeDescription.toString();

        //Assert
        assertNotNull(result);
    }


}
