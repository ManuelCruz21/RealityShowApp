package App.domain.episode;

import App.domain.reality_show.RealityShow;
import App.domain.season.Season;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EpisodeTest {

    /**
     * Shoud Instantiate Valid Episode
     */
    @Test
    void shouldInstantiateEpisode_whenHasValidParameters() {
        //Arrange

        RealityShow realityShow = new RealityShow(
                1,
                "Survivor",
                "A reality show about survival",
                "Adventure",
                new Date(),
                new ArrayList<>(),
                "https://example.com/image.jpg",
                "Ongoing"
        );

        Season season = new Season(
                1,
                1,
                new ArrayList<>(),
                realityShow
        );

        Date airdate = new Date();

        Episode episode = new Episode(
                1,
                1,
                "Pilot",
                "The very first episode",
                airdate,
                season
        );

        //Act + Assert
        assertNotNull(episode);
    }

    /**
     * Should return id when getId is called.
     */
    @Test
    void shouldReturnId_whenGetIdIsCalled() {
        //Arrange
        RealityShow realityShow = new RealityShow(
                1,
                "Survivor",
                "A reality show about survival",
                "Adventure",
                new Date(),
                new ArrayList<>(),
                "https://example.com/image.jpg",
                "Ongoing"
        );

        Season season = new Season(
                1,
                1,
                new ArrayList<>(),
                realityShow
        );

        Date airdate = new Date();

        Episode episode = new Episode(
                1,
                1,
                "Pilot",
                "The very first episode",
                airdate,
                season
        );

        int expected = 1;

        //Act
        int result = episode.getId();

        //Assert
        assertEquals(expected, result);
    }

    /**
     * Should return episodeNumber when getEpisodeNumber is called.
     */
    @Test
    void shouldReturnEpisodeNumber_whenGetEpisodeNumberIsCalled() {
        //Arrange

        RealityShow realityShow = new RealityShow(
                1,
                "Survivor",
                "A reality show about survival",
                "Adventure",
                new Date(),
                new ArrayList<>(),
                "https://example.com/image.jpg",
                "Ongoing"
        );

        Season season = new Season(
                1,
                1,
                new ArrayList<>(),
                realityShow
        );

        Date airdate = new Date();

        Episode episode = new Episode(
                1,
                1,
                "Pilot",
                "The very first episode",
                airdate,
                season
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

        RealityShow realityShow = new RealityShow(
                1,
                "Survivor",
                "A reality show about survival",
                "Adventure",
                new Date(),
                new ArrayList<>(),
                "https://example.com/image.jpg",
                "Ongoing"
        );

        Season season = new Season(
                1,
                1,
                new ArrayList<>(),
                realityShow
        );

        Date airdate = new Date();

        Episode episode = new Episode(
                1,
                1,
                "Pilot",
                "The very first episode",
                airdate,
                season
        );

        String expected = "Pilot";

        //Act
        String result = episode.getTitle();

        //Assert
        assertEquals(expected, result);
    }

    /**
     * Should return airdate when getAirdate is called.
     */
    @Test
    void shouldReturnDescription_whenGetDescriptionIsCalled() {
        //Arrange


        RealityShow realityShow = new RealityShow(
                1,
                "Survivor",
                "A reality show about survival",
                "Adventure",
                new Date(),
                new ArrayList<>(),
                "https://example.com/image.jpg",
                "Ongoing"
        );


        Season season = new Season(
                1,
                1,
                new ArrayList<>(),
                realityShow
        );


        Date airdate = new Date();


        Episode episode = new Episode(
                1,
                1,
                "Pilot",
                "The very first episode",
                airdate,
                season
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

        RealityShow realityShow = new RealityShow(
                1,
                "Survivor",
                "A reality show about survival",
                "Adventure",
                new Date(),
                new ArrayList<>(),
                "https://example.com/image.jpg",
                "Ongoing"
        );


        Season season = new Season(
                1,
                1,
                new ArrayList<>(),
                realityShow
        );

        Date airdate = new Date();

        Episode episode = new Episode(
                1,
                1,
                "Pilot",
                "The very first episode",
                airdate,
                season
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

        RealityShow realityShow = new RealityShow(
                1,
                "Survivor",
                "A reality show about survival",
                "Adventure",
                new Date(),
                new ArrayList<>(),
                "https://example.com/image.jpg",
                "Ongoing"
        );

        Season season = new Season(
                1,
                1,
                new ArrayList<>(),
                realityShow
        );

        Date airdate = new Date();

        Episode episode = new Episode(
                1,
                1,
                "Pilot",
                "The very first episode",
                airdate,
                season
        );

        //Act
        Season result = episode.getSeason();

        //Assert
        assertEquals(season, result);
    }

    /**
     * Should return Episode in string format when toString is called.
     */
    @Test
    void shouldReturnEpisodeInStringFormat_whenToStringIsCalled() {
        //Arrange

        RealityShow realityShow = new RealityShow(
                1,
                "Survivor",
                "A reality show about survival",
                "Adventure",
                new Date(),
                new ArrayList<>(),
                "https://example.com/image.jpg",
                "Ongoing"
        );

        Season season = new Season(
                1,
                1,
                new ArrayList<>(),
                realityShow
        );

        Date airdate = new Date();

        Episode episode = new Episode(
                1,
                1,
                "Pilot",
                "The very first episode",
                airdate,
                season
        );

        String expected = "Episode:" +
                "id=1" +
                ", episodeNumber=1" +
                ", title=Pilot" +
                ", description=The very first episode" +
                ", airdate=" + airdate +
                ", season=" + season;

        //Act
        String result = episode.toString();

        //Assert
        assertEquals(expected, result);
    }


}
