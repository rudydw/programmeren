package oefening2;

public class Artikel {
    private String omschrijving;
    private double prijs, korting;

    public Artikel(String omschrijving, double prijs, double korting) {
        this.omschrijving = omschrijving;
        this.prijs = prijs;
        this.korting = korting;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getKorting() {
        return korting;
    }

    public void setKorting(double korting) {
        this.korting = korting;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "omschrijving='" + omschrijving + '\'' +
                ", prijs=" + prijs +
                ", korting=" + korting +
                '}';
    }
}
