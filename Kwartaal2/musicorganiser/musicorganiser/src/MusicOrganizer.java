import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * A class to hold details of audio tracks.
 * Individual tracks may be played.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer {
    // gebruiker.
    private String gebruikerNaam;
    // An ArrayList for storing music tracks.
    private ArrayList<Track> tracks;
    // A player for the music tracks.
    private MusicPlayer player;
    // A reader that can read music files and load them as tracks.
    private TrackReader reader;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer() {
        this("unknown");
    }

    public MusicOrganizer(String gebruikerNaam) {
        this.gebruikerNaam = gebruikerNaam;
        tracks = new ArrayList<Track>();
        player = new MusicPlayer();
        reader = new TrackReader();
        if (gebruikerNaam.equals("unknown")) {
            readLibrary("../musicorganiser/audio");
        } else {
            readLibrary("../musicorganiser/audio_" + gebruikerNaam.toLowerCase());
        }
        System.out.println("Music library loaded. " + getNumberOfTracks() + " tracks.");
        System.out.println();
    }

    /**
     * Add a track file to the collection.
     *
     * @param filename The file name of the track to be added.
     */
    public void addFile(String filename) {
        tracks.add(new Track(filename));
    }

    /**
     * Add a track to the collection.
     *
     * @param track The track to be added.
     */
    public void addTrack(Track track) {
        tracks.add(track);
    }

    /**
     * Play a track in the collection.
     *
     * @param index The index of the track to be played.
     */
    public void playTrack(int index) {
        if (indexValid(index)) {
            Track track = tracks.get(index);
            player.startPlaying(track.getFilename());
            System.out.println("Now playing: " + track.getArtist() + " - " + track.getTitle());
        }
    }

    /**
     * Return the number of tracks in the collection.
     *
     * @return The number of tracks in the collection.
     */
    public int getNumberOfTracks() {
        return tracks.size();
    }

    /**
     * List a track from the collection.
     *
     * @param index The index of the track to be listed.
     */
    public void listTrack(int index) {
        if (indexValid(index)) {
            System.out.print("Track " + index + ": ");
            Track track = tracks.get(index);
            System.out.println(track.getDetails());
        }
    }

    /**
     * Show a list of all the tracks in the collection.
     */
    public void listAllTracks() {
        System.out.println("Track listing: ");
        for(Track track : tracks) {
            System.out.println(track.getDetails());
        }
        System.out.println();
        listAllTracks(tracks);
    }

    /**
     * Show a list of all the tracks in the collection.
     */
    public void listAllTracks(ArrayList<Track> tracks) {
        System.out.println("Track listing: ");
        for (Track track : tracks) {
            System.out.println(track.getDetails());
        }
        System.out.println();
    }

    /**
     * Remove a track from the collection.
     *
     * @param index The index of the track to be removed.
     */
    public void removeTrack(int index) {
        if (indexValid(index)) {
            tracks.remove(index);
        }
    }

    /**
     * Play the first track in the collection, if there is one.
     */
    public void playFirst() {
        if (tracks.size() > 0) {
            player.startPlaying(tracks.get(0).getFilename());
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     *
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean indexValid(int index) {
        // The return value.
        // Set according to whether the index is valid or not.
        boolean valid;

        if (index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        } else if (index >= tracks.size()) {
            System.out.println("Index is too large: " + index);
            valid = false;
        } else {
            valid = true;
        }
        return valid;
    }

    private void readLibrary(String folderName) {
        ArrayList<Track> tempTracks = reader.readTracks(folderName, ".mp3");

        // Put all the tracks into the organizer.
        for (Track track : tempTracks) {
            addTrack(track);
        }
    }

    public void allSamples() {
        listAllTracks();
        for (Track t : tracks) {
//            System.out.println(t);
//            player.playSample(t.getFilename());
//            player.playSample(tracks.get(0).getFilename());
        }
    }

    public void allSamplesShuffle() {
        ArrayList<Track> shuffled = new ArrayList<>(tracks);

        for (Track track : tracks) {
            System.out.println(String.format("%d %s van %d", 0, track.getTitle(), track.getArtist()));
        }
//        Collections.copy(tracks, shuffled);
        Collections.shuffle(shuffled);
        listAllTracks(shuffled);
        for (Track t : shuffled) {
//            System.out.println(t);
//            player.playSample(t.getFilename());
//            player.playSample(tracks.get(0).getFilename());
        }
    }

    public void playArtist(String artist) {
        System.out.println("==== Play songs for artist '" + artist + "'");
        boolean gevonden = false;
        for (Track t : tracks) {
            String art = t.getArtist();
            if (art.toLowerCase().equalsIgnoreCase(artist.replaceAll("[^a-zA-Z]", ""))) {
                gevonden = true;
                System.out.println("playing" + t);
//                player.playSample(t.getFilename());
            }
        }
        if (!gevonden) {
            System.out.println("Deze vertolker kon niet gevonden worden.");
        }
    }

    public void tracksGebruiker() {

    }
}
