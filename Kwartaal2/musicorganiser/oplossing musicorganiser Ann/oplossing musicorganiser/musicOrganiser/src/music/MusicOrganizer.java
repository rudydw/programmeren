package music;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * A class to hold details of audio tracks.
 * Individual tracks may be played.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer {
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
        tracks = new ArrayList<Track>();
        player = new MusicPlayer();
        reader = new TrackReader();
        //uit welke bibliotheek er gelezen wordt
        readLibrary("audio");
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
     */
    public void playTrack() {
        boolean juist = false;
        while (!juist) {
            try {
                int index = Integer.parseInt(JOptionPane.showInputDialog("Geef een nummer van 0 tot " + (tracks.size() - 1)));
                if (index >= 0 && index < tracks.size()) {
                    juist = true;
                    Track track = tracks.get(index);
                    player.startPlaying(track.getFilename());
                    System.out.println("Now playing: " + track.getArtist() + " - " + track.getTitle());
                } else {
                    JOptionPane.showMessageDialog(null, "geef een getal op tussen 0 tot " + (tracks.size() - 1));
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "geef een getal op tussen 0 tot " + (tracks.size() - 1));
            }
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

        // Put all thetracks into the organizer.
        for (Track track : tempTracks) {
            addTrack(track);
        }
    }

    /*public void allSamples()
    //speelt enkel de eerste track af.
    {
        for (Track t : tracks) {
            player.startPlaying(tracks.get(0).getFilename());
        }

    }*/
    public void allSamples() {
        for (Track t : tracks) {
            player.playSample(t.getFilename());

        }
    }

    public void allSamplesShuffle() {

        ArrayList<Track> newList = new ArrayList<>(tracks);
        //newList is nu een ONAFHANKELIJKE kopie van de list tracks
        Collections.shuffle(newList);
        System.out.println(newList);
        String s = "De volgende tracks worden gespeeld.\n";
        for (Track t : newList) {
            s += tracks.indexOf(t) +" "+ t.getTitle() + " van " + t.getArtist() + "\n";

        }
        JOptionPane.showMessageDialog(null, s);
        for (Track t : newList) {
            player.playSample(t.getFilename());
        }
    }

    public void playArtist(String artist) {

        for (Track t : tracks) {
            if (artist.replaceAll("[ .!,?;]", "").toLowerCase().
                    equals(t.getArtist().replaceAll("[ .!,?;]", "").toLowerCase())) {
                System.out.println(t);
                player.playSample(t.getFilename());
            }

        }
    }


    @Override
    public String toString() {
        return "MusicOrganizer{" +
                "tracks=" + tracks +
                ", player=" + player +
                ", reader=" + reader +
                '}';
    }
}
