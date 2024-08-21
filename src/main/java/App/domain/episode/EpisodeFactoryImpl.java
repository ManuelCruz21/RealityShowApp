package App.domain.episode;

import App.domain.season.Season;
import App.domain.value_objects.*;

import java.util.Date;

public class EpisodeFactoryImpl implements EpisodeFactory {

    @Override
    public Episode createEpisode(EpisodeNumber episodeNumber, EpisodeTitle title, EpisodeDescription description, Date airdate, SeasonID season) throws IllegalArgumentException {
        return new Episode(episodeNumber, title, description, airdate, season);
    }

    public Episode createEpisode(EpisodeID episodeID, EpisodeNumber episodeNumber, EpisodeTitle title, EpisodeDescription description, Date airdate, SeasonID season) {
        return new Episode(episodeID, episodeNumber, title, description, airdate, season);
    }
}
