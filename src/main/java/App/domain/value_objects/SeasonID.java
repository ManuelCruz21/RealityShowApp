package App.domain.value_objects;

public class SeasonID {

    private final int id;

    /**
     * Constructor
     *
     * @param seasonID season ID
     */
    public SeasonID(int seasonID) {
        validateSeasonID(seasonID);
        this.id = seasonID;
    }

    /**
     * Validates the season ID
     *
     * @param seasonID season ID
     */
    private void validateSeasonID(int seasonID) {
        if (seasonID < 0) {
            throw new IllegalArgumentException("The value of 'seasonID' should not be negative.");
        }
    }


    /**
     * Getter for ID
     *
     * @return id
     */
    public int getID() {
        return id;
    }


    /**
     * Equals method for SeasonID
     *
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof SeasonID objectSeasonID) {
            return this.id == objectSeasonID.id;
        }
        return false;
    }

    /**
     * HashCode method for SeasonID
     *
     * @return the hashcode as an int
     */

    public int hashCode() {
        return id;
    }

    /**
     * toString method for SeasonID
     *
     * @return the season ID as a string
     */
    @Override
    public String toString() {
        return "SeasonID:" + id;
    }
}
