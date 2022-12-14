package staticMethods;

import java.util.ArrayList;
import java.util.Arrays;
//    Schrijf een methode met signatuur public void printNamenAlfabetisch (String [ ] namen)
//    die een array van namen als parameter heeft en deze alfabetisch op het scherm afdrukt.
//    Zoek functies op die sorteren en een array afdrukken.
//    Maak ook een methode om het kortste woord te zoeken in de array en een methode om
//    het langste woord te zoeken in de array. Beide functies returnen een arrayList van
//    1 of meerdere woorden (bij gelijke lengte).
//    Maak nu ook een method die een arraylist returnt waarin je elk uniek woord
//    en het aantal keren dat dit voorkomt, plaatst.
//    Tip : maak eerst een klasse aan met als private variabelen: -woord -aantalKeer

public class Oef7 {
    public static void main(String[] args) {
        String[] s = {"Luk", "Jos", "Rudy", "Jacky", "John", "Jefke"};
        String zin = "Maak ook een methode om het kortste woord te zoeken in de array en een methode om het langste " +
                "woord te zoeken in de array. Beide functies returnen een arrayList van " +
                "1 of meerdere woorden (bij gelijke lengte).";
        System.out.println(Arrays.toString(s));
        printNamenAlfabetisch(s);

        System.out.println("Kortste woord(en) : " + kortsteWoord(s).toString());
        System.out.println("Langste woord(en) : " + langsteWoord(s).toString());

        System.out.println("Kortste woord(en) : " + kortsteWoord(zin.split(" ")).toString());
        System.out.println("Langste woord(en) : " + langsteWoord(zin.split(" ")).toString());

        System.out.println(woordIncidentie(zin.toLowerCase()));
        for (Hulp hulp : woordIncidentie(zin.toLowerCase())) {
            System.out.println(hulp.getWoord() + ": " + hulp.getTeller());
        }
    }

    public static void printNamenAlfabetisch(String[] namen) {
        Arrays.sort(namen);
        System.out.println(Arrays.toString(namen));
    }

    public static ArrayList<String> kortsteWoord(String[] woorden) {
        ArrayList<String> kortsteWoorden = new ArrayList<>();
        int kortste = woorden[0].length();
        for (String woord : woorden) {
            int lengte = woord.length();
            if (lengte < kortste) {
                kortsteWoorden.clear();
                kortste = lengte;
                kortsteWoorden.add(woord);
            } else if (lengte == kortste) {
                kortsteWoorden.add(woord);
            }
        }
        return kortsteWoorden;
    }

    public static ArrayList<String> langsteWoord(String[] woorden) {
        ArrayList<String> langsteWoorden = new ArrayList<>();
        int langste = Integer.MIN_VALUE;
        for (String woord : woorden) {
            int lengte = woord.length();
            if (lengte > langste) {
                langsteWoorden.clear();
                langste = lengte;
                langsteWoorden.add(woord);
            } else if (lengte == langste) {
                langsteWoorden.add(woord);
            }
        }
        return langsteWoorden;
    }

    public static ArrayList<Hulp> woordIncidentie(String zin) {
        String[] woorden = zin.split("[ ,;.:/?!()]");
        ArrayList<String> woordenLijst = new ArrayList<>();
        ArrayList<Hulp> hulpLijst = new ArrayList<>();
        for (String woord : woorden) {
            if (!woord.isEmpty()) {
                woordenLijst.add(woord);
            }
        }
        System.out.println(woordenLijst);
        while (woordenLijst.size() > 0) {
            String woord = woordenLijst.get(0);
            Hulp hulp = new Hulp(woord, 1);
            woordenLijst.remove(0);
            int index = woordenLijst.indexOf(woord);
            while (index != -1) {
                hulp.setTeller(hulp.getTeller() + 1);
                woordenLijst.remove(index);
                index = woordenLijst.indexOf(woord);
            }
            hulpLijst.add(hulp);
        }
        return hulpLijst;
    }
}
