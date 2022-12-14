public class TestMusicOrganiserWithUser {
    public static void main(String[] args) {
        MusicOrganizer jef = new MusicOrganizer("Jef");
        MusicOrganizer jos = new MusicOrganizer("Jos");

        System.out.println(jef.listAllTracksForUser());
        System.out.println(jos.listAllTracksForUser());
    }


}
