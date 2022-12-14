import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.FactoryRegistry;
import javazoom.jl.player.advanced.AdvancedPlayer;

/**
 * Provide basic playing of MP3 files via the javazoom library.
 * See http://www.javazoom.net/
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class MusicPlayer
{
    // The current player. It might be null.
    private AdvancedPlayer player;
    
    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer()
    {
        player = null;
    }
    
    /**
     * Play a part of the given file.
     * The method returns once it has finished playing.
     * @param track The track to be played.
     */
    public void playSample(Track track)
    {
        try {
            setupPlayer(track.getFilename());
            player.play(500);
            track.setNrOfTimesPlayed(track.getNrOfTimesPlayed() + 1);
        }
        catch(JavaLayerException e) {
            reportProblem(track.getFilename());
        }
        finally {
            killPlayer();
        }
    }
    
    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param filename The file to be played.
     */
    public void startMDCPlaying(String filename)
    {
        try {
            setupPlayer(filename);
            Thread playerThread = new Thread(filename) {
                public void run()
                {
                    try {
                        player.play();
                    }
                    catch(JavaLayerException e) {
                        Thread t = Thread.currentThread();
                        String name = t.getName();                        
                        reportProblem(name);
                    }
                    finally {
                        killPlayer();
                    }
                }
            };
            playerThread.start();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            reportProblem(filename);
        }
        System.out.println(filename);
        int k = 0;
        while(player!=null) {
            k++;
            if (k>1000000000) {
                System.out.println("Wachten... "+filename+" speelt momenteel!");
                k = 0;
            }
        }
    }
    public void startPlaying(final String filename)
    {
        try {
            setupPlayer(filename);
            Thread playerThread = new Thread() {
                public void run()
                {
                    try {
                        player.play(5000);
                    }
                    catch(JavaLayerException e) {
                        reportProblem(filename);
                    }
                    finally {
                        killPlayer();
                    }
                }
            };
            playerThread.start();
        }
        catch (Exception ex) {
            reportProblem(filename);
        }
    }
    
    public void stop()
    {
        killPlayer();
    }
    
    /**
     * Set up the player ready to play the given file.
     * @param filename The name of the file to play.
     */
    private void setupPlayer(String filename)
    {
        try {
            InputStream is = getInputStream(filename);
            player = new AdvancedPlayer(is, createAudioDevice());
        }
        catch (IOException e) {
            reportProblem(filename);
            killPlayer();
        }
        catch(JavaLayerException e) {
            reportProblem(filename);
            killPlayer();
        }
    }

    /**
     * Return an InputStream for the given file.
     * @param filename The file to be opened.
     * @throws IOException If the file cannot be opened.
     * @return An input stream for the file.
     */
    private InputStream getInputStream(String filename)
        throws IOException
    {
        return new BufferedInputStream(
                    new FileInputStream(filename));
    }

    /**
     * Create an audio device.
     * @throws JavaLayerException if the device cannot be created.
     * @return An audio device.
     */
    private AudioDevice createAudioDevice()
        throws JavaLayerException
    {
        return FactoryRegistry.systemRegistry().createAudioDevice();
    }

    /**
     * Terminate the player, if there is one.
     */
    private void killPlayer()
    {
        synchronized(this) {
            if(player != null) {
                player.stop();
                player = null;
            }
        }
    }
    
    /**
     * Report a problem playing the given file.
     * @param filename The file being played.
     */
    private void reportProblem(String filename)
    {
        System.out.println("There was a problem playing: " + filename);
    }

}
