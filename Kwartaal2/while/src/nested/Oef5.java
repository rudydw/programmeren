package nested;

// 5. Bereken het gemiddelde van een aantal komma-getallen.
// Van welk aantal het gemiddelde berekend moet worden, wordt eerst ingelezen, en hierna de getallen zelf.
// De gebruiker moet telkens opnieuw een aantal kunnen ingeven met een reeks getallen, waarna het
// gemiddelde wordt berekend.
// Het programma eindigt wanneer 0 of een negatief getal als aantal wordt opgegeven.
// Maak gebruik van geneste lussen. Kies zelf dewelke je gebruikt.

import javax.swing.*;
import java.util.ArrayList;

public class Oef5 {
    public static void main(String[] args) {
//        ArrayList<Double> lijst = new ArrayList<>();
        int aantal = Integer.parseInt(JOptionPane.showInputDialog
                ("Hoeveel getallen wil je ingeven?\nBeëindig met een getal <= 0"));
        double som = 0;
        StringBuilder resutaat = new StringBuilder();
        while (aantal > 0) {
            som = 0;
            resutaat.append("Het gemiddelde van ");
            for (int i = 1; i <= aantal; i++) {
                double getal = Double.parseDouble(JOptionPane.showInputDialog
                        ("Getal " + i + " van " + aantal));
                som += getal;
                if (i < aantal - 1) {
                    resutaat.append(getal).append(", ");
                } else if (i == aantal - 1) {
                    resutaat.append(getal).append(" en ");
                } else {
                    resutaat.append(getal).append(" ");
            }
        }
        System.out.println();
        System.out.println(resutaat + "is " + som / aantal);
        resutaat.delete(0, resutaat.length());

        aantal = Integer.parseInt(JOptionPane.showInputDialog
                ("Hoeveel getallen wil je ingeven?\nBeëindig met een getal <= 0"));
    }
    }
}
