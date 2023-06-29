package youtube.state;

import youtube.Player;

public abstract class ViewingState {

    private Player player;

    public ViewingState(Player player) {
        this.player = player;
    }

    public abstract String lock();
    public abstract String play();
    public abstract String next();

    public Player getVideoPlayer() {
        return this.player;
    }
}
