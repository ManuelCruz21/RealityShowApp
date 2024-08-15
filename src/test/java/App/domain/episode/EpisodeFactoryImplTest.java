package App.domain.episode;

import App.domain.season.Season;
import App.domain.value_objects.EpisodeID;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

class EpisodeFactoryImplTest {

    /**
     * Should create Episode when has valid parameters.
     */
    @Test
    void shouldCreateEpisode_whenHasValidParameters() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = new Date();

        EpisodeFactoryImpl episodeFactory = new EpisodeFactoryImpl();

        //Act
        Episode episode = episodeFactory.createEpisode(1, "Pilot", "The first episode", airdate, doubleSeason);

        //Assert
        assertNotNull(episode);

    }

    /**
     * Should create Episode when has valid parameters and EpisodeID.
     */
    @Test
    void shouldCreateEpisode_WhenCreateEpisodeIsCalledWithValidParametersAndEpisodeID() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = new Date();
        EpisodeID doubleEpisodeID = mock(EpisodeID.class);

        EpisodeFactoryImpl episodeFactory = new EpisodeFactoryImpl();

        //Act
        Episode episode = episodeFactory.createEpisode(doubleEpisodeID, 1, "Pilot", "The first episode", airdate, doubleSeason);

        //Assert
        assertNotNull(episode);

    }

    /**
     * Test to ensure that an IllegalArgumentException is thrown when
     * Episode is called with a null Address parameter.
     * This test confirms the robustness of the factory's parameter validation.
     */
    @Test
    void shouldThrowIllegalArgumentException_whenCreateEpisodeIsCalledWithNullSeason() {
        //Arrange
        Season doubleSeason = null;
        Date airdate = new Date();

        EpisodeFactoryImpl episodeFactory = new EpisodeFactoryImpl();

        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> episodeFactory.createEpisode(1, "Pilot", "The first episode", airdate, doubleSeason),
                "Factory should throw IllegalArgumentException for null Season.");
    }

    /**
     * Test to ensure that an IllegalArgumentException is thrown when
     * Episode is called with a null Date parameter.
     * This test confirms the robustness of the factory's parameter validation.
     */
    @Test
    void shouldThrowIllegalArgumentException_whenCreateEpisodeIsCalledWithNullAirdate() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = null;

        EpisodeFactoryImpl episodeFactory = new EpisodeFactoryImpl();

        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> episodeFactory.createEpisode(1, "Pilot", "The first episode", airdate, doubleSeason),
                "Factory should throw IllegalArgumentException for null Airdate.");
    }

}
