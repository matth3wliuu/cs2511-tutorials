package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Observer;
import youtube.observer.Subject;

public class Producer implements Subject {
    private String name;

    private List<Observer> observers = new ArrayList<>();

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Video video) {
        for (Observer observer : observers) {
            observer.alertNewVideo(video, this);
        }
    }
}
