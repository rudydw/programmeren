package lussen;

import javax.swing.*;

// Tel de cijfers van een getal op.
// Voor getal 4578 is dat 4+5+7+8 = 24
public class Oef6 {
    public static void main(String[] args) {
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in:"));
        int restwaarde = getal / 10;
        int som = getal % 10;
        while (restwaarde > 0) {
            som += restwaarde % 10;
            restwaarde = restwaarde / 10;
        }
        System.out.println("De som van de cijfers in " + getal + " is " + som);
    }
}
