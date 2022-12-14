package dieren;

public class Kat extends Dier {
    //private var. boolean gecastreerd
    private boolean gecastreerd;

    public Kat(boolean gecastreerd, String naam) {
        super(naam);
        this.gecastreerd = gecastreerd;
    }

    @Override
    public String toString() {
        return "Kat: " + super.toString() + " gecastreerd=" + gecastreerd ;
    }

    @Override
    public void maakGeluid() {
        System.out.println("miauw miauw");
    }
}
//maak een constructor
//getters en setters
//toString
//overriding van de maakGeluid()


