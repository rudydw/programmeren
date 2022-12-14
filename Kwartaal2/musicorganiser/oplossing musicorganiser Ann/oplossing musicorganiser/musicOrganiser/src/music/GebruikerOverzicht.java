package music;

import java.util.ArrayList;

public class GebruikerOverzicht {
    ArrayList<Gebruiker> lijst = new ArrayList<>();

    public void voegGebruikerToe(Gebruiker g) {
        lijst.add(g);
    }

    public void showSamplesUsers() {
    }

    @Override
    public String toString() {
        return "GebruikerOverzicht{" +
                "lijst=" + lijst +
                '}';
    }
}
