package App.domain.value_objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeasonIDTest {

    /**
     * Test the constructor of the class SeasonID.
     */
    @Test
    void shouldCreateSeasonID_whenSeasonIDIsValid() {

        //Arrange
        int seasonID = 1;

        //Act
        SeasonID seasonID2 = new SeasonID(seasonID);

        //Assert
        assertNotNull(seasonID2);
    }

    /**
     * Test the constructor of the class SeasonID when the season ID is negative.
     */
    @Test
    void shouldThrowIllegalArgumentException_whenSeasonIDIsNegative() {

        //Arrange
        int seasonID = -1;

        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> new SeasonID(seasonID), "The value of 'seasonID' should not be negative.");
    }

    /**
     * Test the getter of the class SeasonID.
     */
    @Test
    void shouldReturnID_whenGetIDIsCalled() {

        //Arrange
        int seasonID = 1;

        //Act
        SeasonID seasonID2 = new SeasonID(seasonID);

        int result = seasonID2.getID();

        //Assert
        assertEquals(seasonID, result);

    }


    /**
     * Test the equals method of the class SeasonID when compared with itself.
     */
    @Test
    void shouldReturnTrue_whenEqualsIsCalledWithItself() {

        //Arrange
        int seasonID = 1;

        //Act
        SeasonID seasonID2 = new SeasonID(seasonID);

        boolean result = seasonID2.equals(seasonID2);

        //Assert
        assertTrue(result);
    }

    /**
     * Test the equals method of the class SeasonID when compared with itself.
     */
    @Test
    void shouldReturnTrue_whenEqualsIsCalledWithSameObject() {

        //Arrange
        int seasonID = 1;

        //Act
        SeasonID seasonID2 = new SeasonID(seasonID);
        SeasonID seasonID3 = new SeasonID(seasonID);

        boolean result = seasonID2.equals(seasonID3);

        //Assert
        assertTrue(result);
    }

    /**
     * Test the equals method of the class SeasonID when the objects are different.
     */
    @Test
    void shouldReturnFalse_whenEqualsIsCalledWithDifferentObject() {

        //Arrange
        int seasonID = 1;
        int seasonIDdouble = 2;

        //Act
        SeasonID seasonID2 = new SeasonID(seasonID);
        SeasonID seasonID3 = new SeasonID(seasonIDdouble);

        boolean result = seasonID2.equals(seasonID3);

        //Assert
        assertFalse(result);
    }

    /**
     * Test the equals method of the class SeasonID when the object is null.
     */
    @Test
    void shouldReturnFalse_whenEqualsIsCalledWithNull() {

        //Arrange
        int seasonID = 1;

        //Act
        SeasonID seasonID2 = new SeasonID(seasonID);

        boolean result = seasonID2.equals(null);

        //Assert
        assertFalse(result);
    }

    /**
     * Test the equals method of the class SeasonID when comparing with a new object.
     */
    @Test
    void shouldReturnFalse_whenEqualsIsCalledWithNewObject() {

        //Arrange
        int seasonID = 1;

        //Act
        SeasonID seasonID2 = new SeasonID(seasonID);
        Object object = new Object();

        boolean result = seasonID2.equals(object);

        //Assert
        assertFalse(result);
    }

    /**
     * Test the hashCode method of the class SeasonID.
     */
    @Test
    void shouldReturnHashCode_whenHashCodeIsCalled() {

        //Arrange
        int seasonID = 1;

        //Act
        SeasonID seasonID2 = new SeasonID(seasonID);

        int result = seasonID2.hashCode();

        //Assert
        assertEquals(seasonID, result);
    }

    /**
     * Test the hashCode method of the class SeasonID when the season ID is different.
     */
    @Test
    void shouldReturnDifferentHashCode_whenHashCodeIsCalledWithDifferentSeasonID() {

        //Arrange
        int seasonID = 1;

        //Act
        SeasonID seasonID2 = new SeasonID(seasonID);
        SeasonID seasonID3 = new SeasonID(2);

        int result = seasonID2.hashCode();
        int result2 = seasonID3.hashCode();

        //Assert
        assertNotEquals(result, result2);
    }


    /**
     * Test the toString method of the class SeasonID.
     */
    @Test
    void shouldReturnSeasonIDAsString_whenToStringIsCalled() {

        //Arrange
        int seasonID = 1;

        String expected = "SeasonID:" + seasonID;

        //Act
        SeasonID seasonID2 = new SeasonID(seasonID);

        String result = seasonID2.toString();

        //Assert
        assertEquals(expected, result);
    }


}
