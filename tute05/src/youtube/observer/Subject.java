package youtube.observer;

import youtube.Video;

public interface Subject {
    public void add(Observer o);
    public void remove(Observer o);
    public void notifySubscribers(Video newVideo);
}
