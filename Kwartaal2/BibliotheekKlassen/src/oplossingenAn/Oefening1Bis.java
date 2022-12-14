package oplossingenAn;

import java.util.ArrayList;
import java.util.Random;

public class Oefening1Bis {
    public Oefening1Bis()
    {

    }
    public int genereerGetal(int max)
    {
        Random r = new Random();
        return r.nextInt(max)+1;
    }
    public int genereerGetalMinMax(int min, int max)
    {
// 5 en 10
        Random r = new Random();
//        for (int i = 0; i < 20; i++) {
//            System.out.println(r.nextInt(min,max+1));
//        }
        return r.nextInt(min,max+1);
    }
    public ArrayList<Integer> trekking()
    {

        ArrayList<Integer> getallen = new ArrayList<>();
        //als ik nu een getal van type int, met add in de list zet, dan wordt dit een
        //"object" van type Integer
        int getal = genereerGetalMinMax(1, 45);
        getallen.add(getal);
        for (int i = 0; i < 6; i++) {
            getal = genereerGetalMinMax(1, 45);
            while(getallen.contains(getal))
            {
                getal = genereerGetalMinMax(1, 45);
            }
            getallen.add(getal);
        }
        System.out.println(getallen.get(getallen.size()-1));
        return getallen;
    }

}
