package voorbeeldIterator;

public class TestKlant {
    public static void main(String[] args) {
        Artikel fles = new Artikel("fles", 5, .2);
        Artikel doos = new Artikel("doos", 2, 0);
        Artikel zak = new Artikel("zak", 1, .1);
        Artikel zak2 = new Artikel("zak", 1, .1);

        Klant jan = new Klant("Jan");
        System.out.println(fles);
        System.out.println(doos);
        System.out.println(zak);

        jan.voegArtikelToe(fles);
        jan.voegArtikelToe(doos);
        jan.voegArtikelToe(zak);
        jan.voegArtikelToe(zak2);

        System.out.println(jan);
        jan.drukAlleArtikelsKlant();

        jan.verwijderArtikelZonderKorting();
        jan.drukAlleArtikelsKlant();

    }
    // Maak klant
    // Gebruik de 2 functies
}
