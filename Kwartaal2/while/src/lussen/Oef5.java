package lussen;

import javax.swing.*;

//Lees 2 gehele getallen in en bepaal de grootste gemene deler. De GGD is het grootste getal waar de
//        gegeven getallen door gedeeld kunnen worden.
//        Voorbeeld:
//        de ggd van 8 en 12 is 4
//        het Algoritme van Euclides.
//        Werkwijze:
//        Aanname : getal1 > getal2
//        Deel eerste getal door het tweede. Werk verder met de rest en het kleinste getal zolang rest > 0.
//        Vb: 12 en 8 hebben als ggd 4.
//        12 en 8:  12/8 -> rest = 4, kleinste = 8
//        8 en 4: 8/4 -> rest = 0, kleinste = 4
//        4 en 0: einde -> ggd = 4
public class Oef5 {
    public static void main(String[] args) {
        int grootste = Integer.parseInt(JOptionPane.showInputDialog("Grootste getal"));
        int kleinste = Integer.parseInt(JOptionPane.showInputDialog("Kleinste getal"));
        String output = "de ggd van " + grootste + " en " + kleinste + " is ";
        int rest = grootste % kleinste;
        while (rest != 0) {
            grootste = kleinste;
            kleinste = rest;
            rest = grootste % kleinste;
        }
        System.out.println(output + kleinste);
    }
}
