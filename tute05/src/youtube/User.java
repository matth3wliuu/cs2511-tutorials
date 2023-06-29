package youtube;

import youtube.observer.Observer;
import youtube.observer.Subject;

public class User implements Observer {
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
    public void alertNewVideo(Video video) {
        System.out.println("Video: " + video.getName() + "was posted");
    }
}
