package App.domain.value_objects;

public class MediaContentURL {

    private String url;

    /**
     * Constructor
     *
     * @param url media content URL
     */
    public MediaContentURL(String url) {
        validateURL(url);
    }

    /**
     * Validates the URL
     *
     * @param url media content URL
     */
    private void validateURL(String url) {
        if (url == null || url.isBlank()) {
            throw new IllegalArgumentException("The value of 'url' should not be null.");
        }
        this.url = url;
    }

    /**
     * Getter for URL
     *
     * @return url
     */
    public String getURL() {
        return url;
    }

    /**
     * Equals method for MediaContentURL
     *
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof MediaContentURL objectMediaContentURL) {
            return this.url.equals(objectMediaContentURL.url);
        }
        return false;
    }

    /**
     * HashCode method for MediaContentURL
     *
     * @return the hashcode as an int
     */
    public int hashCode() {
        return url.hashCode();
    }

    /**
     * toString method for MediaContentURL
     *
     * @return the URL as a string
     */
    @Override
    public String toString() {
        return url;
    }
}
