package App.domain.value_objects;

public class EpisodeTitle {

    private String episodeTittle;

    /**
     * Constructor
     *
     * @param episodeTittle episode tittle
     */
    public EpisodeTitle(String episodeTittle) {
        validateEpisodeTittle(episodeTittle);
    }

    /**
     * Validates the episode tittle
     *
     * @param episodeTittle episode tittle
     */
    private void validateEpisodeTittle(String episodeTittle) {
        if (episodeTittle == null) {
            throw new IllegalArgumentException("The value of 'episodeTittle' should not be null.");
        }
        this.episodeTittle = episodeTittle;
    }

    /**
     * Getter for episode tittle
     *
     * @return episode tittle
     */
    public String getEpisodeTittle() {
        return episodeTittle;
    }

    /**
     * Equals method for EpisodeTittle
     *
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof EpisodeTitle objectEpisodeTitle) {
            return this.episodeTittle.equals(objectEpisodeTitle.episodeTittle);
        }
        return false;
    }

    /**
     * HashCode method for EpisodeTittle
     *
     * @return the hashcode as an int
     */
    public int hashCode() {
        return episodeTittle.hashCode();
    }


}
