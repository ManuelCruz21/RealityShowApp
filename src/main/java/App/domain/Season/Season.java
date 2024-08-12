package App.domain.Season;

import App.domain.Episode.Episode;
import App.domain.RealityShow.RealityShow;

import java.util.List;


public class Season {

    private int id;
    private int seasonNumber;
    private List<Episode> episodes;
    private RealityShow realityShow;

    public Season(int id, int seasonNumber, List<Episode> episodes, RealityShow realityShow) {
        this.id = id;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
        this.realityShow = realityShow;
    }
}
