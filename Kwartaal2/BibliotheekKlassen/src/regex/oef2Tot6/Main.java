package regex.oef2Tot6;

public class Main {
    public static void main(String[] args) {
//        System.out.println(schrapLeestekensSpaties("Jan, Piet en Tom gaan naar school."));
//        System.out.println(isPalindroom("Lepel"));
//        printWoorden("Het is WK");

        System.out.println(printGemiddeldAantalLetters("Schrijf een methode met signatuur public double"));
    }

    public static String schrapLeestekensSpaties(String zin) {
//    Schrijf een methode met signatuur public String schrapLeestekensSpaties (String zin)
//    die een String zin als parameter heeft en deze retourneert zonder leestekens en spaties.
        String zinloos = zin.replaceAll("[^a-zA-Z]", "");
        return zinloos;
    }

    public static boolean isPalindroom (String woord) {
//(werk met charAt())
//    Schrijf een methode met signatuur public boolean isPalindroom (String woord) die een woord
//    als parameter heeft en controleert of dit woord een palindoom is.
//    Palindromen zijn bijvoorbeeld: “pop”, “lepel”, “meetsysteem”, “Hannah”, …}
        int lengte = woord.length();
        woord = woord.toLowerCase();
        for (int i = 0; i < lengte / 2; i++) {
            if (woord.charAt(i) != woord.charAt(lengte-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void printWoorden (String zin) {
//    Schrijf een methode met signatuur public void printWoorden (String zin) die een String zin
//    als parameter heeft en elk woord afdrukt op een nieuwe regel. Een spatie geldt als het einde van een woord.
//    Het is WK
//    Het
//    is
//    WK
        String[] gesplit;
        gesplit = zin.split(" ");
        for (String word : gesplit) {
            System.out.println(word);
        }
        System.out.println();

//    Eenvoudige methode:
        System.out.println(zin.replaceAll(" ", "\n"));
    }

    public static double printGemiddeldAantalLetters (String zin) {
//    Schrijf een methode met signatuur public double printGemiddeldAantalLetters (String [ ] woorden)
//    die een array van woorden als parameter heeft en het gemiddelde aantal letters per woord retourneert.
        String[] woorden = zin.split(" ");
        double som = 0;
        for(String word : woorden) {
            som += word.length();
        }
        return som / woorden.length;
    }
}