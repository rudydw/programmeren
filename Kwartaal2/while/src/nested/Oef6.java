package nested;

import javax.swing.*;

// Bereken de faculteit van een getal. De gebruiker kan telkens weer een nieuw getal opgeven. Het
// programma eindigt wanneer de gebruiker een negatief getal of 0 ingeeft.
// De faculteit van een getal is het getal vermenigvuldigd met alle getallen kleiner dan zichzelf,
// uitgezonderd 0.
// De faculteit van 4, nl 4! = 4*3*2*1 = 24
public class Oef6 {
    public static void main(String[] args) {
        int getal = Integer.parseInt(JOptionPane.showInputDialog
                ("Geef getal waarvan je de faculteit wil kennen:"));
        while (getal > 0) {
            int faculteit = 1;
            for (int i = 2; i <= getal; i++) {
                faculteit *= i;
            }
            System.out.println("De faculteit van " + getal + " is " + faculteit);
            getal = Integer.parseInt(JOptionPane.showInputDialog
                    ("Geef een getal waarvan je de faculteit wil kennen:"));
        }
    }
}
