package collection;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Asem");
        list.add("Talgat");
        list.add("Tima");
        list.add("Jesica");
        list.add("Gorge");
        list.add("Alex");
        list.add("Vika");
        list.add("Vasya");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
//        System.out.println(list.get(i));
        }

        int a = 0;

        list.remove(1);
        int size = list.size();

        for (int j = 0; j < size; j++) {
            list.remove(0);
        }
        System.out.println(list);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);

        int i = numbers.get(0);

        ArrayList<Integer> list2 = new ArrayList();
        Random r = new Random();

        for (int j = 0; j < 100; j++) {
            list2.add(r.nextInt(100));

        }
        System.out.println(list2);

        System.out.println("Введите число ");
        Scanner in = new Scanner(System.in);
        int sum = 0;
        ArrayList<Integer> list3 = new ArrayList<>();

        int number1 = in.nextInt();
        for (int j = 0; j < list2.size(); j++) {
            if (number1 == list2.get(j)) {
                sum++;
               list3.add(j);
            }
        }
            System.out.println(sum);
            System.out.println(list3);

        for (int j = 0; j < sum; j++) {
            list2.remove(number1);

        }

        for (int j = 0; j < sum; j++) {
            list2.remove(list2.indexOf(list3));
        }
        System.out.println(list2.size());
        System.out.println(list2);

    }
}