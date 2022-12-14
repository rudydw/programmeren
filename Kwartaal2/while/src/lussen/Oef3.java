package lussen;

import javax.swing.*;

public class Oef3 {
    public static void main(String[] args) {
        int start = Integer.parseInt(JOptionPane.showInputDialog("Geef startwaarde:"));
        int eind = Integer.parseInt((JOptionPane.showInputDialog("Geef eindwaarde:")));
        while (eind - start < 50) {
            eind = Integer.parseInt((JOptionPane.showInputDialog("Eindwaarde dient minstens 50 groter te zijn:")));
        }
        System.out.println(start + "\t" + eind);
        int i = 1;
        while (start * i <= eind) {
            System.out.println(start + " * " + i + " = " + start * i);
            i++;
        }
    }
}