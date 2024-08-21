package App.domain.season;

import App.domain.episode.Episode;
import App.domain.reality_show.RealityShow;
import App.domain.value_objects.SeasonID;

import java.util.List;


public class Season {

    private SeasonID id;
    private int seasonNumber;
    private List<Episode> episodes;
    private RealityShow realityShow;

    public Season(SeasonID id, int seasonNumber, List<Episode> episodes, RealityShow realityShow) {
        this.id = id;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
        this.realityShow = realityShow;
    }
}
