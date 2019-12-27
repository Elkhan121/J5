package collection;

import java.util.HashMap;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            String word = in.next();
            if (map.containsKey(word)) {
                Integer value = map.get(word);
                map.put(word, value + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);


        HashMap<String, String> word = new HashMap<>();

        word.put("а", "a");
        word.put("б", "b");
        word.put("в", "v");
        word.put("г", "g");
        word.put("д", "d");
        word.put("е", "e");
        word.put("ж", "zh");
        word.put("з", "z");
        word.put("и", "i");
        word.put("к", "k");
        word.put("л", "l");
        word.put("м", "m");
        word.put("н", "n");
        word.put("о", "o");
        word.put("п", "p");
        word.put("р", "r");
        word.put("с", "s");
        word.put("т", "t");

        String words = in.next();

        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);

            String str = word.get(ch + "");

            System.out.print(str);
        }
    }
}