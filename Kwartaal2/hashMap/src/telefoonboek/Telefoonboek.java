package telefoonboek;

import java.util.HashMap;

public class Telefoonboek {
   private HashMap<String, String> contacten = new HashMap<>();

    public Telefoonboek() {
        contacten.put("Jan", "123");
        contacten.put("Jos", "456");
        contacten.put("Jozef", "789");
    }

    public int telContacten() {
        return contacten.size();
    }

    public String zoekTelefoonnummerOp(String naam) {
        final String telNr  = contacten.get(naam);
        return this.contacten.getOrDefault(naam, "geen nummer");
    }

    public void voegContactToe(String naam, String telNr) {
        this.contacten.put(naam, telNr);
    }

    public boolean komtVoor(String naam) {
        return this.contacten.containsKey(naam);
    }

    public void alleNamen() {
        for (String naam : this.contacten.keySet()) {
            System.out.println(naam + ": " + this.contacten.get(naam));
        }
    }

}
