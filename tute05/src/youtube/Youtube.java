package youtube;

import youtube.observer.Observer;
import youtube.observer.Subject;

/*
    - create a producer
    - create 2 users
    - have both users subscribe to the produce
    - proucer uploads a new video
*/

public class Youtube {
    public static void main(String[] args) {
        Subject ashesh = new Producer("Ashesh");
        Observer nick = new User("Nick");
        Observer alvin = new User("Alvin");

        // * We add Nick and Alvin as subscribers to Ashesh
        ashesh.add(nick);
        ashesh.add(alvin);

        Video video = new Video("COMP2511 Lecture 0", 100);

        // * Subject broadcoasting a video to its subscribers
        ashesh.notifySubscribers(video);
    }
}
