package main.java.com.AbstractFactory;

import main.java.com.AbstractFactory.Decoder.AudioDecoder;
import main.java.com.AbstractFactory.player.AudioPlayer;
import main.java.com.AbstractFactory.processor.AudioProcessor;
import main.java.com.SimpleFactory.MediaFormat;

public abstract class AudioFactory {

    public abstract AudioDecoder createAudioDecoder(byte[] audioData);

    public abstract AudioPlayer createAudioPlayer(int volume, double playbackRate);

    public abstract AudioProcessor createAudioProcessor(byte[] audioData);
    
    public abstract MediaFormat supportsFormat();
}
