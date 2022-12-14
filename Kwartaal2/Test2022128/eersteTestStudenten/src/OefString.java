import java.util.ArrayList;

public class OefString {
    private String s = "Ik ben ik, en jij bent jij!";

    public String nieuw(String tweede) {
        return s.substring(0, 1) + tweede.substring(tweede.length() - 1, tweede.length());
    }

    public void veranderZin() {
        System.out.println(returnVeranderZin());
    }

    public String returnVeranderZin() {
        return s.toLowerCase().replaceAll("[.!?,]", "");
    }

    public String dubbels() {
        String[] woorden;
        woorden = returnVeranderZin().split(" ");
        for (int i = woorden.length - 1; i >= 0; i--) {
            boolean foundDubbel = false;
            for (int j = 0; j < i && !foundDubbel; j++) {
                if (woorden[i].equals(woorden[j])) {
                    woorden[i] = "";
                    foundDubbel = true;
                }

            }

        }
        String s = "";
        for (int i = 0; i < woorden.length; i++) {
            if (!woorden[i].equals("")) {
                s += woorden[i] + " ";
            }
        }
        return s;
    }

    @Override
    public String toString() {
        return "OefString{" +
                "s='" + s + '\'' +
                '}';
    }
}
