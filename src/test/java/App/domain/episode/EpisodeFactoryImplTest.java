package App.domain.episode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class EpisodeFactoryImplTest {

    @Test
    void shouldCreateEpisode_whenHasValidParameters() {
        //Arrange
        EpisodeFactoryImpl episodeFactory = new EpisodeFactoryImpl();
        //Act
        Episode episode = episodeFactory.createEpisode(1, 1, "Pilot", "The first episode", null, null);
        //Assert
        assertNotNull(episode);
    }

}
