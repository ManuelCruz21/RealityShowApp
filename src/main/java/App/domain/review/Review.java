package App.domain.review;

import App.domain.episode.Episode;
import App.domain.reality_show.RealityShow;
import App.domain.user.User;

public class Review {

    private int id;
    private int rating;
    private String comment;
    private User user;
    private RealityShow realityshow;
    private Episode episode;


    public Review(int id, int rating, String comment, User user, RealityShow realityshow, Episode episode) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
        this.user = user;
        this.realityshow = realityshow;
        this.episode = episode;
    }

}
