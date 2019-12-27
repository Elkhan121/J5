package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Collections.shuffle(list);
        System.out.println(list);

        Random r = new Random();

        for (int i = 0; i < list.size() - 1; i++) {
        int a = r.nextInt(5);
        int b = r.nextInt(5);
            Collections.swap(list, b , a);
        }
        System.out.println(list);

    }
}
