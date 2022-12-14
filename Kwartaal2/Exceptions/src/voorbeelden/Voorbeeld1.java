package voorbeelden;

import javax.swing.*;

public class Voorbeeld1 {
    private int[] lijstGetallen = new int[5];

    public Voorbeeld1() {
        for (int i = 0; i < 5; i++) {
            lijstGetallen[i] =
                    Integer.parseInt(JOptionPane.showInputDialog("Geef getal"));
        }
    }

    public void drukAf() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(lijstGetallen[i]);
        }
    }

}
