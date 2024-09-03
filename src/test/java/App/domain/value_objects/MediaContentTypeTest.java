package App.domain.value_objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MediaContentTypeTest {

    /**
     * Should Instantiate MediaContentType
     */
    @Test
    void shouldInstantiateMediaContentType_whenHasValidParameters() {
        //Arrange
        String type = "VIDEO";

        //Act
        MediaContentType mediaContentType = new MediaContentType(type);

        //Assert
        assertNotNull(mediaContentType);
    }

    /**
     * Tests if the exception is thrown with a null mediaContentType
     */
    @Test
    void shouldThrowException_whenMediaContentTypeIsNull() {
        //Arrange
        String mediaContentType = null;
        String expectedMessage = "The value of 'type' should not be null or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new MediaContentType(mediaContentType));

        //Assert
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Tests if the exception is thrown with a blank mediaContentType
     */
    @Test
    void shouldThrowException_whenMediaContentTypeIsBlank() {
        //Arrange
        String mediaContentType = " ";
        String expectedMessage = "The value of 'type' should not be null or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new MediaContentType(mediaContentType));

        //Assert
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Should return the type of the media content
     */
    @Test
    void shouldReturnTheType_whenGetTypeIsCalled() {
        //Arrange
        String type = "VIDEO";
        MediaContentType mediaContentType = new MediaContentType(type);

        //Act
        String result = mediaContentType.getType();

        //Assert
        assertEquals(type, result);
    }

    /**
     * Should return true when the comparing to itself
     */
    @Test
    void shouldReturnTrue_whenComparingToItself() {
        //Arrange
        String type = "VIDEO";
        MediaContentType mediaContentType = new MediaContentType(type);

        //Act
        boolean result = mediaContentType.equals(mediaContentType);

        //Assert
        assertTrue(result);
    }

    /**
     * Should return true when comparing two equal MediaContentType
     */
    @Test
    void shouldReturnTrue_whenComparingTwoEqualMediaContentType() {
        //Arrange
        String type = "VIDEO";
        MediaContentType mediaContentType1 = new MediaContentType(type);
        MediaContentType mediaContentType2 = new MediaContentType(type);

        //Act
        boolean result = mediaContentType1.equals(mediaContentType2);

        //Assert
        assertTrue(result);
    }

    /**
     * Should return false when comparing two different MediaContentType
     */
    @Test
    void shouldReturnFalse_whenComparingTwoDifferentMediaContentType() {
        //Arrange
        String type1 = "VIDEO";
        String type2 = "AUDIO";
        MediaContentType mediaContentType1 = new MediaContentType(type1);
        MediaContentType mediaContentType2 = new MediaContentType(type2);

        //Act
        boolean result = mediaContentType1.equals(mediaContentType2);

        //Assert
        assertFalse(result);
    }

    /**
     * Should return false when comparing two different objects
     */
    @Test
    void shouldReturnFalse_whenComparingTwoDifferentObjects() {
        //Arrange
        String type = "VIDEO";
        MediaContentType mediaContentType = new MediaContentType(type);

        //Act
        boolean result = mediaContentType.equals(new Object());

        //Assert
        assertFalse(result);
    }


    /**
     * Should return the hascode as an int
     */
    @Test
    void shouldReturnHashCode_whenHashCodeIsCalled() {
        //Arrange
        String type = "VIDEO";
        MediaContentType mediaContentType = new MediaContentType(type);

        //Act
        int result = mediaContentType.hashCode();

        //Assert
        assertNotNull(result);
    }

    /**
     * Should return mediaContentType as a string
     */
    @Test
    void shouldReturnMediaContentType_whenToStringIsCalled() {
        //Arrange
        String type = "VIDEO";
        MediaContentType mediaContentType = new MediaContentType(type);

        //Act
        String result = mediaContentType.toString();

        //Assert
        assertNotNull(result);
    }
}
