package voorbeeldInterface;

public class Koe implements Dier {

    @Override
    public void animalSound() {
        System.out.println("Boe");
    }

    @Override
    public void sleep() {
        System.out.println("zzzz beeukk");
    }
}
