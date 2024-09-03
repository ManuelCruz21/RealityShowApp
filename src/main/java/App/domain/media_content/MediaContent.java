package App.domain.media_content;

import App.domain.reality_show.RealityShow;
import App.domain.value_objects.MediaContentID;
import App.domain.value_objects.MediaContentType;
import App.domain.value_objects.MediaContentURL;

public class MediaContent {

    private MediaContentID id;
    private MediaContentType type;
    private MediaContentURL url;
    private RealityShow realityShow;

    /**
     * Constructor
     *
     * @param id media content ID
     * @param type media content type
     * @param url media content URL
     * @param realityShow reality show
     */
    public MediaContent(MediaContentID id, MediaContentType type, MediaContentURL url, RealityShow realityShow) {
        this.id = id;
        this.type = type;
        this.url = url;
        this.realityShow = realityShow;
    }


}
