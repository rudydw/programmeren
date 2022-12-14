package dieren;

/*
Maak een subklasse Hond aan die erft van Dier
*/
class Hond extends Dier {

    /*
        genereer de constructor
        deze constructor roept eerst met super de constructor aan van de
        superklasse Dier
        Aangezien naam een private variabele is van de klasse Dier,
        kan deze constructor naam niet rechtstreeks invullen.
    */
    public Hond(String naam) {
    /*
        roept de constructor van de superklasse op om de private var naam
         in te vullen
    */
        super(naam);

    }

    /*
        overschrijf de inhoud van maakGeluid met gepaste inhoud
        voor de klasse Hond.
        wanneer je letterlijk dezelfde signatuur gebruikt als die van de
        superklasse, dan spreken we van overriding.
    */
    @Override
    public void maakGeluid() {
        System.out.println("Waf waf woef");
    }
/*
    We zagen reeds les 1 de toString functie waarmee we makkelijk de
    inhoud van een object kunnen bekijken.
    Ook hier spreken we van overriding omdat elke klasse erft van de
    superklasse Object
    Object bevat reeds de toString() functie, die we in elke klasse
    dus kunnen overschrijven.
    het is nuttig om de annotatie @override te laten staan,
    waardoor je onmiddellijk ziet dat het hier overriding betreft.
*/

    @Override
    public String verplaats() {
        return getNaam() + " wandelt aan de leiband";
    }

    @Override
    public String toString() {
        return "Hond: " + super.toString();
    }
/*
    deze functie roept de toString() functie op van de superklasse en
    plakt de resultaats-string aan de gegeneerde String
    Let op : super.toString()+ wordt niet gegenereerd, maar moet je er
    zelf bij typen.
*/
}