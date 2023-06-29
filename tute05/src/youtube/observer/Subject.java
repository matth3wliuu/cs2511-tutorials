package youtube.observer;

import youtube.Video;

public interface Subject {
    public void addSubscriber(VideoObserver subscriber);
    public void upload(Video video);
}
