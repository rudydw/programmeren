package lussen;
//Lees drie getallen in.
//        eerste getal = het spaargeld dat je op een rekening zet. Voorbeeld = 1000 euro
//        tweede getal = de verkregen rentevoet. Voorbeeld = 0.01
//        derde getal = wanneer je dit doel bereikt hebt, wil je het geld afhalen.
//        Genereer onderstaand overzicht en toon in een boodschap hoeveel jaren je moet sparen.
//        Gebruik onderstaande startcode.

import javax.swing.*;

public class Oef7 {
    public static void main(String[] args) {
        String spaarbedragString = JOptionPane.showInputDialog("Hoeveel wil je sparen?");
        String rentevoetString = JOptionPane.showInputDialog("Welke rentevoet heb je verkregen?");
        String doelString = JOptionPane.showInputDialog("Hoeveel moet je spaargeld opbrengen?");
        double spaarbedrag = Double.parseDouble(spaarbedragString);
        double rentevoet = Double.parseDouble(rentevoetString);
        double doel = Double.parseDouble(doelString);

        int jaren = 1;
        double gespaard = spaarbedrag;
        System.out.println("jaar " + jaren + ": " + gespaard);

        while (gespaard < doel) {
            gespaard *= (1 + rentevoet);
            jaren++;
            System.out.println("jaar " + jaren + ": " + gespaard);
        }
        System.out.println("Voor een bedrag van " + doel + " moet je je spaargeld " + jaren + " jaren laten staan");
    }
}