package main.java.com.AbstractFactory;

import main.java.com.AbstractFactory.Decoder.AudioDecoder;
import main.java.com.AbstractFactory.Decoder.FLACDecoder;
import main.java.com.AbstractFactory.player.AudioPlayer;
import main.java.com.AbstractFactory.player.FLACPlayer;
import main.java.com.AbstractFactory.processor.AudioProcessor;
import main.java.com.AbstractFactory.processor.FLACAudioProcessor;
import main.java.com.SimpleFactory.MediaFormat;

public class FLACAudioFactory extends AudioFactory{

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new FLACPlayer(volume, playbackRate);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new FLACAudioProcessor(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }
    
}
