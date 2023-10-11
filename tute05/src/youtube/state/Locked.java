package youtube.state;

import youtube.Player;

public class Locked extends ViewingState {
    public Locked(Player player) {
        super(player);
    }

    @Override
    public String lock() {
        Player videoPlayer = getVideoPlayer();

        if (videoPlayer.getIsPlaying()) {
            videoPlayer.changeState(new Ready(videoPlayer));
            return "Stop playing";
        }
        return "Locked";
    }

    @Override
    public String play() {
        Player videoPlayer = getVideoPlayer();

        videoPlayer.changeState(new Ready(videoPlayer));
        return "Ready...";
    }

    @Override
    public String next() {
        return "Error: Locked";
    }
}
