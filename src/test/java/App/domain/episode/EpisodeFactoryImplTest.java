package App.domain.episode;

import App.domain.season.Season;
import App.domain.value_objects.*;
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
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);
        EpisodeID doubleEpisodeID = mock(EpisodeID.class);

        EpisodeFactoryImpl episodeFactory = new EpisodeFactoryImpl();

        //Act
        Episode episode = episodeFactory.createEpisode(doubleEpisodeID,episodeNumber, title, description, airdate, seasonID);
        //Assert
        assertNotNull(episode);

    }

    /**
     * Should create Episode when has valid parameters and EpisodeID.
     */
    @Test
    void shouldCreateEpisode_WhenCreateEpisodeIsCalledWithValidParametersAndEpisodeID() {
        //Arrange
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);
        EpisodeID doubleEpisodeID = mock(EpisodeID.class);

        EpisodeFactoryImpl episodeFactory = new EpisodeFactoryImpl();

        //Act
        Episode episode = episodeFactory.createEpisode(doubleEpisodeID, episodeNumber, title, description, airdate, seasonID);
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
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = null;


        EpisodeFactoryImpl episodeFactory = new EpisodeFactoryImpl();

        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> episodeFactory.createEpisode(episodeNumber, title, description, airdate, seasonID),
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
        Date airdate = null;
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);

        EpisodeFactoryImpl episodeFactory = new EpisodeFactoryImpl();

        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> episodeFactory.createEpisode(episodeNumber, title, description, airdate, seasonID),
                "Factory should throw IllegalArgumentException for null Airdate.");
    }

}
