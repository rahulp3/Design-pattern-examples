package main.java.com.SimpleFactory;

public abstract class AudioPlayer {

    int volume;
    double playBackRate;

    public abstract MediaFormat supportsType();

    public abstract void play();

    public abstract void pause();

    public abstract void stop();
}
    

