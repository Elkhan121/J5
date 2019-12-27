package collection;

import java.util.*;
import java.io.*;

public class HackerRank {

    //Complete this code or write your own from scratch

    static class Solution {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.nextLine();
                HashMap<String, Integer> names = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String name = in.nextLine();
                int phone = in.nextInt();
                in.nextLine();

                names.put("uncle Tom", 22121212);
                names.put("Idris", 870740273);
                names.put("Karim", 870755507);

            }
            while (in.hasNext()) {
                String s = in.nextLine();
                if (names.get(s) == null){
                    System.out.println("Not found");
                } else {
                    System.out.println(names.get(s));
                }
            }
        }
    }
}
