package App.domain.episode;

import App.domain.season.Season;
import App.domain.value_objects.EpisodeID;
import App.utils.Validator;

import java.util.Date;
import java.util.UUID;

public class Episode {

    private EpisodeID id;
    private int episodeNumber;
    private String title;
    private String description;
    private Date airdate;
    private Season season;


    /**
     * Constructor for Episode
     *
     * @param episodeNumber episode number
     * @param title         title
     * @param description   description
     * @param airdate       airdate
     * @param season        season
     */

    Episode(int episodeNumber, String title, String description, Date airdate, Season season) {

        generateID();
        Validator.validateNotNull(episodeNumber, "Episode number");
        Validator.validateNotNull(title, "Title");
        Validator.validateNotNull(description, "Description");
        Validator.validateNotNull(airdate, "Airdate");
        Validator.validateNotNull(season, "Season");
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.description = description;
        this.airdate = airdate;
        this.season = season;

    }

    Episode(EpisodeID episodeID, int episodeNumber, String title, String description, Date airdate, Season season) {

        Validator.validateNotNull(episodeID, "Episode ID");
        Validator.validateNotNull(episodeNumber, "Episode number");
        Validator.validateNotNull(title, "Title");
        Validator.validateNotNull(description, "Description");
        Validator.validateNotNull(airdate, "Airdate");
        Validator.validateNotNull(season, "Season");
        this.id = episodeID;
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.description = description;
        this.airdate = airdate;
        this.season = season;

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
    public int getEpisodeNumber() {
        return episodeNumber;
    }

    /**
     * Get the title of the episode
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get the description of the episode
     *
     * @return description
     */
    public String getDescription() {
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
    public Season getSeason() {
        return season;
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
                ", season=" + season;
    }

    public boolean equals(Object o) {
        if (o instanceof Episode houseObject) {
            return id.equals(houseObject.id);
        }
        return false;
    }

    public int hashCode() {
        return id.hashCode();
    }
}
