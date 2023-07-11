package youtube;

import youtube.observer.Observer;
import youtube.observer.Subject;

public class Youtube {
    public static void main(String[] args) {
<<<<<<< HEAD

        Subject ashesh = new Producer("Ashesh");
        Observer nick = new User("Nick");
        Observer alvin = new User("Alvin");

        alvin.subscribe(ashesh);
        nick.subscribe(ashesh);

        Video video = new Video("COMP2511 Lecture 0", 100);
        ashesh.upload(video);
=======
        Producer producer = new Producer("Ashesh");
        User nick = new User("Nick");
        User matt = new User("Matt");

        matt.subscribe(producer);
        nick.subscribe(producer);

        Video video = new Video("Asheeeesh", 10);
        producer.upload(video);
>>>>>>> 03f8b38f6f3e8948b2dab4acf80e6bbd10f09518

        /*



            - create a producer
            - create 2 users
            - have both users subscribe to the produce
            - proucer uploads a new video
        */
    }
}
