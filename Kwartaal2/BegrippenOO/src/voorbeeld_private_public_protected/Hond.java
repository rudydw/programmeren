package voorbeeld_private_public_protected;

public class Hond extends Dier {
    public Hond(String privateNaam, String publicNaam) {
        super(privateNaam, publicNaam);
    }

    void functieInSubclass() {
        System.out.println(publicNaam);
        protectedFunction();
    }
}
