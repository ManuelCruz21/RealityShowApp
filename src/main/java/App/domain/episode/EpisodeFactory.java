package App.domain.episode;

import App.domain.value_objects.*;

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
    Episode createEpisode(EpisodeNumber episodeNumber, EpisodeTitle title, EpisodeDescription description, Date airdate, SeasonID season);

}
