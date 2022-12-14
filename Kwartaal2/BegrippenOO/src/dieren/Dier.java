package dieren;

//maak een superklasse Dier
public class Dier {
    private String naam;

    public Dier(String naam) {
        this.naam = naam;
    }

    public void maakGeluid() {
        System.out.println("Het dier maakt geluid");
    }

    public String verplaats() {
        return "verplaatst zich";
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return "Dier{" +
                "naam='" + naam + '\'' +
                '}';
    }
}
