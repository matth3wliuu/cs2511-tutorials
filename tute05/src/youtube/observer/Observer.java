package youtube.observer;

import youtube.Producer;
import youtube.Video;

public interface Observer {
    public void alertNewVideo(Video video, Producer producer);
}
