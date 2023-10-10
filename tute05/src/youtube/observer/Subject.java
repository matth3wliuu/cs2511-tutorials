package youtube.observer;

import youtube.Video;

public interface Subject {
    public void addSubscriber(Observer observer);
    public void removeSubscriber(Observer observer);

    // Just another name for upload video
    public void notifySubscribers(Video video);
}
