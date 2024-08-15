package App.domain.episode;

import App.domain.season.Season;

import java.util.Date;

public class EpisodeFactoryImpl implements EpisodeFactory {

    @Override
    public Episode createEpisode(int id, int episodeNumber, String title, String description, Date airdate, Season season) {
        return  new Episode(id, episodeNumber, title, description, airdate, season);
    }
}
