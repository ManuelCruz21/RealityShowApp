package App.domain.Episode;

import App.domain.RealityShow.RealityShow;
import App.domain.Season.Season;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EpisodeTest {

    @Test
    void shouldInstantiateEpisode_whenHasValidParameters() {
        //Arrange

        //Instância de RealityShow
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

        // Instância de Season usando a instância de RealityShow
        Season season = new Season(
                1,
                1,
                new ArrayList<>(),
                realityShow
        );

        // Definir uma data para o teste
        Date airdate = new Date();

        // Instância de Episode usando o construtor
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


}
