package oefening1;

import java.util.ArrayList;

public class OverzichtPersonen {
    private ArrayList<Persoon> lijst = new ArrayList<>();

    public OverzichtPersonen() {
        this.lijst = new ArrayList<Persoon>();
    }

    public void voegToeAanLijst(Persoon persoon) {
        this.lijst.add(persoon);
    }

    public ArrayList<Persoon> getLijst() {
        return lijst;
    }

    public void setLijst(ArrayList<Persoon> lijst) {
        this.lijst = lijst;
    }

    @Override
    public String toString() {
        return "OverzichtPersonen{" +
                "lijst=" + lijst +
                '}';
    }
}
