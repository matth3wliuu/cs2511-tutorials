package youtube.state;

import youtube.VideoPlayer;

// ? Why does the base ViewingState hold a reference to a VideoPlayer?

public abstract class ViewingState {
    private VideoPlayer player;

    public ViewingState(VideoPlayer player) {
        this.player = player;
    }

    // * The base state defines the methods that can be used to change state
    public abstract ViewingResult lock();
    public abstract ViewingResult play();
    public abstract ViewingResult next();

    public VideoPlayer getVideoPlayer() {
        return this.player;
    }
}
