package extraOef;

//    Vraag aan de gebruiker uit hoeveel rijen je kerstboom moet bestaan (zonder de stam)?
//    De stam neemt qua breedte 1 derde in van de onderkant van de boom
//    De stam is even hoog als 1 vierde van de kruin.
//    Maak een programma dat zich automatisch aanpast aan de vraag van de gebruiker.

import javax.swing.*;

public class Oef4 {
    public static void main(String[] args) {
        int hoogte = Integer.parseInt(JOptionPane.showInputDialog("Hoe breed wil je je ruit?"));
        for (int rij = 1; rij <= hoogte; rij++) {
            for (int kol = 0; kol < (hoogte - rij); kol++) {
                System.out.print(" ");
            }
            for (int kol = (hoogte - rij); kol < hoogte + rij - 1; kol++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int stambreedte = (int) Math.floor((double) (hoogte * 2 - 1) / 3);
        stambreedte = (stambreedte % 2 == 0) ? stambreedte + 1 : stambreedte;
        int stamhoogte = (int) Math.floor((double) hoogte / 4);
        for (int rij = 1; rij <= stamhoogte; rij++) {
            for (int kol = 0; kol < hoogte - stambreedte / 2 - 1; kol++) {
                System.out.print(" ");
            }
            for (int kol = hoogte * 2 - stambreedte; kol < hoogte * 2; kol++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(stambreedte + " " + stamhoogte);
    }
}
