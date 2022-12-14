package random.oef4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Raadspel {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Je score is " + speelRaadspel());
        spelen();
    }

    public static int speelRaadspel() {
        Random r = new Random();
        int teRaden = r.nextInt(1, 7);
        System.out.println(teRaden);
        int score = 6;
        int beurten = 1;
        while (beurten <= 3) {
            int geraden = Integer.parseInt(JOptionPane.showInputDialog("Raad het getal van 1 tot 6."));
            if (geraden < 1 || geraden > 6) {
                JOptionPane.showMessageDialog(null, "Je dient een getal te kiezen van 1 tot 6!");
            } else {
                beurten++;
                if (geraden == teRaden) {
                    return score;
                } else {
                    score--;
                }
            }
        }
        return 0;
    }

    public static void spelen() {
        ArrayList<Integer> scorelijst = new ArrayList<>();
        ArrayList<Integer> max = new ArrayList<>();
        boolean stop = false;
        int spel = 1;
        int score = speelRaadspel();
        int totaalScore = score;
        scorelijst.add(score);
        highscore(max, score, spel);
        Object[] options = {"Ja", "Neen"};
        JOptionPane.showMessageDialog(null, "Je score is " + score);
        while (spel <= 10 && !stop) {
            int jaNee = JOptionPane.showOptionDialog(null,
                    "Wil je nog eens raden?", "Nieuw spel",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);
            System.out.println(jaNee);
            if (jaNee == 0) { // indien JA
                spel++;
                score = speelRaadspel();
                totaalScore += score;
                scorelijst.add(score);
                highscore(max, score, spel);
                JOptionPane.showMessageDialog(null, "Je score is " + score);
            } else {
                stop = true;
            }
        }
        StringBuilder resultaat = new StringBuilder();
        resultaat.append("Je behaalde in totaal *** " + totaalScore + " *** punten\n");
        int b = 1;
        for (int s : scorelijst) {
            resultaat.append("beurt " + b + ": score " + s + "\n");
            b++;
        }
        resultaat.append("de beurten met de hoogste score zijn:\n");
        for (int hs : max) {
            resultaat.append(hs + ", ");
        }
        JOptionPane.showMessageDialog(null, resultaat);
    }

    public static void highscore(ArrayList<Integer> max, int score, int spel) {
        if (score == 6) {
            max.add(spel);
        }
    }
}