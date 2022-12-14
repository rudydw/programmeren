package telefoonboek;

import java.util.HashMap;

public class TestTelefoonboek {
    public static void main(String[] args) {
        Telefoonboek telefoonboek = new Telefoonboek();

        System.out.println(telefoonboek.telContacten());
        System.out.println("Jan: " + telefoonboek.zoekTelefoonnummerOp("Jan"));
        System.out.println("Jos: " + telefoonboek.zoekTelefoonnummerOp("Jos"));
        System.out.println("José: " + telefoonboek.zoekTelefoonnummerOp("José"));

        telefoonboek.voegContactToe("Rudy", "987");
        System.out.println(telefoonboek.telContacten());

        System.out.println("Jos: " + telefoonboek.komtVoor("Jos"));
        System.out.println("José: " + telefoonboek.komtVoor("José"));

        telefoonboek.alleNamen();
    }
}
