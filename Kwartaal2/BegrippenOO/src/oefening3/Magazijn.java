package oefening3;

import java.util.ArrayList;
import java.util.Iterator;

public class Magazijn {
    private ArrayList<Product> lijst = new ArrayList<>();
    private String postcode;

    public Magazijn(String postcode) {
        this.postcode = postcode;
    }

    public void add(Product p) {
        lijst.add(p);
    }

    public void remove(double prijs) {
        for (Product p : lijst) {
            if (p.getPrijs() < 5)
                lijst.remove(p);
        }
    }

    public void toonProducten() {
        Iterator<Product> it = lijst.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getOmschrijving());
            Product p = it.next();
            System.out.println(p.getOmschrijving() + " kost " + p.getPrijs());
        }
    }


}
