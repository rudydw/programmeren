package oefening1;

public class TestOverzichtPersonen {
    public static void main(String[] args) {
        Persoon danny = new Persoon("Peeters", "Danny", "2800");
        System.out.println(danny);
        Bediende jan = new Bediende("Janssens", "Jan", "3000", 5000);
        System.out.println(jan);
        jan.verhoogSal(100);
        System.out.println(jan);


        OverzichtPersonen overzichtPersonen = new OverzichtPersonen();
        overzichtPersonen.voegToeAanLijst(danny);
        overzichtPersonen.voegToeAanLijst(jan);
        System.out.println(overzichtPersonen);


    }
}
