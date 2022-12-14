package oefening1;

public class Persoon {
    private String naam, voornaam, postcode;

    public Persoon(String naam, String voornaam, String postcode) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.postcode = postcode;
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", voornaam='" + voornaam + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
