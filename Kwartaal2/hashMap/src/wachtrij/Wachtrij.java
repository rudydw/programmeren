package wachtrij;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Wachtrij {
    enum Toestand {
        WACHTEND, BEDIEND
    }
    private HashMap<String, Toestand> wachtrij = new HashMap<>();

    public Wachtrij() {
    }

    public void zetInWachtrij(String naam) {
        this.wachtrij.put(naam, Toestand.WACHTEND);
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
         this.wachtrij.put(naam, Toestand.BEDIEND);
     }

     public void aantalWachtendBediend() {
        int wachtend = 0;
        int bediend = 0;
         for (String naam : this.wachtrij.keySet()) {
             if (this.wachtrij.get(naam) == Toestand.BEDIEND) {
                 bediend++;
             } else {
                 wachtend++;
             }
         }
         System.out.println("Wachtend: " + wachtend);
         System.out.println("Bediend: " + bediend);
     }

     public void verwijderBediend() {
         Iterator it = wachtrij.entrySet().iterator();
         while (it.hasNext()) {
             Map.Entry pair = (Map.Entry) it.next();
             System.out.println(pair.getKey() + " = " + pair.getValue());
             if (pair.getValue().equals(Toestand.BEDIEND.name())) {
                 it.remove();
             }
         }
     }
}
