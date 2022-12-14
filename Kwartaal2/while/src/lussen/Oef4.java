package lussen;
// Lees een getal in. Bepaal of dit getal een priemgetal is.
// Je kan hiervoor een while-lus gebruiken die n deelt door alle getallen tussen 2 en n-1
// en test of de deling een geheel getal oplevert – gebruik hiervoor de modulo-operator %.

import javax.swing.*;

public class Oef4 {
    public static void main(String[] args) {
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in:"));
        boolean isPriem = true;
        int deler = 2;
        while (isPriem && deler <= getal / 2) {
                if (getal % deler == 0) {
                    isPriem = false;
                }
                deler++;
        }
        if (isPriem) {
            System.out.println(getal + " is een priemgetal");
        } else {
            System.out.println(getal + " is NIET een priemgetal");
        }
    }
}
