package App.domain.episode;

import App.domain.season.Season;
import App.domain.value_objects.EpisodeID;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;

import static org.mockito.Mockito.*;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EpisodeTest {

    /**
     * Shoud Instantiate Valid Episode
     */
    @Test
    void shouldInstantiateEpisode_whenHasValidParameters() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = new Date();

        try (MockedConstruction<EpisodeID> episodeID = mockConstruction(EpisodeID.class)) {

            Episode episode = new Episode(
                    1,
                    "Pilot",
                    "The very first episode",
                    airdate,
                    doubleSeason
            );

            //Act + Assert
            assertNotNull(episode);
        }
    }

    /**
     * Should return id when getId is called.
     */
    @Test
    void shouldReturnId_whenGetIdIsCalled() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = new Date();


        try (MockedConstruction<EpisodeID> episodeID = mockConstruction(EpisodeID.class)) {
            Episode episode = new Episode(
                    1,
                    "Pilot",
                    "The very first episode",
                    airdate,
                    doubleSeason
            );

            EpisodeID expectedEpisodeID = episodeID.constructed().get(0);

            int instantiatedInstance = episodeID.constructed().size();

            //Act
            EpisodeID episodeIDReturned = episode.getId();

            //Assert
            assertEquals(expectedEpisodeID, episodeIDReturned);
            assertEquals(1, instantiatedInstance);
        }
    }

    /**
     * Should return episodeNumber when getEpisodeNumber is called.
     */
    @Test
    void shouldReturnEpisodeNumber_whenGetEpisodeNumberIsCalled() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = new Date();

        Episode episode = new Episode(
                1,
                "Pilot",
                "The very first episode",
                airdate,
                doubleSeason
        );

        int expected = 1;

        //Act
        int result = episode.getEpisodeNumber();

        //Assert
        assertEquals(expected, result);
    }

    /**
     * Should return title when getTitle is called.
     */
    @Test
    void shouldReturnTitle_whenGetTitleIsCalled() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = new Date();

        Episode episode = new Episode(
                1,
                "Pilot",
                "The very first episode",
                airdate,
                doubleSeason
        );

        String expected = "Pilot";

        //Act
        String result = episode.getTitle();

        //Assert
        assertEquals(expected, result);
    }

    /**
     * Should return description when getDescription is called.
     */
    @Test
    void shouldReturnDescription_whenGetDescriptionIsCalled() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = new Date();

        Episode episode = new Episode(
                1,
                "Pilot",
                "The very first episode",
                airdate,
                doubleSeason
        );

        String expected = "The very first episode";

        //Act
        String result = episode.getDescription();

        //Assert
        assertEquals(expected, result);
    }

    /**
     * Should return airdate when getAirdate is called.
     */
    @Test
    void shouldReturnAirdate_whenGetAirdateIsCalled() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = new Date();

        Episode episode = new Episode(
                1,
                "Pilot",
                "The very first episode",
                airdate,
                doubleSeason
        );

        //Act
        Date result = episode.getAirdate();

        //Assert
        assertEquals(airdate, result);
    }

    /**
     * Should return season when getSeason is called.
     */
    @Test
    void shouldReturnSeason_whenGetSeasonIsCalled() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = new Date();

        Episode episode = new Episode(
                1,
                "Pilot",
                "The very first episode",
                airdate,
                doubleSeason
        );

        //Act
        Season result = episode.getSeason();

        //Assert
        assertEquals(doubleSeason, result);
    }

    /**
     * Should return Episode in string format when toString is called.
     */
    @Test
    void shouldReturnEpisodeInStringFormat_whenToStringIsCalled() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = new Date();

        try (MockedConstruction<EpisodeID> episodeID = mockConstruction(EpisodeID.class)) {

            Episode episode = new Episode(
                    1,
                    "Pilot",
                    "The very first episode",
                    airdate,
                    doubleSeason
            );

            EpisodeID episodeIDDouble = episodeID.constructed().get(0);


            String expected = "Episode:" +
                    "id=" + episodeIDDouble +
                    ", episodeNumber=" + 1 +
                    ", title=" + "Pilot" +
                    ", description=" + "The very first episode" +
                    ", airdate=" + airdate +
                    ", season=" + doubleSeason;

            //Act
            String result = episode.toString();

            //Assert
            assertEquals(expected, result);
        }
    }


    /**
     * HashCode for entity is derived from his ID. To ensure that equals and hashCode are consistent
     * we must ensure that hashCode is derived from the same property as equals.
     */
    @Test
    void shouldReturnHashCodeLinkedToEpisodeID() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = new Date();

        try (MockedConstruction<EpisodeID> episodeID = mockConstruction(EpisodeID.class)) {

            Episode episode = new Episode(
                    1,
                    "Pilot",
                    "The very first episode",
                    airdate,
                    doubleSeason
            );

            EpisodeID episodeIDDouble = episodeID.constructed().get(0);

            int expected = episodeIDDouble.hashCode();

            //Act
            int result = episode.hashCode();

            //Assert
            assertEquals(expected, result);
        }
    }

    /**
     * Should return true when comparing same house.
     */
    @Test
    void shouldReturnTrueWhenComparingTwoEqualEpisodes() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = new Date();
        EpisodeID episodeIDDouble = mock(EpisodeID.class);

        try (MockedConstruction<EpisodeID> episodeID = mockConstruction(EpisodeID.class)) {

            Episode episode = new Episode(episodeIDDouble,
                    1,
                    "Pilot",
                    "The very first episode",
                    airdate,
                    doubleSeason
            );

            Episode episode2 = new Episode(episodeIDDouble,
                    1,
                    "Pilot",
                    "The very first episode",
                    airdate,
                    doubleSeason
            );

            //Act
            boolean result = episode.equals(episode2);

            //Assert
            assertTrue(result);
        }
    }

    /**
     * Should return false when comparing different house.
     */
    @Test
    void shouldReturnFalseWhenComparingDifferentEpisodes() {
        //Arrange
        Season doubleSeason = mock(Season.class);
        Date airdate = new Date();

        try (MockedConstruction<EpisodeID> episodeID = mockConstruction(EpisodeID.class)) {

            Episode episode = new Episode(
                    1,
                    "Pilot",
                    "The very first episode",
                    airdate,
                    doubleSeason
            );

            Episode episode2 = new Episode(
                    2,
                    "Pilot",
                    "The very first episode",
                    airdate,
                    doubleSeason
            );

            //Act
            boolean result = episode.equals(episode2);

            //Assert
            assertFalse(result);
        }
    }


}
