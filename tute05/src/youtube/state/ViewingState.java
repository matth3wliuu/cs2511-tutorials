package youtube.state;

import youtube.Player;

public abstract class ViewingState {

    // * By composition we hold a reference back to video player.
    private Player player;

    public ViewingState(Player player) {
        this.player = player;
    }

    // * Methods to transition between states;
    public abstract String lock();
    public abstract String play();
    public abstract String next();

    public Player getVideoPlayer() {
        return this.player;
    }
}
