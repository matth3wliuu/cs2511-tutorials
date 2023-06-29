package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Subject;
import youtube.observer.VideoObserver;

public class Producer implements Subject {
    private List<VideoObserver> subscribers = new ArrayList<>();
    private String name;

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public void addSubscriber(VideoObserver subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void upload(Video video) {
        for (VideoObserver subscriber : this.subscribers) {
            subscriber.alertUpload(video);
        }
    }
}
