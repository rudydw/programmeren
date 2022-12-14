package voorbeelden;

import javax.swing.*;

public class Voorbeeld3 {
    private int[] lijstGetallen = new int[2];

    public Voorbeeld3() {
        for (int i = 0; i < 2; i++) {
            lijstGetallen[i] =
                    Integer.parseInt(JOptionPane.showInputDialog("Geef getal"));
        }
        try {
            System.out.println(lijstGetallen[0] / lijstGetallen[1]);
        } catch (NumberFormatException e) {
            System.out.println("Geen getal");
        } catch (ArithmeticException e) {
            System.out.println("Deling door 0 is niet mogelijk");;
        }
    }

}
