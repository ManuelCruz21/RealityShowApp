package App.domain.value_objects;

public class MediaContentType {

    private String type;

    /**
     * Constructor
     *
     * @param type media content type
     */
    public MediaContentType(String type) {
        validateType(type);
    }

    /**
     * Validates the media content type
     *
     * @param type media content type
     */
    private void validateType(String type) {
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("The value of 'type' should not be null or empty.");
        }
        this.type = type;
    }

    /**
     * Getter for media content type
     *
     * @return media content type
     */
    public String getType() {
        return type;
    }

    /**
     * Equals method for MediaContentType
     *
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof MediaContentType objectMediaContentType) {
            return this.type.equals(objectMediaContentType.type);
        }
        return false;
    }

    /**
     * HashCode method for MediaContentType
     *
     * @return the hashcode as an int
     */
    public int hashCode() {
        return type.hashCode();
    }

    @Override
    public String toString() {
        return type;
    }
}
