package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Observer;
import youtube.observer.Subject;

// ? Who is the Observer?
// * User

// ? Who is the Subject?
// * Producer

public class Producer implements Subject {
    private String name;

    // ? What member variable should I add to facilitate add / remove?
    private List<Observer> subscribers = new ArrayList<>();

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public void add(Observer o) {
        this.subscribers.add(o);
    }

    @Override
    public void remove(Observer o) {
        this.subscribers.remove(o);
    }

    @Override
    public void notifySubscribers(Video newVideo) {
        for (Observer o : subscribers) {
            // * notify o of a new video
            o.alertNewVideo(newVideo);
        }
    }
}
