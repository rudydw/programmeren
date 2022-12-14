package extraOef;

//    Definieer een array van 10 elementen.
//    Verschuif de inhoud van de array 2 posities naar (rechts) links.
//    Voorbeeld.
//    De inhoud is {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//    Na verschuiving
//    {3, 4, 5, 6, 7, 8, 9, 10, 1, 2}

import javax.swing.*;
import java.util.Arrays;

public class Oef7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int lengte = arr.length;
//        int getal1 = arr[0];
//        int getal2 = arr[1];
//        for (int i = 2; i < lengte; i++) {
//            arr[i - 2] = arr[i];
//        }
//        arr[lengte - 2] = getal1;
//        arr[lengte - 1] = getal2;

        boolean errorFlag = true;
        int shifts = 0;
        while (errorFlag) {
            try {
                shifts = Integer.parseInt(JOptionPane.showInputDialog("Hoeveel plaatsen (1-9) wil je opschuiven?"));
                errorFlag = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vul een geheel getal in.");
            }
            if (! errorFlag && (shifts < 1 || shifts > 9)) {
                JOptionPane.showMessageDialog(null, "Vul een geheel getal in van 1 tot 9.");
                errorFlag = true;
            }
        }

        for (int i = 0; i < shifts; i++) {
            shiftLeft(arr, lengte);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void shiftLeft(int[] a, int l) {
        int getal = a[0];
        for (int i = 1; i < l; i++) {
            a[i - 1] = a[i];
        }
        a[l - 1] = getal;
    }
}
