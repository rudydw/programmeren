public class TestMusicOrganiser {
    public static void main(String[] args) {
        MusicOrganizer m = new MusicOrganizer();
        MusicOrganizer jef = new MusicOrganizer("jef");
        MusicOrganizer jos = new MusicOrganizer("jos");

        m.listAllTracks();
//        System.out.println(m.getNumberOfTracks());
//        Track t = new Track("");
//        m.stopPlaying();
//        m.playTrack(7);
//        m.playTrack(1);
//        m.getMusicPlayer().startPlaying("../musicorganiser/audio/Billy Joel-Just the Way You Are.mp3");
//        m.allSamples();
//        m.allSamples();
//        m.allSamplesShuffle();
//        m.playArtist("TheSound"); //1 song
//        m.playArtist("TheSound "); //1 song
//        m.playArtist(" TheSound "); //1 song
//        m.playArtist(" The  Sound "); //1 song
//        m.playArtist(" The--Sound "); //1 song
//        m.playArtist(" The--Sound+++ "); //1 song
//        m.playArtist("thesound"); //1 song
//        m.playArtist("thesOund"); //1 song
//        m.playArtist("BlindLemonJefferson"); //2 songs
//        m.playArtist("Blind"); //niks
//        m.playArtist("blablbla"); //niks
        m.allSamplesShuffle(); //for oefening 5

    }
}
