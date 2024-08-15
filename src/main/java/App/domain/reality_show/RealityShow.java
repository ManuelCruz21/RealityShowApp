package App.domain.reality_show;

import App.domain.season.Season;

import java.util.Date;
import java.util.List;

public class RealityShow {

    private int id;
    private String title;
    private String description;
    private String genre;
    private Date releaseDate;
    private List <Season> seasons;
    private String imageURL;
    private String status;


    public RealityShow (int id, String title, String description, String genre, Date releaseDate, List<Season> seasons,String imageURL, String status){

        this.id = id;
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.seasons = seasons;
        this.imageURL = imageURL;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getStatus() {
        return status;
    }


}
