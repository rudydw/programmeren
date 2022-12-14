package oefening2;

public class Klant {
    private String naam, voornaam, email;

    public Klant(String naam, String voornaam, String email) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.email = email;
    }

    public double koop(Artikel a) {
        return a.getPrijs();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", voornaam='" + voornaam + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
