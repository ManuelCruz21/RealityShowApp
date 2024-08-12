package App.domain.Episode;

import App.domain.Season.Season;

import javax.xml.validation.Validator;
import java.util.Date;

public class Episode {

    private int id;
    private int episodeNumber;
    private String title;
    private String description;
    private Date airdate;
    private Season season;


    Episode(int id, int episodeNumber, String title, String description, Date airdate, Season season) {

        this.id = id;
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.description = description;
        this.airdate = airdate;
        this.season = season;

    }
}
