package youtube;

<<<<<<< HEAD
import youtube.observer.Observer;
import youtube.observer.Subject;

public class User implements Observer {
=======
import youtube.observer.Subject;
import youtube.observer.VideoObserver;

public class User implements VideoObserver {
>>>>>>> 03f8b38f6f3e8948b2dab4acf80e6bbd10f09518
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
<<<<<<< HEAD
    public void alertNewVideo(Video video) {
        System.out.println("Video: " + video.getName() + "was posted");
=======
    public void alertUpload(Video video) {
        System.out.println("New video: " + video.getName());
>>>>>>> 03f8b38f6f3e8948b2dab4acf80e6bbd10f09518
    }
}
