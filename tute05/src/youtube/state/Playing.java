package youtube.state;

import youtube.Player;

public class Playing extends ViewingState {

    public Playing(Player player) {
        super(player);
    }

    @Override
    public String lock() {
        getVideoPlayer().changeState(new Locked(getVideoPlayer()));
        getVideoPlayer().setPlaying(false);
        return "Locked...";
    }

    @Override
    public String play() {
        getVideoPlayer().changeState(new Ready(getVideoPlayer()));
        return "Ready...";
    }

    @Override
    public String next() {
        return getVideoPlayer().getNextVideo();
    }
}
