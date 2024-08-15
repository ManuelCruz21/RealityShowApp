package App.domain.value_objects;

public class EpisodeID {

    private final String id;

    /**
     * Constructor
     *
     * @param episodeID episode ID
     */
    public EpisodeID(String episodeID) {
        validateID(episodeID);
        this.id = episodeID.trim();
    }

    /**
     * Getter for ID
     *
     * @param epsiodeID episode ID
     */
    private void validateID(String epsiodeID) {
        if (epsiodeID == null || epsiodeID.isBlank()) {
            throw new IllegalArgumentException("The value of 'episodeID' should not be null, blank, or empty.");
        }
    }

    /**
     * Getter for ID
     *
     * @return id
     */
    public String getID() {
        return id;
    }


    /**
     * Equals method for EpisodeID
     *
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof EpisodeID episodeId) {

            return this.id.equals(episodeId.id);
        }
        return false;
    }

    /**
     * HashCode method for EpisodeID
     *
     * @return the hashcode as an int
     */
    public int hashCode() {
        return id.hashCode();
    }

    /**
     * toString method for EpisodeID
     *
     * @return the HouseID as a string
     */
    @Override
    public String toString() {
        return id;
    }


}

