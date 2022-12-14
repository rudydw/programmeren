import javax.swing.*;
import java.util.Arrays;

public class TestMusicOrganiser {
    public static void main(String[] args) {
        MusicOrganizer jef = new MusicOrganizer("jef");
        MusicOrganizer jos = new MusicOrganizer("jos");

        MusicOrganizer m = new MusicOrganizer();

        m.listAllTracks();
        System.out.println(m.getNumberOfTracks());
        //Track t = new Track("");
        m.stopPlaying();
        m.playTrack(9);

//        //m.playTrack(1);
//        m.allSamples();
//        System.out.println("----------------");
//        m.allSamplesShuffle();
//        System.out.println("----------------");
//        m.allSamplesShuffle();
//
//        m.playArtist("TheSound");
//        m.playArtist("Thesound");
//        m.playArtist("TheSounde");
//        m.playArtist("The-Sound");
//        m.playArtist("The Sound");
//        m.playArtist("The - Sound");


    }
}
