// package youtube.state;

// import youtube.Player;

// public class Locked extends ViewingState {

//     public Locked(Player player) {
//         super(player);
//     }

//     @Override
//     public String lock() {
//         if (getVideoPlayer().getIsPlaying()) {
//             getVideoPlayer().changeState(new Ready(getVideoPlayer()));
//             return "Stop playing";
//         }
//         return "Locked";
//     }

//     @Override
//     public String play() {
//         getVideoPlayer().changeState(new Ready(getVideoPlayer()));
//         return "Ready...";
//     }

//     @Override
//     public String next() {
//         return "Error: Locked";
//     }
// }
