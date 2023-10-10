package youtube;

import java.util.ArrayList;
import java.util.List;

import youtube.observer.Observer;

public class User implements Observer {
    private String name;

    private List<String> messages = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void alertNewVideo(Video video, Producer producer) {
        final String message = "Producer: " + producer + " has uploaded a new video " + video;
        System.out.println(message);
        this.messages.add(message);
    }
}
