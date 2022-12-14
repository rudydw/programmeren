import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Scratch {
    public static void main(String[] args) {
//        int[] ints = {1,2,3,4,5,6,7,8,9};
//        List<Integer> integers = (List<Integer>) Arrays.asList(ints);

        int[] cijfers = {1, 5, 7, 8, 4, 2};
        System.out.println(Arrays.toString(cijfers));
        Arrays.sort(cijfers);
        System.out.println(Arrays.toString(cijfers));
        Arrays.parallelSort(cijfers);
        System.out.println(Arrays.toString(cijfers));

        List ints = Arrays.asList(cijfers);
        ArrayList<Integer> intsAL = new ArrayList<>(ints);

        intsAL.add(10);
        System.out.println(intsAL);

//        String[] geeks = {"Rahul", "Utkarsh",
//                "Shubham", "Neelam"};
//
//        // Conversion of array to ArrayList
//        // using Arrays.asList
//        List al = Arrays.asList(geeks);

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextBoolean());

        }
    }
}
