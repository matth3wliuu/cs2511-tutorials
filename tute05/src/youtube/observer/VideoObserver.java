package youtube.observer;

import youtube.Video;

public interface VideoObserver {
    public void subscribe(Subject producer);
    public void alertUpload(Video video);
}
