package samenvoegen;

import wachtrij.Wachtrij;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Samenvoegen {
//    private HashMap<String, String> samen = new HashMap<>();

    public HashMap<String, String> samenvoegen(HashMap<String, String> map1, HashMap<String, String> map2) {

        HashMap<String, String> samen = new HashMap<>();
        for (String keyInMap1 : map1.keySet()) {
            String valueOfKeyMap1 = map1.get(keyInMap1);
            if (map2.containsKey(valueOfKeyMap1)) {
                samen.put(keyInMap1, map2.get(valueOfKeyMap1));
            }
        }
        return samen;



//        map1.put("a", "b");
//        map2.put("b", "c");
//        //wordt in samen ("a", "c")
//        //
//        map1.put("d", "e");
//        map2.put("e", "f");
//        //wordt in samen ("d", "f")
//        map1.put("g", "h");
//        map2.put("i", "j");
//        //wordt geen paar in samen want "h" is niet gelijk aan "i"

    }
}
