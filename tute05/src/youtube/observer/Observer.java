package youtube.observer;

import youtube.Video;

public interface Observer {
    public void alertNewVideo(Video newVideo);
}
