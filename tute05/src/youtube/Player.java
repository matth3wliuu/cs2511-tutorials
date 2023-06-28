package youtube;

import youtube.state.ViewingState;

public class Player {
    private Video video;
    private Video nextVideo;
    private Boolean isPlaying = false;

    public Player(Video video, Video nextVideo) {
        this.video = video;
        this.nextVideo = nextVideo;
    }

    public String lock() {
        return null;
    }

    public String play() {
        return null;
    }

    public String next() {
        return null;
    }

    public void changeState(ViewingState state) {
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
