package youtube;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import youtube.observer.Observer;
import youtube.observer.Subject;

public class Producer implements Subject {

    private List<Observer> subscribers = new ArrayList<>();
=======
import youtube.observer.Subject;
import youtube.observer.VideoObserver;

public class Producer implements Subject {
    private List<VideoObserver> subscribers = new ArrayList<>();
>>>>>>> 03f8b38f6f3e8948b2dab4acf80e6bbd10f09518
    private String name;

    public Producer(String name) {
        this.name = name;
    }

    @Override
<<<<<<< HEAD
    public void upload(Video video) {
        for (Observer subscriber : subscribers) {
            subscriber.alertNewVideo(video);
        }
    }

    @Override
    public void addSubscriber(Observer subscriber) {
        this.subscribers.add(subscriber);
    }

=======
    public void addSubscriber(VideoObserver subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void upload(Video video) {
        for (VideoObserver subscriber : this.subscribers) {
            subscriber.alertUpload(video);
        }
    }
>>>>>>> 03f8b38f6f3e8948b2dab4acf80e6bbd10f09518
}
