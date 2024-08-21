package App.domain.episode;

import App.domain.value_objects.*;
import App.utils.Validator;

import java.util.Date;
import java.util.UUID;

public class Episode {

    private EpisodeID id;
    private EpisodeNumber episodeNumber;
    private EpisodeTitle title;
    private EpisodeDescription description;
    private Date airdate;
    private SeasonID seasonID;


    /**
     * Constructor for Episode
     *
     * @param episodeNumber episode number
     * @param title         title
     * @param description   description
     * @param airdate       airdate
     * @param seasonID      season
     */

    Episode(EpisodeNumber episodeNumber, EpisodeTitle title, EpisodeDescription description, Date airdate, SeasonID seasonID) {

        generateID();
        Validator.validateNotNull(episodeNumber, "Episode number");
        Validator.validateNotNull(title, "Title");
        Validator.validateNotNull(description, "Description");
        Validator.validateNotNull(airdate, "Airdate");
        Validator.validateNotNull(seasonID, "Season");
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.description = description;
        this.airdate = airdate;
        this.seasonID = seasonID;

    }

    Episode(EpisodeID episodeID, EpisodeNumber episodeNumber, EpisodeTitle title, EpisodeDescription description, Date airdate, SeasonID seasonID) {

        Validator.validateNotNull(episodeID, "Episode ID");
        Validator.validateNotNull(episodeNumber, "Episode number");
        Validator.validateNotNull(title, "Title");
        Validator.validateNotNull(description, "Description");
        Validator.validateNotNull(airdate, "Airdate");
        Validator.validateNotNull(seasonID, "Season");
        this.id = episodeID;
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.description = description;
        this.airdate = airdate;
        this.seasonID = seasonID;

    }


    /**
     * Generates a unique identifier for the House instance.
     */
    private void generateID() {
        id = new EpisodeID(UUID.randomUUID().toString());
    }

    /**
     * Get the id of the episode
     *
     * @return id
     */
    public EpisodeID getId() {
        return id;
    }

    /**
     * Get the title of the episode
     *
     * @return title
     */
    public EpisodeNumber getEpisodeNumber() {
        return episodeNumber;
    }

    /**
     * Get the title of the episode
     *
     * @return title
     */
    public EpisodeTitle getTitle() {
        return title;
    }

    /**
     * Get the description of the episode
     *
     * @return description
     */
    public EpisodeDescription getDescription() {
        return description;
    }

    /**
     * Get the airdate of the episode
     *
     * @return airdate
     */
    public Date getAirdate() {
        return airdate;
    }

    /**
     * Get the season of the episode
     *
     * @return season
     */
    public SeasonID getSeasonID() {
        return seasonID;
    }

    /**
     * Returns a string representation of the episode
     *
     * @return string
     */
    public String toString() {
        return "Episode:" +
                "id=" + id +
                ", episodeNumber=" + episodeNumber +
                ", title=" + title +
                ", description=" + description +
                ", airdate=" + airdate +
                ", seasonID=" + seasonID;
    }

    /**
     * Equals method for Episode
     *
     * @param o Object
     * @return boolean
     */
    public boolean equals(Object o) {
        if (o instanceof Episode houseObject) {
            return id.equals(houseObject.id);
        }
        return false;
    }

    /**
     * HashCode method for Episode
     *
     * @return the hashcode as an int
     */
    public int hashCode() {
        return id.hashCode();
    }
}
