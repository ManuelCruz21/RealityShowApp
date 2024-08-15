package App.domain.episode;

import App.domain.season.Season;

import java.util.Date;

public class Episode {

    private int id;
    private int episodeNumber;
    private String title;
    private String description;
    private Date airdate;
    private Season season;


    /**
     * Constructor for Episode
     * @param id id
     * @param episodeNumber episode number
     * @param title title
     * @param description description
     * @param airdate airdate
     * @param season season
     */

    Episode(int id, int episodeNumber, String title, String description, Date airdate, Season season) {

        this.id = id;
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.description = description;
        this.airdate = airdate;
        this.season = season;

    }

    /**
     * Get the id of the episode
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Get the title of the episode
     * @return title
     */
    public int getEpisodeNumber() {
        return episodeNumber;
    }

    /**
     * Get the title of the episode
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get the description of the episode
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the airdate of the episode
     * @return airdate
     */
    public Date getAirdate() {
        return airdate;
    }

    /**
     * Get the season of the episode
     * @return season
     */
    public Season getSeason() {
        return season;
    }

    /**
     * Returns a string representation of the episode
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
}
