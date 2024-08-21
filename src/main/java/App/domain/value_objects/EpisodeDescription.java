package App.domain.value_objects;

public class EpisodeDescription {

    private String description;

    /**
     * Constructor
     *
     * @param description episode description
     */
    public EpisodeDescription(String description) {
        validateDescription(description);
    }

    /**
     * Validates the episode description
     *
     * @param description episode description
     */
    private void validateDescription(String description) {
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("The value of 'description' should not be null or empty.");
        }
        this.description = description;
    }

    /**
     * Getter for episode description
     *
     * @return episode description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Equals method for EpisodeDescription
     *
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof EpisodeDescription objectEpisodeDescription) {
            return this.description.equals(objectEpisodeDescription.description);
        }
        return false;
    }

    /**
     * HashCode method for EpisodeDescription
     *
     * @return the hashcode as an int
     */
    @Override
    public int hashCode() {
        return description.hashCode();
    }
}
