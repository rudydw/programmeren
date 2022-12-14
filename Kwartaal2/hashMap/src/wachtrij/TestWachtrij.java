package wachtrij;

public class TestWachtrij {
    public static void main(String[] args) {
        Wachtrij wachtrij = new Wachtrij();

        wachtrij.zetInWachtrij("Jan");
        wachtrij.zetInWachtrij("Jos");
        wachtrij.zetInWachtrij("An");

        wachtrij.overzicht();

        wachtrij.wijzigNaarBediend("Jos");
        wachtrij.overzicht();
        System.out.println("-----------");
        wachtrij.aantalWachtendBediend();
        wachtrij.verwijderBediend();
        wachtrij.overzicht();

    }
}
