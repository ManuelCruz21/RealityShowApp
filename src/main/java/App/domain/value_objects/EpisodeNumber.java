package App.domain.value_objects;

public class EpisodeNumber {

    private int episodeNumber;

    /**
     * Constructor
     *
     * @param episodeNumber episode number
     */
    public EpisodeNumber(int episodeNumber) {
       validateEpisodeNumber(episodeNumber);
    }

    /**
     * Validates the episode number
     *
     * @param episodeNumber episode number
     */
    private void validateEpisodeNumber(int episodeNumber) {
        if (episodeNumber < 0) {
            throw new IllegalArgumentException("The value of 'episodeNumber' should not be negative.");
        }
        this.episodeNumber = episodeNumber;
    }


    /**
     * Getter for episode number
     *
     * @return episode number
     */
    public int getEpisodeNumber() {
        return episodeNumber;
    }

    /**
     * Equals method for EpisodeNumber
     *
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof EpisodeNumber objectEpisodeNumber) {
            return this.episodeNumber == objectEpisodeNumber.episodeNumber;
        }
        return false;
    }

    /**
     * HashCode method for EpisodeNumber
     *
     * @return the hashcode as an int
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(episodeNumber);
    }

    /**
     * Returns a string representation of the episode number
     *
     * @return string
     */
    @Override
    public String toString() {
        return "EpisodeNumber:" +
                "episodeNumber=" + episodeNumber;
    }
}
