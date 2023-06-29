package youtube;

import youtube.observer.Subject;
import youtube.observer.VideoObserver;

public class User implements VideoObserver {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void subscribe(Subject producer) {
        producer.addSubscriber(this);
    }

    @Override
    public void alertUpload(Video video) {
        System.out.println("New video: " + video.getName());
    }
}
