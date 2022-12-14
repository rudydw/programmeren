package extraOef;

import javax.swing.*;

// Terug in het CLB, bij de intelligentietestjes.
// Schrijf een lus die de volgende reeks (-2, +1) genereert.
// Vraag aan de gebruiker met JOptionPane 2 zaken op.
//    - begingetal
//    - uit hoeveel getallen moet de reeks bestaan?
public class Oef5 {
    public static void main(String[] args) {
        int begin = 0, aantal = 0;
        boolean errorFlag = true;
        while (errorFlag) {
            try {
                begin = Integer.parseInt(JOptionPane.showInputDialog("Geef het begingetal van de reeks."));
                errorFlag = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Je dient een geheel getal in te vullen.");
            }
        }
        errorFlag = true;
        while (errorFlag) {
            try {
                aantal = Integer.parseInt(JOptionPane.showInputDialog("Hoe lang moet de reeks zijn?"));
                errorFlag = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Je dient een geheel getal in te vullen.");
            }
        }
        System.out.print(begin + " ");
        int i = 1;
        while (i < aantal) {
            System.out.print(begin - 2 + " ");
            i++;
            if (i < aantal) {
                System.out.print(begin - 1 + " ");
                i++;
            }
            begin--;
        }
        System.out.println();
    }
}
