package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Observer;
import youtube.observer.Subject;

public class Producer implements Subject {
    private String name;

    private List<Observer> subscribers = new ArrayList<>();

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public void addSubscriber(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(Video video) {
        for (Observer subscriber : this.subscribers) {
            subscriber.alertNewVideo(video, this);
        }
        System.out.println("I just posted a new video" + video);
    }
}
