package br.com.edu.music.player;

public class Main {
    public static void main(String[] args) {
                runMusic(new Computador());
        runVideo(new Computador());
    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}
