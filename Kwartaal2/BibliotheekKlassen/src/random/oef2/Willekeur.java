package random.oef2;

import java.util.Random;

public class Willekeur {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[20];
        for (int i = 0; i < 100; i++) {
            a[r.nextInt(10, 20)]++;
        }
        int ind = 0;
        for (int n : a) {
            System.out.println(ind + ": " + n);
            ind++;
        }
    }

}
