package youtube.state;

import youtube.Video;
import youtube.VideoPlayer;

public class Playing extends ViewingState {
    public Playing(VideoPlayer player) {
        super(player);
    }

    @Override
    public ViewingResult lock() {
        getVideoPlayer().changeState(new Locked(getVideoPlayer()));
        getVideoPlayer().setPlaying(false);
        System.out.println("Locking the video player");
        return new ViewingResult.Locked();
    }

    @Override
    public ViewingResult play() {
        getVideoPlayer().changeState(new Ready(getVideoPlayer()));
        System.out.println("Pausing the video player");
        return new ViewingResult.Ready();
    }

    @Override
    public ViewingResult next() {
        VideoPlayer player = getVideoPlayer();
        final Video nextVideo = player.getNextVideo();
        System.out.println(player.playNextVideo());
        return new ViewingResult.Playing(nextVideo);
    }
}
