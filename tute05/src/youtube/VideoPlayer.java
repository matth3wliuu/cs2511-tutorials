package youtube;

import youtube.state.Ready;
import youtube.state.ViewingResult;
import youtube.state.ViewingState;

public class VideoPlayer {
    private Video video;
    private Video nextVideo;
    private boolean isPlaying = false;

    // * The VideoPlayer composes a ViewingState
    private ViewingState state = new Ready(this);

    public VideoPlayer(Video video, Video nextVideo) {
        this.video = video;
        this.nextVideo = nextVideo;
    }

    public ViewingResult lock() {
        return state.lock();
    }

    public ViewingResult play() {
        return state.play();
    }

    public ViewingResult next() {
        return state.next();
    }

    // * Allows the state to be changed at runtime
    public void changeState(ViewingState state) {
        this.state = state;
    }

    public Video getVideo() {
        return this.video;
    }

    public Video getNextVideo() {
        return this.nextVideo;
    }

    public boolean getIsPlaying() {
        return isPlaying;
    }

    public void setPlaying(Boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public String playNextVideo() {
        this.video = nextVideo;
        this.nextVideo = null;
        return playVideo();
    }

    public String playVideo() {
        return "Playing video: " + this.video.getName() + "!";
    }

    public static void main(String[] args) {
        final Video v1 = new Video("Video 1", 42);
        final Video v2 = new Video("Video 2", 8);

        VideoPlayer player = new VideoPlayer(v1, v2);
        player.play();
        player.play();
        player.next();
        player.lock();
    }
}
