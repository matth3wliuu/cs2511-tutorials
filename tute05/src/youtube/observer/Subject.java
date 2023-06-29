package youtube.observer;

import youtube.Video;

public interface Subject {
    public void upload(Video video);
    public void addSubscriber(Observer subscriber);
}
