package App.domain.value_objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpisodeIDTest {

    /**
     * Should Instantiate EpisodeID
     */
    @Test
    void shouldInstantiateEpisodeID_whenHasValidParameters() {
        //Arrange
        String id = "ABCD";

        //Act
        EpisodeID episodeID = new EpisodeID(id);

        //Assert
        assertNotNull(episodeID);
    }


    /**
     * Tests if the exception is thrown with a null episodeID
     */
    @Test
    void shouldThrowException_whenEpisodeIdIsNull() {
        //Arrange
        String episodeID = null;
        String expectedMessage = "The value of 'episodeID' should not be null, blank, or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new EpisodeID(episodeID));

        //Assert
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


    /**
     * Tests if the exception is thrown with a blank episodeID
     */
    @Test
    void shouldThrowException_whenEpisodeIdIsBlank() {
        //Arrange
        String episodeID = " ";
        String expectedMessage = "The value of 'episodeID' should not be null, blank, or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new EpisodeID(episodeID));

        //Assert
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Should return id when getId is called.
     */
    @Test
    void shouldReturnId_whenGetIdIsCalled() {
        //Arrange
        String id = "ABCD";
        EpisodeID episodeID = new EpisodeID(id);

        //Act
        String result = episodeID.getID();

        //Assert
        assertEquals(id, result);
    }

    /**
     * Should return true when comparing two equal EpisodeID
     */
    @Test
    void shouldReturnTrue_whenComparingTwoEqualEpisodeID() {
        //Arrange
        String id = "ABCD";
        EpisodeID episodeID1 = new EpisodeID(id);
        EpisodeID episodeID2 = new EpisodeID(id);

        //Act
        boolean result = episodeID1.equals(episodeID2);

        //Assert
        assertTrue(result);
    }

    /**
     * Should return false when comparing two different EpisodeID
     */
    @Test
    void shouldReturnFalse_whenComparingTwoDifferentEpisodeID() {
        //Arrange
        String id1 = "ABCD";
        String id2 = "EFGH";
        EpisodeID episodeID1 = new EpisodeID(id1);
        EpisodeID episodeID2 = new EpisodeID(id2);

        //Act
        boolean result = episodeID1.equals(episodeID2);

        //Assert
        assertFalse(result);
    }

    /**
     * Should return true when comparing to itself
     */
    @Test
    void shouldReturnTrue_whenComparingTheSameEpisodeID() {
        //Arrange
        String id = "ABCD";
        EpisodeID episodeID = new EpisodeID(id);

        //Act
        boolean result = episodeID.equals(episodeID);

        //Assert
        assertTrue(result);
    }

    /**
     * Tests if equals method returns false when the object is not an instance of EpisodeID
     */
    @Test
    void shouldReturnFalse_whenObjectIsNotInstanceOfHouseID() {
        // Arrange
        String idDescription = "HXPTO";
        EpisodeID episodeID = new EpisodeID(idDescription);

        // Act
        boolean result = episodeID.equals(new Object());

        // Assert
        assertFalse(result);
    }

    /**
     * Should return the hashcode as an int
     */
    @Test
    void shouldReturnHashCode_whenHashCodeIsCalled() {
        //Arrange
        String id = "ABCD";
        EpisodeID episodeID = new EpisodeID(id);
        int expected = episodeID.hashCode();

        //Act
        int result = episodeID.hashCode();

        //Assert
        assertEquals(expected, result);
    }


    /**
     * Should return EpisodeIDAsString
     */
    @Test
    void shouldReturnEpisodeIDAsString_whenToStringIsCalled() {
        //Arrange
        String id = "ABCD";
        EpisodeID episodeID = new EpisodeID(id);
        String expected = id;

        //Act
        String result = episodeID.toString();

        //Assert
        assertEquals(expected, result);
    }





}
