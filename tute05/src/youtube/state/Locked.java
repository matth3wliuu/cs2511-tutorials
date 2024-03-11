package youtube.state;

import youtube.VideoPlayer;

public class Locked extends ViewingState {
    public Locked(VideoPlayer player) {
        super(player);
    }

    @Override
    public ViewingResult lock() {
        VideoPlayer videoPlayer = getVideoPlayer();
        if (videoPlayer.getIsPlaying()) {
            videoPlayer.changeState(new Ready(videoPlayer));
            return new ViewingResult.Ready();
        }
        return new ViewingResult.Locked();
    }

    @Override
    public ViewingResult play() {
        return new ViewingResult.Error("Cannot play the current video because it is locked");
    }

    @Override
    public ViewingResult next() {
        return new ViewingResult.Error("Cannot play the next video becuase it is locked");
    }
}
