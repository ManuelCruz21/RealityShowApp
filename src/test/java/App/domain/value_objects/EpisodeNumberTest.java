package App.domain.value_objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpisodeNumberTest {

    /**
     * Test for the constructor of EpisodeNumber
     */
    @Test
    void shouldInstantiateEpisodeNumber_whenHasValidParameters() {
        //Arrange
        int number = 1;

        EpisodeNumber episodeNumber = new EpisodeNumber(number);

        //Act + Assert
        assertNotNull(episodeNumber);
    }

    /**
     * Test for the constructor of EpisodeNumber with a negative number
     */
    @Test
    void shouldThrowException_whenEpisodeNumberIsNegative() {

        //Arrange
        int number = -1;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> new EpisodeNumber(number));

        String expectedMessage = "The value of 'episodeNumber' should not be negative.";
        String actualMessage = exception.getMessage();

        //Act + Assert
        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Test for the getEpisodeNumber method
     */
    @Test
    void shouldReturnEpisodeNumber_whenGetEpisodeNumberIsCalled() {

        //Arrange
        int number = 1;

        EpisodeNumber episodeNumber = new EpisodeNumber(number);

        //Act
        int result = episodeNumber.getEpisodeNumber();

        //Assert
        assertEquals(number, result);
    }

    /**
     * Test for the equals method of EpisodeNumber
     */
    @Test
    void shouldReturnTrue_whenEqualsIsCalledWithSameEpisodeNumber() {

        //Arrange
        int number = 1;

        EpisodeNumber episodeNumber = new EpisodeNumber(number);
        EpisodeNumber episodeNumber2 = new EpisodeNumber(number);

        //Act + Assert
        assertTrue(episodeNumber.equals(episodeNumber2));
    }

    /**
     * Test for the equals method of EpisodeNumber with different objects
     */
    @Test
    void shouldReturnFalse_whenEqualsIsCalledWithDifferentObject() {
        //Arrange
        int number = 1;

        EpisodeNumber episodeNumber = new EpisodeNumber(number);
        Object object = new Object();

        //Act + Assert
        assertNotEquals(episodeNumber, object);
    }

    /**
     * Test for the equals method of EpisodeNumber with different episode numbers
     */
    @Test
    void shouldReturnFalse_whenEqualsIsCalledWithDifferentEpisodeNumber() {
        //Arrange
        int number = 1;
        int number2 = 2;

        EpisodeNumber episodeNumber = new EpisodeNumber(number);
        EpisodeNumber episodeNumber2 = new EpisodeNumber(number2);

        //Act + Assert
        assertNotEquals(episodeNumber, episodeNumber2);
    }

    /**
     * Test for the hashCode method of EpisodeNumber
     */
    @Test
    void shouldReturnHashCode_whenHashCodeIsCalled() {
        //Arrange
        int number = 1;

        EpisodeNumber episodeNumber = new EpisodeNumber(number);
        EpisodeNumber episodeNumber2 = new EpisodeNumber(number);

        //Act + Assert
        assertEquals(episodeNumber.hashCode(), episodeNumber2.hashCode());
    }

    /**
     * Test for the toString method of EpisodeNumber
     */
    @Test
    void shouldReturnEpisodeNumberAsString_whenToStringIsCalled() {

        //Arrange
        int number = 1;

        EpisodeNumber episodeNumber = new EpisodeNumber(number);

        String expected = "EpisodeNumber:episodeNumber=1";

        //Act
        String result = episodeNumber.toString();

        //Assert
        assertEquals(expected, result);
    }

    /**
     * Test for the toString method of EpisodeNumber with a different number
     */
    @Test
    void shouldReturnEpisodeNumberAsString_whenToStringIsCalledWithDifferentNumber() {

        //Arrange
        int number = 2;

        EpisodeNumber episodeNumber = new EpisodeNumber(number);

        String expected = "EpisodeNumber:episodeNumber=2";

        //Act
        String result = episodeNumber.toString();

        //Assert
        assertEquals(expected, result);
    }

    /**
     * Test for the equals method of EpisodeNumber with the same object
     */
    @Test
    void shouldReturnTrue_whenEqualsIsCalledWithSameObject() {

        //Arrange
        int number = 1;

        EpisodeNumber episodeNumber = new EpisodeNumber(number);

        //Act + Assert
        assertTrue(episodeNumber.equals(episodeNumber));
    }

}
