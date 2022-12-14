package music;

public class Gebruiker {
    private String naam;
    private MusicOrganizer musicOrganizer;

    public Gebruiker(String naam, MusicOrganizer musicorganiser) {
        this.naam = naam;
        this.musicOrganizer = musicorganiser;
    }

    @Override
    public String toString() {
        return "Gebruiker{" +
                "naam='" + naam + '\'' +
                ", musicorganiser=" + musicOrganizer +
                '}';
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public MusicOrganizer getMusicOrganizer() {
        return musicOrganizer;
    }

    public void setMusicOrganizer(MusicOrganizer musicOrganizer) {
        this.musicOrganizer = musicOrganizer;
    }
}
