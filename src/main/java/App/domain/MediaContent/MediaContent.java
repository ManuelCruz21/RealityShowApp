package App.domain.MediaContent;

import App.domain.RealityShow.RealityShow;

public class MediaContent {

    private int id;
    private String type;
    private String url;
    private RealityShow realityShow;

    public MediaContent (int id, String type, String url, RealityShow realityShow){
        this.id = id;
        this.type = type;
        this.url = url;
        this.realityShow = realityShow;
    }


}
