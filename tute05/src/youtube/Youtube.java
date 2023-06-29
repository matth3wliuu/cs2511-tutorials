package youtube;

public class Youtube {
    public static void main(String[] args) {
        Producer producer = new Producer("Ashesh");
        User nick = new User("Nick");
        User matt = new User("Matt");

        matt.subscribe(producer);
        nick.subscribe(producer);

        Video video = new Video("Asheeeesh", 10);
        producer.upload(video);

        /*



            - create a producer
            - create 2 users
            - have both users subscribe to the produce
            - proucer uploads a new video
        */
    }
}
