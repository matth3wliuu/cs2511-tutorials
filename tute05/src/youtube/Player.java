package youtube;

import youtube.state.Ready;
import youtube.state.ViewingState;

public class Player {
    private Video video;
    private Video nextVideo;
    private Boolean isPlaying = false;

    private ViewingState state = new Ready(this);

    public Player(Video video, Video nextVideo) {
        this.video = video;
        this.nextVideo = nextVideo;
    }

    public String lock() {
        return this.state.lock();
    }

    public String play() {
        return this.state.play();
    }

    public String next() {
        return this.state.next();
    }

    public void changeState(ViewingState state) {
        this.state = state;
    }

    public String getVideo() {
        return this.video.getName();
    }

    public String getNextVideo() {
        return this.nextVideo.getName();
    }

    public Boolean getIsPlaying() {
        return isPlaying;
    }

    public void setPlaying(Boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public String playVideo() {
        return "Playing video: " + this.video.getName() + "!";
    }
}
