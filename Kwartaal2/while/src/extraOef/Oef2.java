package extraOef;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//    Bereken de standaarddeviatie. Gebruik een 1-dim array.
//    Voorbeeld : gegeven de getallenreeks 2, 4, 5, 5, 6, 7, 9, 10
//
//    1. Bereken het gemiddelde Xgem:
//    Xgem = (2+4+5+5+6+7+9+10) / 8 = 6
//
//    2. Bereken van elk getal (xi) de deviatie di:
//    di = xi - Xgem, dus alle deviaties zijn:
//    (2-6),(4-6),(5-6),(5-6),(6-6),(7-6),(9-6),(10-6)
//    => alle deviaties zijn dus: -4, -2, -1, -1, 0, 1, 3, 4
//
//    3. Neem nu van alle deviaties het kwadraat, deze zijn achtereenvolgens:
//    16, 4, 1, 1, 0, 1, 9, 16
//
//    4. Bereken nu het gemiddelde van al deze kwadraten:
//    => (16+4+1+1+0+1+9+16) / 8 = 6
//
//    5. Neem nu de wortel van dit gemiddelde
//    σ = √ ( ∑(d2 / n) ) = √6
public class Oef2 {
    public static void main(String[] args) {
        int[] lijst = {2, 4, 5, 5, 6, 7, 9, 10};
        int lengte = lijst.length;
        System.out.println("Het gemiddelde van " + Arrays.toString(lijst) +
                " is " + xGem(lijst, lengte));
        double[] deviaties = xDev(lijst, xGem(lijst, lengte), lengte);
        System.out.println("De deviaties van " + Arrays.toString(lijst) +
                " zijn " + Arrays.toString(deviaties));
        double[] kwadraten = devKwadraat(deviaties, lengte);
        System.out.println("De kwadraten van de deviaties zijn " +
                Arrays.toString(kwadraten));
        double kwGem = gemKwad(kwadraten, lengte);
        System.out.println("Het gemiddelde van deze kwadraten is " + kwGem);
        double wortel = Math.sqrt(kwGem);
        System.out.println("De wortel hiervan is " + wortel);
    }

    private static double gemKwad(double[] kwadraten, int lengte) {
        double avgKw;
        double som = 0;
        for (double x : kwadraten) {
            som += x;
        }
        return som / lengte;
    }

    private static double[] devKwadraat(double[] deviaties, int lengte) {
        double[] kwadraten = new double[lengte];
        for (int i = 0; i < lengte; i++) {
            kwadraten[i] = deviaties[i] * deviaties[i];
        }
        return kwadraten;
    }

    private static double[] xDev(int[] lijst, double gem, int lengte) {
        double[] result = new double[lengte];
        for (int i = 0; i < lengte; i++) {
            result[i] = lijst[i] - gem;
        }
        return result;
    }

    private static Double xGem(int[] lijst, int lengte) {
        double som = 0;
        for (int i = 0; i < lengte; i++) {
            som += lijst[i];
        }
        return som / lengte;
    }
}
