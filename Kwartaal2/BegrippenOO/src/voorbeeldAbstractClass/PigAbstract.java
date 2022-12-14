package voorbeeldAbstractClass;

abstract class PigAbstract implements PigInterface {
    private String soort;

    public PigAbstract(String soort) {
        this.soort = soort;
    }

    public void color() {
        System.out.println("Pink");
    }

    abstract public void sleep();
    abstract public void animalSound();
}
