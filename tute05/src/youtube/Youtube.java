package youtube;

import youtube.observer.Observer;
import youtube.observer.Subject;

public class Youtube {
    public static void main(String[] args) {

        Subject ashesh = new Producer("Ashesh");
        Observer nick = new User("Nick");
        Observer alvin = new User("Alvin");

        alvin.subscribe(ashesh);
        nick.subscribe(ashesh);

        Video video = new Video("COMP2511 Lecture 0", 100);
        ashesh.upload(video);

        /*
            - create a producer
            - create 2 users
            - have both users subscribe to the produce
            - proucer uploads a new video
        */
    }
}
