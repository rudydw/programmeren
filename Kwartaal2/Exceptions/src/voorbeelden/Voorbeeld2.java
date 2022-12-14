package voorbeelden;

import javax.swing.*;

public class Voorbeeld2 {
    private int[] lijstGetallen = new int[5];

    public Voorbeeld2() {
        for (int i = 0; i < 5; i++) {
            try {

                lijstGetallen[i] =
                        Integer.parseInt(JOptionPane.showInputDialog("Geef getal"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "je moet een getal ingeven");
                i--;
            }
        }
    }

    public void drukAf() {
        for (int i = 0; i <= 4; i++) {
            System.out.println(lijstGetallen[i]);
        }
    }
}
