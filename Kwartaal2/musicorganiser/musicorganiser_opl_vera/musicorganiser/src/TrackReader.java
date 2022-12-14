import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

/**
 * A helper class for our music application. This class can read files from the file system
 * from a given folder with a specified suffix. It will interpret the file name as artist/
 * track title information.
 * <p>
 * It is expected that file names of music tracks follow a standard format of artist name
 * and track name, separated by a dash. For example: TheBeatles-HereComesTheSun.mp3
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.03.27
 */
public class TrackReader {
    public TrackReader() {
    }

    /**
     * Read music files from the given library folder
     * with the given suffix.
     *
     * @param folder The folder to look for files.
     * @param suffix The suffix of the audio type.
     */
    public ArrayList<Track> readTracks(String folder, final String suffix) {
        final String filter = "blind";
        System.out.println("readTracks " + folder + " " + suffix);
        final File audioFolder = new File(folder);
        final ArrayList<Track> tracks = new ArrayList<Track>();
        //FilenameFilter fn = new TrackFilenameFilter(suffix);
        //File[] audioFiles = audioFolder.listFiles((dir, name) -> name.toLowerCase().endsWith(suffix));

        FilenameFilter fn = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(suffix);
                //return name.toLowerCase().endsWith(suffix) && name.toLowerCase().startsWith("blind");
            }
        };
        File[] audioFiles = audioFolder.listFiles(fn);

        // Put all the matching files into the organizer.
        for (int i = 0; i < audioFiles.length; i++) {
            Track trackDetails = decodeDetails(i + 1, audioFiles[i]);
            tracks.add(trackDetails);
        }
        return tracks;
    }

    /**
     * Try to decode details of the artist and the title
     * from the file name.
     * It is assumed that the details are in the form:
     * artist-title.mp3
     *
     * @param file The track file.
     * @return A Track containing the details.
     */
    private Track decodeDetails(int id, File file) {
        // The information needed.
        String artist = "unknown";
        String title = "unknown";
        String filename = file.getPath();

        // Look for artist and title in the name of the file.
        String details = file.getName();
        String[] parts = details.split("-");

        if (parts.length == 2) {
            artist = parts[0];
            String titlePart = parts[1];
            // Remove a file-type suffix.
            parts = titlePart.split("\\.");
            if (parts.length >= 1) {
                title = parts[0];
            } else {
                title = titlePart;
            }
        }
        return new Track(id, artist, title, filename);
    }

    public static void main(String[] args) {
        //this main is to test the private function decodeDetails
        TrackReader trackReader = new TrackReader();
        System.out.println(trackReader.decodeDetails(1, new File("naam-song.mp3")));
        System.out.println(trackReader.decodeDetails(1, new File("naamsong.mp3")));
        System.out.println(trackReader.decodeDetails(1, new File("-song.mp3")));
        System.out.println(trackReader.decodeDetails(1, new File("naam-.mp3")));
        System.out.println(trackReader.decodeDetails(1, new File("naam-song.txt")));
        System.out.println(trackReader.decodeDetails(1, new File("")));
        System.out.println(trackReader.decodeDetails(1, new File("naam-song-balbla.mp3")));
    }
}
