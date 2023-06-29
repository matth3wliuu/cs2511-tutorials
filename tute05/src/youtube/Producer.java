package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Observer;
import youtube.observer.Subject;

public class Producer implements Subject {

    private List<Observer> subscribers = new ArrayList<>();
    private String name;

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public void upload(Video video) {
        for (Observer subscriber : subscribers) {
            subscriber.alertNewVideo(video);
        }
    }

    @Override
    public void addSubscriber(Observer subscriber) {
        this.subscribers.add(subscriber);
    }

}
