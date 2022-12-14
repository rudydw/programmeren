package voorbeeldAbstractClass;

public class Pig extends PigAbstract {
    // Erft de color() method van de  PigAbstract Class
    private String roepNaam;

    public Pig(String soort, String roepNaam) {
        super(soort);
        this.roepNaam = roepNaam;
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
