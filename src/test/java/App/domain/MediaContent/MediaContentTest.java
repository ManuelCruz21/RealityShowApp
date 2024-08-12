package App.domain.MediaContent;

import App.domain.RealityShow.RealityShow;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;

 class MediaContentTest {

     /**
      * Shoud Instantiate Valid Media Content
      */
    @Test
    void shouldInstantiateMediaContent_whenHasValidParameters() {
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

        //Act + Assert
        assertNotNull(realityShow);

    }
}
