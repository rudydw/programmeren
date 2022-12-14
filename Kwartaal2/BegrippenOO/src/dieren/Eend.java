package dieren;

class Eend extends Dier {

    public Eend(String naam) {
        super(naam);
    }

    @Override
    public void maakGeluid() {
        System.out.println("kot kot kot");
    }

    @Override
    public String verplaats() {
        return getNaam() + " waggelt, vliegt of zwemt";
    }

    @Override
    public String toString() {
        return "Kip: " + super.toString();
    }
}
