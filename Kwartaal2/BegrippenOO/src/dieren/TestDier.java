package dieren;

public class TestDier {
    public static void main(String[] args) {
        Dier a = new Dier("Helga");
        Dier b = new Hond("Bassie");
//        Dier c = new Kat(true, "pussy");
//        Dier k = new Kip("chicky");
//        Dier e = new
        a.maakGeluid();
        b.maakGeluid();

        Dier[] dieren = new Dier[5];

/*
        a is een object van de klasse Dier en dus wordt de maakGeluid()-functie
        van de klasse Dier uitgevoerd.
*/

        Hond h = new Hond("Fluffi");

/*
        h is een object van de klasse Hond en dus wordt eerst gezocht in de klasse Hond
        of daar een maakGeluid()-functie is, die kan worden uitgevoerd.
        Is dat niet het geval, dan wordt deze functie opgezocht in de superklasse Dier.
        Dit mechanisme noemt men polymorfisme.
*/

        h.maakGeluid();

/*
        maakGeluid() is een functie die in de klasse Hond staat.
*/

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(h);

        Kat k = new Kat(true, "Oscar");
//        System.out.println(k);

/*
        elke klasse erft van de klasse Object
*/
        k.maakGeluid();

/*
        wat is het eigenlijke nut hiervan?
        Je kan classes en functies maken die met een Dier werken
        Deze classes/functies blijven werken voor subclasses Hond en Kat en ...
*/

//        DierenShowroom showroom = new DierenShowroom();
//        showroom.show(a);
//        showroom.show(b);

    }
}
