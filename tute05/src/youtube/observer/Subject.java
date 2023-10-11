package youtube.observer;

import youtube.Video;

public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);

    // postVideo
    public void notifyObservers(Video video);
}
