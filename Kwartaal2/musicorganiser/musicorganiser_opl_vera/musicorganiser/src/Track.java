/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class Track {
    // unique id of the track in the tracklist
    private int id;
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;

    public Track(int id, String artist, String title, String filename) {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.filename = filename;
    }

    public Track(String filename) {
        this.id = 0;
        this.artist = "unknown";
        this.title = "unknown";
        this.filename = filename;
    }

    public int getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getFilename() {
        return filename;
    }

    public String getDetails() {
        return artist + ": " + title + "  (file: " + filename + ")";
    }

    @Override
    public String toString() {
        return "Track{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", filename='" + filename + '\'' +
                '}';
    }

}
