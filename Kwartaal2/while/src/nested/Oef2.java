package nested;
// 1 2 3
// 4 5 6
// 7 8 9
// 10 11 12
// 13 14 15

public class Oef2 {
    public static void main(String[] args) {
        for (int rij = 0; rij < 5 ; rij++) {
            for (int kolom = 1; kolom <= 3; kolom++) {
                System.out.print(rij * 3 + kolom + "\t");
            }
            System.out.println();
        }
    }
}
