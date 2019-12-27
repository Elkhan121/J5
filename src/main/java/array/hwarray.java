package array;

import java.util.Random;
import java.util.Scanner;

public class hwarray {
    public static void main(String[] args) {
        Random r = new Random(2);

//        int ar[][] = new int[2][3];
//        for (int i = 0; i < ar[0].length ; i++) {
//            ar[0][i] = r.nextInt(21) - 10;
//        }
//        for (int i = 0; i < ar.length; i++) {
//            for (int j = 0; j < ar[i].length; j++) {
//            ar[1][j] = ar[0][j];
//                System.out.print(ar[i][j] + " ");
//
//            }
//            System.out.println();
//        }
        double goods[] = new double[]{
                2.98, 4.5, 9.98, 4.49, 6.87
        };
        Scanner in = new Scanner(System.in);

        double totalSum = 0;
        int totalGoodsAmount = 0;

        boolean running = true;
        while (running) {

            int goodNumber = in.nextInt();
            if (goodNumber == 0) {
                running = false;
            } else {
                int amount = in.nextInt();

                totalGoodsAmount += amount;
                totalSum += goods[goodNumber - 1] * amount;
            }
        }
        System.out.println("Общее кол-во товара : " + totalGoodsAmount);
        System.out.println("Общая сумма продаж : " + totalSum);
    }

    public static class array2 {
        public static void main(String[] args) {

            int ar2[][] = new int[3][];

            int t[] = new int[10];
            for (int i = 0; i <t.length ; i++) {
                t[i] = i;
            }


            ar2[0] = new int[4];
            ar2[1] = new int[2];
            ar2[2] = t;

            for (int k = 0; k < ar2.length ; k++) {
                for (int j = 0; j < ar2[k].length ; j++) {
                    System.out.print(ar2[k][j] + " ");
                }
                System.out.println();

                System.out.println(Integer.MAX_VALUE);
            }

        }
    }
}