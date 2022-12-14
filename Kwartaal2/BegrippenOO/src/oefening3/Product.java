package oefening3;

public class Product {
    private double prijs;
    private String omschrijving;

    public Product(double prijs, String omschrijving) {
        this.prijs = prijs;
        this.omschrijving = omschrijving;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prijs=" + prijs +
                ", omschrijving='" + omschrijving + '\'' +
                '}';
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }
}
