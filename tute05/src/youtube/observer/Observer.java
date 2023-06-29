package youtube.observer;

import youtube.Video;

public interface Observer {
    public void subscribe(Subject producer);
    public void alertNewVideo(Video video);
}
