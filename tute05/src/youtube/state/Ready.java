package youtube.state;

import youtube.Video;
import youtube.VideoPlayer;

public class Ready extends ViewingState {
    public Ready(VideoPlayer player) {
        super(player);
    }

    @Override
    public ViewingResult lock() {
        // * Get the video player and change its state to the locked state
        getVideoPlayer().changeState(new Locked(getVideoPlayer()));
        System.out.println("Locking the video player");
        return new ViewingResult.Locked();
    }

    @Override
    public ViewingResult play() {
        VideoPlayer player = getVideoPlayer();
        System.out.println(player.playVideo());
        player.changeState(new Playing(player));
        return new ViewingResult.Playing(player.getVideo());
    }

    @Override
    public ViewingResult next() {
        VideoPlayer player = getVideoPlayer();
        final Video nextVideo = player.getNextVideo();
        System.out.println(player.playNextVideo());
        return new ViewingResult.Playing(nextVideo);
    }
}
