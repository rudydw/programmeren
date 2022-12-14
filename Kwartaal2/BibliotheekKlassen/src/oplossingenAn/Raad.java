package oplossingenAn;

import javax.swing.*;
import java.util.Random;

public class Raad {
    public int genereerGetalMinMax(int min, int max) {
// 5 en 10
        Random r = new Random();
//        for (int i = 0; i < 20; i++) {
//            System.out.println(r.nextInt(min,max+1));
//        }
        return r.nextInt(min, max + 1);
    }

    public int speelRaadspel() {
        int score = 0;
        int genereerGetal = genereerGetalMinMax(1, 6);
        System.out.println("te raden " + genereerGetal);
        boolean nietgeraden = true;
        int teller = 0;
        for (int i = 0; i < 3 && nietgeraden; i++) {
            int gokGetal = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal van 1 tot 6"));
            teller++;
            if (genereerGetal == gokGetal) {
                nietgeraden = false;
            }
        }
        if (teller == 3 && !nietgeraden) {
            return 4;
        } else if (teller == 2) {
            return 5;
        } else if (teller == 1) {

            return 6;
        } else {
            return 0;
        }
    }
    public void spelen()
    {
        String antwoord = "JA";
        for (int i = 0; i < 10 && antwoord.equals("JA"); i++) {

            speelRaadspel();
            antwoord = JOptionPane.showInputDialog("Wil je het raadspel spelen?");

        }

    }
}
