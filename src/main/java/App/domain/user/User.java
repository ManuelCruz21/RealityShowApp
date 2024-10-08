package App.domain.user;

import App.domain.reality_show.RealityShow;

import java.util.List;

public class User {

    private int _id;
    private String _username;
    private String _password;
    private String _email;
    private List<RealityShow> _watchlist;
    private List<RealityShow> _favorites;

}
