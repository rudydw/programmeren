package wachtrij;

import java.util.HashMap;

public class Wachtrij {
    enum Klant {
        WACHTEND, BEDIEND
    }
    private HashMap<String, Klant> wachtrij = new HashMap<>();

    public Wachtrij() {
    }

    public void zetInWachtrij(String naam) {
        this.wachtrij.put(naam, Klant.WACHTEND);
    }

    public void overzicht() {
        if (this.wachtrij.isEmpty()) {
            System.out.println("Er is niemand");
        } else {
            for (String naam : this.wachtrij.keySet()) {
                System.out.println(naam + ": " + this.wachtrij.get(naam));
            }
        }
     }

     public void wijzigNaarBediend(String naam) {
         this.wachtrij.put(naam, Klant.BEDIEND);
     }

     public void aantalWachtendBediend() {
        int wachtend = 0;
        int bediend = 0;
         for (String naam : this.wachtrij.keySet()) {
             if (this.wachtrij.get(naam) == Klant.BEDIEND) {
                 bediend++;
             } else {
                 wachtend++;
             }
         }
         System.out.println("Wachtend: " + wachtend);
         System.out.println("Bediend: " + bediend);
     }
}
