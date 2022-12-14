package voorbeeldIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCars {
    public static void main(String[] args) {
       //maak een collectie
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Iterator<String> it = cars.iterator();
        //de functie iterator() maakt een iterator voor de ArrayList cars
        while (it.hasNext())
        //zolang er nog een volgende element in de ArrayList is
        {
            System.out.println(it.next());
            //iterator haalt het volgende element op. De eerste keer haalt
            //hij het eerste element op.
        }
        //gekende code
        for (String s : cars)
        {
            System.out.println(s);
        }
    }
}
