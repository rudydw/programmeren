import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Arrays;

public class OefArray {

    private int[] num_array = new int[5];

    @Override
    public String toString() {
        return "OefArray{" +
                "num_array=" + Arrays.toString(num_array) +
                '}';
    }

    public int inVullen() {
        int getal = 0;
        for (int i = 0; i < 5; i++) {
            while (getal % 10 != 0 || getal == 0) {
                try {
                    getal = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal dat deelbaar is door 10, behalve 0"));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Je mag enkel getallen invullen!");
                }
            }
            num_array[i] = getal;
            getal = 0;
        }

        getal = 0;
        for (int num : num_array) {
            getal += num;
        }
        return getal;
}
    public boolean isTien() {
       return num_array[0] == 10 || num_array[4] == 10;
    }
}
