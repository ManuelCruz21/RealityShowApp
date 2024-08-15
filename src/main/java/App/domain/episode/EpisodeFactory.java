package App.domain.episode;

import App.domain.season.Season;

import java.util.Date;

public interface EpisodeFactory {

    /**
     * Creates an Episode object
     * @param id
     * @param episodeNumber
     * @param title
     * @param description
     * @param airdate
     * @param season
     * @return Episode
     */
    Episode createEpisode(int id, int episodeNumber, String title, String description, Date airdate, Season season);

}
