package App.domain.value_objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MediaContentURLTest {

    /**
     * Test the constructor
     */
    @Test
    void shouldInstantiateMediaContentURL_whenHasValidParameters() {
        //Arrange
        String url = "https://www.youtube.com/watch?v=1234";

        //Act
        MediaContentURL mediaContentURL = new MediaContentURL(url);

        //Assert
        assertNotNull(mediaContentURL);
    }

    /**
     * Test the constructor with null URL
     */
    @Test
    void shouldThrowException_whenURLIsNull() {
        //Arrange
        String url = null;
        String expectedMessage = "The value of 'url' should not be null.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new MediaContentURL(url));

        //Assert
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Test the constructor with blank URL
     */
    @Test
    void shouldThrowException_whenURLIsBlank() {
        //Arrange
        String url = " ";
        String expectedMessage = "The value of 'url' should not be null.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new MediaContentURL(url));

        //Assert
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Test the getter
     */
    @Test
    void shouldGetURL_whenHasValidURL() {
        //Arrange
        String url = "https://www.youtube.com/watch?v=1234";
        MediaContentURL mediaContentURL = new MediaContentURL(url);

        //Act
        String result = mediaContentURL.getURL();

        //Assert
        assertEquals(url, result);
    }

    /**
     * Test the equals method when comparing to itself
     */
    @Test
    void shouldReturnTrue_whenSameObjectIsCompared() {
        //Arrange
        String url = "https://www.youtube.com/watch?v=1234";
        MediaContentURL mediaContentURL = new MediaContentURL(url);

        //Act
        boolean result = mediaContentURL.equals(mediaContentURL);

        //Assert
        assertTrue(result);
    }

    /**
     * Test the equals method when comparing to an object with the same URL
     */
    @Test
    void shouldReturnTrue_whenComparedToObjectWithSameURL() {
        //Arrange
        String url = "https://www.youtube.com/watch?v=1234";
        MediaContentURL mediaContentURL = new MediaContentURL(url);
        MediaContentURL mediaContentURL2 = new MediaContentURL(url);

        //Act
        boolean result = mediaContentURL.equals(mediaContentURL2);

        //Assert
        assertTrue(result);
    }

    /**
     * Test the equals method when comparing to an object with a different URL
     */
    @Test
    void shouldReturnFalse_whenComparedToObjectWithDifferentURL() {
        //Arrange
        String url = "https://www.youtube.com/watch?v=1234";
        String url2 = "https://www.youtube.com/watch?v=5678";
        MediaContentURL mediaContentURL = new MediaContentURL(url);
        MediaContentURL mediaContentURL2 = new MediaContentURL(url2);

        //Act
        boolean result = mediaContentURL.equals(mediaContentURL2);

        //Assert
        assertFalse(result);
    }

    /**
     * Should return false when comparing two different objects
     */
    @Test
    void shouldReturnFalse_whenComparingTwoDifferentObjects() {
        //Arrange
        String url = "https://www.youtube.com/watch?v=1234";
        MediaContentURL mediaContentURL = new MediaContentURL(url);

        //Act
        boolean result = mediaContentURL.equals(new Object());

        //Assert
        assertFalse(result);
    }

    /**
     * Test the hashCode method
     */
    @Test
    void shouldReturnHashCode_whenGetHashCodeIsCalled() {
        //Arrange
        String url = "https://www.youtube.com/watch?v=1234";
        MediaContentURL mediaContentURL = new MediaContentURL(url);

        //Act
        int result = mediaContentURL.hashCode();

        //Assert
        assertEquals(url.hashCode(), result);
    }

    /**
     * Test the toString method
     */
    @Test
    void shouldReturnURL_whenToStringIsCalled() {
        //Arrange
        String url = "https://www.youtube.com/watch?v=1234";
        MediaContentURL mediaContentURL = new MediaContentURL(url);

        //Act
        String result = mediaContentURL.toString();

        //Assert
        assertEquals(url, result);
    }

}
