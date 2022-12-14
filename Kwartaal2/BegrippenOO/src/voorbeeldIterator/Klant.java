package voorbeeldIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Klant {
    private String naam;
    ArrayList<Artikel> lijst = new ArrayList<>();

    public Klant(String naam) {
        this.naam = naam;
    }

    // functie om artikel toe te voegen
    public void voegArtikelToe(Artikel artikel) {
        lijst.add(artikel);
    }

    // functie om alle artikels van deze klant af te drukken (met iterator)
    public void drukAlleArtikelsKlant() {
        System.out.println("Klant " + naam);
        final Iterator<Artikel> itArt = lijst.iterator();
        while (itArt.hasNext()) {
            System.out.println(itArt.next());
        }
    }

    public void verwijderArtikelZonderKorting() {
//            for (Artikel art : lijst) {
//                if (art.getKorting() == 0) {
//                    lijst.remove(art);  // creëert exception !!!!!!!!!
//                }
//        }
        final Iterator<Artikel> iterator = lijst.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getKorting() == 0) {
                iterator.remove();
            }
        }
    }


    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", lijst=" + lijst +
                '}';
    }
}
