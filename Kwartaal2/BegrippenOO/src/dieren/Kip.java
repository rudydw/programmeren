package dieren;

class Kip extends Dier {

    public Kip(String naam) {
        super(naam);
    }

    @Override
    public void maakGeluid() {
        System.out.println("kot kot kot");
    }

    @Override
    public String toString() {
        return "Kip: " + super.toString();
    }
}
