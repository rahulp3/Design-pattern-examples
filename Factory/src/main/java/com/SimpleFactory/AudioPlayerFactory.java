package main.java.com.SimpleFactory;

public class AudioPlayerFactory {
    public static AudioPlayer createAudioPlayer(MediaFormat audioType, int volume, double playBackRate) {
        if (MediaFormat.FLAC.equals(audioType)) {
            return new FLACPlayer(volume, playBackRate);
        } else if (MediaFormat.MP3.equals(audioType)) {
            return new MP3Player(volume, playBackRate);
        } else {
            return new WAVPlayer(volume, playBackRate);
        }
    }
}
