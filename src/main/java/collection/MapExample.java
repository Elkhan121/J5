package collection;

import java.util.HashMap;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("zero", 0);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("one"));
        System.out.println(map.containsKey("one"));
        System.out.println(map.containsValue(2));
//        System.out.println(map.get("three"));

        Set<String> keys = map.keySet();
        for (String k : keys) {
            Integer value = map.get(k);
            System.out.println(k + " - " + value);


        }

    }

}
