package random.oef3;

import java.util.ArrayList;
import java.util.Random;

public class Trekking {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = 0;
        boolean dubbel = true;
        Random r = new Random();
        for (int i = 0; i < 7; i++) {
            while (dubbel) {
                num = r.nextInt(1, 46);
                dubbel = list.contains(num);
            }
            list.add(num);
            dubbel = true;
        }
        System.out.println(list.toString());
    }
}
