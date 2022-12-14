package extraOef;

//    Maak volgende ruit.
//    Vraag met JOptionPane hoeveel sterretjes de ruit moet bevatten op haar breedste punt.
//       *
//      ***
//     *****
//    *******
//     *****
//      ***
//       *

import javax.swing.*;
import java.lang.reflect.Array;

public class Oef3 {
    public static void main(String[] args) {
        StringBuilder lijn = new StringBuilder();
        int breedte = Integer.parseInt(JOptionPane.showInputDialog("Hoe breed wil je je ruit?"));
        for (int rij = 1; rij <= breedte; rij++) {
            for (int kol = 0; kol < Math.abs((breedte + 1) / 2 - rij); kol++) {
                lijn.append(" ");
            }
            for (int kol = Math.abs((breedte + 1) / 2 - rij); kol <breedte -  Math.abs(((breedte + 1) / 2 - rij)); kol++) {
                lijn.append("*");
            }
            System.out.println(lijn);
            lijn.delete(0, breedte);
        }

    }
}
