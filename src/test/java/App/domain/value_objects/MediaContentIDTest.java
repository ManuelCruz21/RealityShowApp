package App.domain.value_objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MediaContentIDTest {

    /**
     * Should Instantiate MediaContentID
     */
    @Test
    void shouldInstantiateMediaContentID_whenHasValidParameters() {
        //Arrange
        String id = "ABCD";

        //Act
        MediaContentID mediaContentID = new MediaContentID(id);

        //Assert
        assertNotNull(mediaContentID);
    }

    /**
     * Tests if the exception is thrown with a null mediaContentID
     */
    @Test
    void shouldThrowException_whenMediaContentIdIsNull() {
        //Arrange
        String mediaContentID = null;
        String expectedMessage = "The value of 'mediaContentID' should not be negative.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new MediaContentID(mediaContentID));

        //Assert
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Tests if the exception is thrown with a blank mediaContentID
     */
    @Test
    void shouldThrowException_whenMediaContentIdIsBlank() {
        //Arrange
        String mediaContentID = " ";
        String expectedMessage = "The value of 'mediaContentID' should not be negative.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new MediaContentID(mediaContentID));

        //Assert
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Should return the ID
     */
    @Test
    void shouldReturnID_whenGetIDIsCalled() {
        //Arrange
        String id = "ABCD";
        MediaContentID mediaContentID = new MediaContentID(id);

        //Act
        String result = mediaContentID.getID();

        //Assert
        assertEquals(id, result);
    }

    /**
     * Should return true when the comparing to itself
     */
    @Test
    void shouldReturnTrue_whenSameObjectIsCompared() {
        //Arrange
        String id = "ABCD";
        MediaContentID mediaContentID = new MediaContentID(id);

        //Act
        boolean result = mediaContentID.equals(mediaContentID);

        //Assert
        assertTrue(result);
    }

    /**
     * Should return true when comparing two equal MediaContentID
     */
    @Test
    void shouldReturnTrue_whenComparingTwoEqualMediaContentID() {
        //Arrange
        String id = "ABCD";
        MediaContentID mediaContentID1 = new MediaContentID(id);
        MediaContentID mediaContentID2 = new MediaContentID(id);

        //Act
        boolean result = mediaContentID1.equals(mediaContentID2);

        //Assert
        assertTrue(result);
    }

    /**
     * Should return false when comparing two different MediaContentID
     */
    @Test
    void shouldReturnFalse_whenComparingTwoDifferentMediaContentID() {
        //Arrange
        String id1 = "ABCD";
        String id2 = "EFGH";
        MediaContentID mediaContentID1 = new MediaContentID(id1);
        MediaContentID mediaContentID2 = new MediaContentID(id2);

        //Act
        boolean result = mediaContentID1.equals(mediaContentID2);

        //Assert
        assertFalse(result);
    }

    /**
     * Should return false when comparing two different objects
     */
    @Test
    void shouldReturnFalse_whenComparingDifferentObjects() {
        //Arrange
        String id = "ABCD";
        MediaContentID mediaContentID = new MediaContentID(id);

        //Act
        boolean result = mediaContentID.equals(new Object());

        //Assert
        assertFalse(result);
    }

    /**
     * Should return the hascode as an int
     */
    @Test
    void shouldReturnHashCode_whenGetHashCodeIsCalled() {
        //Arrange
        String id = "ABCD";
        MediaContentID mediaContentID = new MediaContentID(id);

        //Act
        int result = mediaContentID.hashCode();

        //Assert
        assertEquals(id.hashCode(), result);
    }


    /**
     * Should return MediaContentID as a string
     */
    @Test
    void shouldReturnMediaContentID_whenToStringIsCalled() {
        //Arrange
        String id = "ABCD";
        MediaContentID mediaContentID = new MediaContentID(id);

        //Act
        String result = mediaContentID.toString();

        //Assert
        assertEquals(id, result);
    }

}
