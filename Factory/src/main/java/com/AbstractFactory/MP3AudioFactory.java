package main.java.com.AbstractFactory;

import main.java.com.AbstractFactory.Decoder.AudioDecoder;
import main.java.com.AbstractFactory.Decoder.MP3Decoder;
import main.java.com.AbstractFactory.player.AudioPlayer;
import main.java.com.AbstractFactory.player.MP3Player;
import main.java.com.AbstractFactory.processor.AudioProcessor;
import main.java.com.AbstractFactory.processor.MP3AudioProcessor;
import main.java.com.SimpleFactory.MediaFormat;

public class MP3AudioFactory extends AudioFactory {
    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new MP3Player(volume, playbackRate);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new MP3AudioProcessor(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }
}
