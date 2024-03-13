package youtube.state;

import youtube.VideoPlayer;

// ? Why does the base ViewingState hold a reference to a VideoPlayer?
// * We need the VideoPlayer to be able to change its state
// * Example: line 4 of Locked.java

// * Suppose, we want to add a new state. What do we need to do?
// * We just need to add a new class that extends the `ViewingState` interface
// * This does not violate the Open-close principle!

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
