package extraOef;

import java.util.Arrays;

//    Bereken de mediaan. Gebruik een 1-dim array.
//    Voorbeelden:
//    1, 2, 3, 4, 5, 6, 7, 8, 9
//    Mediaan is 5, het middelste getal. Links ervan zitten 4 getallen en rechts ervan zitten 4 getallen.
//    1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//    De middelste getallen zijn 5 en 6. Daar tussen moet de Mediaan zitten.
//    Je kunt dan doen: 5+6= 11 /2 is 5.5.
//    Dat is de Mediaan
public class Oef1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = arr2;
        int lengte = arr.length;
        if (lengte % 2 == 0) { // even aantal
            double med = (double) (arr[lengte / 2 - 1] + arr[lengte / 2]) / 2;
            System.out.println("De mediaan van " + Arrays.toString(arr) + " is " + med);
        } else { // oneven aantal
            System.out.println("De mediaan van " + Arrays.toString(arr) + " is " + arr[lengte / 2]);
        }
    }
}
