package youtube.state;

import youtube.Video;


// ! The following is NOT NECESSARY for the course and you can replace it with a String
// * This just a way to replicate Rust like Enums in Java
public sealed interface ViewingResult {
    record Locked() implements ViewingResult {}
    record Ready() implements ViewingResult {}
    record Playing(Video v) implements ViewingResult {}
    record Error(String message) implements ViewingResult {}
}
