package staticMethods;

import java.util.regex.Pattern;

public class GeldigRekeningNummer {
//    Maak een functie die true of false returnt wanneer het bankrekeningnr geldig is.
//    public boolean isGeldigRekeningNummer(String reknr)
//    format: BE00 0000 0000000 00
//    gebruik matches-functie //Wanneer je het getal bestaande uit 11 cijfers na
//    BE00 deelt door 97, is de rest = aan de laatste twee cijfers.
//    Tips. Gebruik substring Gebruik de functies matches om na te gaan of de
//    bankrekeningnummer in het juiste formaat staat.

//    Pattern.matches("BE\\d{11}", );

    public static void main(String[] args) {
        String rekNr = "BE12-1234/1234.567 33";
        System.out.println(rekNr + " is " + isGeldigRekeningNummer(rekNr));
    }

    public static boolean isGeldigRekeningNummer(String reknr) {
        reknr = reknr.replaceAll("[ -/.]","");
        if (!Pattern.matches("BE\\d{15}", reknr.toUpperCase())) {
            System.out.println("Het rekeningnummer is niet correct");
            return false;
        }
//        if (reknr.length() != 17) {
//            System.out.println("Het aantal karakters in het rekeningnummer is niet correct");
//            return false;
//        }
//        if (!reknr.toUpperCase().startsWith("BE")) {
//            System.out.println("Het rekeningnummer moet beginnen met 'BE'");
//            return false;
//        }
        long cijfers = Long.parseLong(reknr.substring(4, 15));
        int check = Integer.parseInt(reknr.substring(15, 17));
        System.out.println(cijfers);
        System.out.println(check);
        System.out.println(cijfers % 97);
        return cijfers % 97 == check;
    }
}
