package voorbeeldAbstractClass;

public class TestPig {
    public static void main(String[] args) {
        Pig myPig = new Pig("Knobbelzwijn", "Bollie");  // Create a Pig object
        myPig.color();
        myPig.animalSound();
        myPig.sleep();
        PigAbstract knorrie = new Pig("Wroetzwijn", "Knorrie");

    }

}
