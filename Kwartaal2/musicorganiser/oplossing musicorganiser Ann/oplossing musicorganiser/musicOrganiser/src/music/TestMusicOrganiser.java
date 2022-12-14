package music;

import java.io.File;
import java.io.FilenameFilter;

public class TestMusicOrganiser {
    public static void main(String[] args) {
        MusicOrganizer m = new MusicOrganizer();
        //m.playArtist("Blind blake");
       // m.allSamples();
       // m.allSamplesShuffle();
        //m.listAllTracks();
        //System.out.println(m.getNumberOfTracks());
        //Track t = new Track("");
        //m.stopPlaying();


        //m.playTrack();
        TrackReader tr = new TrackReader();
        File f = new File("BigBillBroonzy-BabyPleaseDontGo1-2012.mp3");
        System.out.println(tr.decodeDetails(f));

    }
}
