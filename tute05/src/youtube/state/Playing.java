package youtube.state;

import youtube.Player;

public class Playing extends ViewingState {

    public Playing(Player player) {
        super(player);
    }

    @Override
    public String lock() {
        getVideoPlayer().changeState(new Playing(getVideoPlayer()));
        return "Locked";
    }

    @Override
    public String play() {
        getVideoPlayer().changeState(new Ready(getVideoPlayer()));
        getVideoPlayer().setPlaying(false);
        return "Paused";
    }

    @Override
    public String next() {
        return getVideoPlayer().getNextVideo();
    }

}
