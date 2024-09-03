package App.domain.value_objects;

public class MediaContentID {

    private final String id;

    /**
     * Constructor
     *
     * @param mediaContentID media content ID
     */
    public MediaContentID(String mediaContentID) {
        validateMediaContentID(mediaContentID);
        this.id = mediaContentID.trim();
    }

    /**
     * Validates the media content ID
     *
     * @param mediaContentID media content ID
     */
    private void validateMediaContentID(String mediaContentID) {
        if (mediaContentID == null || mediaContentID.isBlank()) {
            throw new IllegalArgumentException("The value of 'mediaContentID' should not be negative.");
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
     * Equals method for MediaContentID
     *
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof MediaContentID mediaContentID) {
            return this.id.equals(mediaContentID.id);
        }
        return false;
    }

    /**
     * HashCode method for MediaContentID
     *
     * @return the hashcode as an int
     */
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return id;
    }
}
