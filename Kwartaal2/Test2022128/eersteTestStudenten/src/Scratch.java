import java.util.ArrayList;

public class Scratch {
    public static void main(String[] args) {
//        System.out.println("tafel".substring(0, 1));
//        System.out.println("tafel".substring(0, 1) + "tafel".substring("tafel".length() - 1, "tafel".length()));
        String s = "ik ben hier";
       String[] woorden;
        woorden = s.split(" ");
        for (String w : woorden) {
            System.out.println(w);
        }
    }
}
