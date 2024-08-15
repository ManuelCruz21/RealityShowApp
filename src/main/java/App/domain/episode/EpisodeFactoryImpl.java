package App.domain.episode;

import App.domain.season.Season;
import App.domain.value_objects.EpisodeID;

import java.util.Date;

public class EpisodeFactoryImpl implements EpisodeFactory {

    @Override
    public Episode createEpisode(int episodeNumber, String title, String description, Date airdate, Season season) throws IllegalArgumentException {
        return new Episode(episodeNumber, title, description, airdate, season);
    }

    public Episode createEpisode(EpisodeID episodeID, int episodeNumber, String title, String description, Date airdate, Season season) {
        return new Episode(episodeID, episodeNumber, title, description, airdate, season);
    }
}
