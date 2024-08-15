package App.domain.episode;

import App.domain.season.Season;
import App.domain.value_objects.EpisodeID;

import java.util.Date;

public interface EpisodeFactory {

    /**
     * Creates an Episode object
     * @param episodeNumber episode number
     * @param title title
     * @param description description
     * @param airdate airdate
     * @param season season
     * @return Episode
     */
    Episode createEpisode(int episodeNumber, String title, String description, Date airdate, Season season);

}
