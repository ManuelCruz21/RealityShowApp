package App.domain.episode;

import App.domain.value_objects.*;
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
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);

        try (MockedConstruction<EpisodeID> episodeID = mockConstruction(EpisodeID.class)) {

            Episode episode = new Episode(episodeNumber, title, description, airdate, seasonID);


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
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);


        try (MockedConstruction<EpisodeID> episodeID = mockConstruction(EpisodeID.class)) {
            Episode episode = new Episode(
                    episodeNumber,
                    title,
                    description,
                    airdate,
                    seasonID
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
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);

        Episode episode = new Episode(
                episodeNumber,
                title,
                description,
                airdate,
                seasonID
        );


        //Act
        EpisodeNumber result = episode.getEpisodeNumber();

        //Assert
        assertEquals(episodeNumber, result);
    }

    /**
     * Should return title when getTitle is called.
     */
    @Test
    void shouldReturnTitle_whenGetTitleIsCalled() {
        //Arrange
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);

        Episode episode = new Episode(
                episodeNumber,
                title,
                description,
                airdate,
                seasonID
        );


        //Act
        EpisodeTitle result = episode.getTitle();

        //Assert
        assertEquals(title, result);
    }

    /**
     * Should return description when getDescription is called.
     */
    @Test
    void shouldReturnDescription_whenGetDescriptionIsCalled() {
        //Arrange
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);

        Episode episode = new Episode(
                episodeNumber,
                title,
                description,
                airdate,
                seasonID
        );


        //Act
        EpisodeDescription result = episode.getDescription();

        //Assert
        assertEquals(description, result);
    }

    /**
     * Should return airdate when getAirdate is called.
     */
    @Test
    void shouldReturnAirdate_whenGetAirdateIsCalled() {
        //Arrange
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);

        Episode episode = new Episode(
                episodeNumber,
                title,
                description,
                airdate,
                seasonID
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
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);

        Episode episode = new Episode(
                episodeNumber,
                title,
                description,
                airdate,
                seasonID
        );

        //Act
        SeasonID result = episode.getSeasonID();

        //Assert
        assertEquals(seasonID, result);
    }

    /**
     * Should return Episode in string format when toString is called.
     */
    @Test
    void shouldReturnEpisodeInStringFormat_whenToStringIsCalled() {
        //Arrange
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);

        try (MockedConstruction<EpisodeID> episodeID = mockConstruction(EpisodeID.class)) {

            Episode episode = new Episode(
                    episodeNumber,
                    title,
                    description,
                    airdate,
                    seasonID
            );

            EpisodeID episodeIDDouble = episodeID.constructed().get(0);


            String expected = "Episode:" +
                    "id=" + episodeIDDouble +
                    ", episodeNumber=" + episodeNumber +
                    ", title=" + title +
                    ", description=" + description +
                    ", airdate=" + airdate +
                    ", seasonID=" + seasonID;

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
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);

        try (MockedConstruction<EpisodeID> episodeID = mockConstruction(EpisodeID.class)) {

            Episode episode = new Episode(
                    episodeNumber,
                    title,
                    description,
                    airdate,
                    seasonID
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
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);
        EpisodeID episodeIDDouble = mock(EpisodeID.class);

        try (MockedConstruction<EpisodeID> episodeID = mockConstruction(EpisodeID.class)) {

            Episode episode = new Episode(episodeIDDouble,
                    episodeNumber,
                    title,
                    description,
                    airdate,
                    seasonID
            );

            Episode episode2 = new Episode(episodeIDDouble,
                    episodeNumber,
                    title,
                    description,
                    airdate,
                    seasonID
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
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);

        try (MockedConstruction<EpisodeID> episodeID = mockConstruction(EpisodeID.class)) {

            Episode episode = new Episode(
                    episodeNumber,
                    title,
                    description,
                    airdate,
                    seasonID
            );

            Episode episode2 = new Episode(
                    episodeNumber,
                    title,
                    description,
                    airdate,
                    seasonID
            );

            //Act
            boolean result = episode.equals(episode2);

            //Assert
            assertFalse(result);
        }
    }


    /**
     * Should return false when comparing with null.
     */
    @Test
    void shouldReturnFalse_whenComparingWithNewObject() {
        //Arrange
        Date airdate = new Date();
        EpisodeNumber episodeNumber = mock(EpisodeNumber.class);
        EpisodeTitle title = mock(EpisodeTitle.class);
        EpisodeDescription description = mock(EpisodeDescription.class);
        SeasonID seasonID = mock(SeasonID.class);

        try (MockedConstruction<EpisodeID> episodeID = mockConstruction(EpisodeID.class)) {

            Episode episode = new Episode(
                    episodeNumber,
                    title,
                    description,
                    airdate,
                    seasonID
            );

            //Act
            boolean result = episode.equals(new Object());

            //Assert
            assertFalse(result);
        }
    }


}
