package youtube.state;

import youtube.Player;

public class Ready extends ViewingState {
    public Ready(Player player) {
        super(player);
    }

    @Override
    public String lock() {
        getVideoPlayer().changeState(new Locked(getVideoPlayer()));
        return "Locked";
    }

    @Override
    public String play() {
        String video = getVideoPlayer().playVideo();
        getVideoPlayer().changeState(new Playing(getVideoPlayer()));
        return video;
    }

    @Override
    public String next() {
        return "Error: cannot move to next video";
    }
}
