package youtube;

import youtube.observer.Observer;

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
    public void alertNewVideo(Video video, Producer producer) {
        System.out.println(producer + " has posted a new video " + video);
    }
}
